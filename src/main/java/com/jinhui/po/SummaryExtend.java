package com.jinhui.po;

/**
 * Created by zong on 2017/4/22.
 */
public class SummaryExtend extends Summary {
    private String userPhone;//用户号码
    private float sumFare;//总费用

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public float getSumFare() {
        return sumFare;
    }

    public void setSumFare(float sumFare) {
        this.sumFare = sumFare;
    }
}
