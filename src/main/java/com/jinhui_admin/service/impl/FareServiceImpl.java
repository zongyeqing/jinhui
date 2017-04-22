package com.jinhui_admin.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jinhui.exception.MyException;
import com.jinhui.mapper.*;
import com.jinhui.po.*;
import com.jinhui.vo.EUDataGridResult;
import com.jinhui.vo.RecordSummaryResult;
import com.jinhui_admin.service.FareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.*;

import static com.sun.org.apache.xml.internal.security.keys.keyresolver.KeyResolver.iterator;

/**
 * Created by zong on 2017/4/22.
 */
@Service
public class FareServiceImpl implements FareService{

    @Autowired
    private SummaryMapper summaryMapper;
    @Autowired
    private PackMapper packMapper;
    @Autowired
    private RecordMapper recordMapper;
    @Autowired
    private UserpackageMapper userpackageMpaper;
    @Autowired
    private UserMapper userMapper;
    @Override
    public EUDataGridResult findFareSummaryByMonth(int page,int rows,int year,int month) {
        SummaryExample summaryExample=new SummaryExample();
        //获得当前月的第一天
        Date date=getDayOfCurrentMonth(year,month,1);
        summaryExample.createCriteria().andStartTimeEqualTo(date);

        //分页处理
        PageHelper.startPage(page,rows);
        List<Summary> summaryList=summaryMapper.selectByExample(summaryExample);
        //创建一个返回值对象
        EUDataGridResult euDataGridResult=new EUDataGridResult();
        euDataGridResult.setRows(summaryList);
        PageInfo<Summary> pageInfo=new PageInfo<Summary>(summaryList);
        euDataGridResult.setTotal(pageInfo.getTotal());

        return euDataGridResult;
    }

    @Override
    public EUDataGridResult refreshAllFareSummary() throws MyException{
        //获得当前月第一天
        Calendar calendar=Calendar.getInstance();
        Date firstDayOfCurrentMonth=getDayOfCurrentMonth(calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH),1);
        //获得下个月的第一天
        calendar.set(calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH),1);
        calendar.add(Calendar.MONTH,1);
        Date firstDayOfNextMonth=getDayOfCurrentMonth(calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH)+1,1);
        //拿到所有用户的本月通话记录
        RecordExample recordExample=new RecordExample();
        recordExample.createCriteria().andTimeBetween(firstDayOfCurrentMonth,firstDayOfNextMonth);
        List<Record> recordList = recordMapper.selectByExample(recordExample);

        List<RecordSummaryResult> recordSummaryResults=new ArrayList<RecordSummaryResult>();
        //用户对应记录的列表
        Map<Long,List> userMapList=new HashMap<Long,List>();
        for(Record record:recordList){
            Long userId=record.getUserId();
            if(!userMapList.containsKey(userId))
                userMapList.put(userId, new ArrayList());

            userMapList.get(userId).add(record);
        }

        //统计所有用户的话费，将统计结果放入recordSummaryResults中
        for(Map.Entry<Long,List> entry:userMapList.entrySet()){
            //创建一个recordSummary
            RecordSummaryResult recordSummaryResult = new RecordSummaryResult();

            Long userId=entry.getKey();
            //取出用户
            User user=userMapper.selectByPrimaryKey(userId);
            if(user==null)
                throw new MyException("没有取得用户id为："+userId+"的用户");
            recordSummaryResult.setUser(user);

            //取出用户的套餐
            UserpackageExample userpackageExample=new UserpackageExample();
            List<Userpackage> userpackages=userpackageMpaper.selectByExample(userpackageExample);
            if(userpackages==null||userpackages.size()==0)
                throw new MyException("没有取到用户id为"+userId+"的套餐包");

            //取对应的套餐包信息
            Pack pack=packMapper.selectByPrimaryKey(userpackages.get(0).getPackageId());
            if(pack==null)
                throw new MyException("没有取到用户id为"+userId+"的套餐包信息");
            recordSummaryResult.setPack(pack);

            //用户的记录
            List<Record> records=entry.getValue();
            recordSummaryResult.setRecords(records);
            try{
                recordSummaryResult.generateSummary();
            }catch (Exception e){
                throw new MyException("统计用户话费时失败");
            }

            recordSummaryResults.add(recordSummaryResult);
        }

        List<SummaryExtend> summaryExtends=new ArrayList<SummaryExtend>();
        for(RecordSummaryResult recordSummaryResult:recordSummaryResults){
            SummaryExtend summaryExtend=recordSummaryResult.toSummaryResult();
            summaryExtends.add(summaryExtend);
        }
        PageInfo<SummaryExtend> pageInfo=new PageInfo<SummaryExtend>(summaryExtends);

        EUDataGridResult euDataGridResult=new EUDataGridResult();
        euDataGridResult.setTotal(pageInfo.getTotal());
        if(euDataGridResult.getTotal()>10)
            euDataGridResult.setRows(summaryExtends.subList(0,10));
        else
            euDataGridResult.setRows(summaryExtends);


        //更新数据库
        for(RecordSummaryResult recordSummaryResult:recordSummaryResults){
            Summary summary=recordSummaryResult.getSummary();
            Calendar calendar1=Calendar.getInstance();
            Date startTime=getDayOfCurrentMonth(calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH),1);

            SummaryExample summaryExample = new SummaryExample();
            summaryExample.createCriteria().andStartTimeEqualTo(startTime);
            int infulenceRows=summaryMapper.deleteByExample(summaryExample);
            if(infulenceRows>0)
                summaryMapper.insert(summary);
            else {
                summaryExample.clear();
                summaryExample.createCriteria().andUserIdEqualTo(recordSummaryResult.getUser().getId());
                summaryMapper.updateByExample(summary,summaryExample);
            }
        }

        return euDataGridResult;
    }

    private Date getCurreintTime(){
        Calendar calendar=Calendar.getInstance();
        return new Date(calendar.get(Calendar.YEAR)-1900,calendar.get(Calendar.MONTH),calendar.get(Calendar.DAY_OF_MONTH));
    }

    private Date getDayOfCurrentMonth(int year,int month,int day){
        Calendar calendar=Calendar.getInstance();
        calendar.set(year,month-1,day);
        Date date=new Date(calendar.get(Calendar.YEAR)-1900,calendar.get(Calendar.MONTH),calendar.get(Calendar.DAY_OF_MONTH));
        return date;
    }
}
