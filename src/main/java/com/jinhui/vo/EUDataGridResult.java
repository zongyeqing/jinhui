package com.jinhui.vo;

import java.util.List;

/**
 * Created by zong on 2017/4/22.
 */
public class EUDataGridResult {
    private long total;
    private List<?> rows;

    public long getTotal(){
        return  total;
    }

    public void setTotal(long total){
        this.total=total;
    }

    public List<?> getRows(){
        return rows;
    }

    public void setRows(List<?> rows){
        this.rows=rows;
    }
}
