package com.jinhui_admin.controller;

import com.jinhui.exception.MyException;
import com.jinhui.vo.EUDataGridResult;
import com.jinhui_admin.service.FareService;
import com.jinhui_admin.service.PackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Calendar;

/**
 * Created by zong on 2017/4/22.
 */
@Controller
@RequestMapping("/fare")
public class FareController {

    @Autowired
    FareService fareService;

    @RequestMapping("/summary")
    @ResponseBody
    public EUDataGridResult findFareSummary(@RequestParam(defaultValue = "1",required = true) Integer page,
                                            @RequestParam(defaultValue = "20",required = true) Integer rows,
                                            Integer year,
                                            Integer month) {
        Calendar cal=Calendar.getInstance();
        if(year==null){
            year=cal.get(Calendar.YEAR);
        }
        if(month==null){
            month=cal.get(Calendar.MONTH)+1;
        }

        return fareService.findFareSummaryByMonth(page,rows,year,month);
    }

    @RequestMapping("/refresh")
    @ResponseBody
    public EUDataGridResult refresh(){
        try{
            return  fareService.refreshAllFareSummary();
        }catch (MyException e){
            System.out.println(e.getMessage());
        }
        return new EUDataGridResult();
    }
}
