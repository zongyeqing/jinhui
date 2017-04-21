package com.jinhui_admin.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jinhui.mapper.PackMapper;
import com.jinhui.po.Pack;
import com.jinhui.po.PackExample;
import com.jinhui.vo.EUDataGridResult;
import com.jinhui.vo.Result;
import com.jinhui_admin.service.PackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zong on 2017/4/20.
 */
@Service
public class PackServiceImpl implements PackService{
    @Autowired
    private PackMapper packMapper;
    @Override
    public Result addPack(Pack pack) {
        PackExample packExample=new PackExample();
        int row=packMapper.insertSelective(pack);
        if(row>0){
            return Result.ok();
        }
        return Result.build(200,"添加新套餐错误",null);
    }

    @Override
    public EUDataGridResult findALlPack(int page,int rows) {
        //查询商品列表
        PackExample packExample = new PackExample();
        //分页处理
        PageHelper.startPage(page,rows);
        List<Pack> packs= packMapper.selectByExample(packExample);
        //创建一个返回值对象
        EUDataGridResult euDataGridResult = new EUDataGridResult();
        euDataGridResult.setRows(packs);
        //取记录总条数
        PageInfo<Pack> pageInfo=new PageInfo<Pack>(packs);
        euDataGridResult.setTotal(pageInfo.getTotal());
        return euDataGridResult;
    }
}
