package com.jinhui.po;

import java.util.Date;

public class Record {
    private Long id;

    private Long userId;

    private Integer type;

    private Float sumTime;

    private Date time;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Float getSumTime() {
        return sumTime;
    }

    public void setSumTime(Float sumTime) {
        this.sumTime = sumTime;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}