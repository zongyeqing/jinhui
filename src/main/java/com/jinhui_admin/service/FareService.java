package com.jinhui_admin.service;

import com.jinhui.exception.MyException;
import com.jinhui.vo.EUDataGridResult;

/**
 * Created by zong on 2017/4/22.
 */
public interface FareService {
    public EUDataGridResult findFareSummaryByMonth(int page,int reows,int year,int momth);
    public EUDataGridResult refreshAllFareSummary() throws MyException;
}
