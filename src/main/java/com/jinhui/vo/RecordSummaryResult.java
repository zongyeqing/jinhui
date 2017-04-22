package com.jinhui.vo;

import com.jinhui.exception.NullException;
import com.jinhui.po.*;
import org.apache.ibatis.jdbc.Null;

import java.util.List;

/**
 * Created by zong on 2017/4/22.
 */
public class RecordSummaryResult {
    private User user;
    private List<Record> records;
    private Summary summary;
    private Pack pack;

    public void generateSummary()throws Exception{
        float converSation=0f;
        float message=0f;
        float traffic=0f;
        for (Record record:records){
            switch (record.getType()){
                case 1:converSation+=record.getSumTime();break;
                case 2:message+=record.getSumTime();break;
                case 3:traffic+=record.getSumTime();break;
                default:break;
            }
        }

        if(pack==null)
            throw new NullException(pack);

        summary.setUserId(user.getId());
        //统计话费
        summary.setConversation(converSation);
        if(converSation<=pack.getConversation())
            summary.setConversationPrice(0f);
        else
            summary.setConversationPrice((converSation-pack.getConversation())*pack.getUnitConversation());

        //统计短信费用
        summary.setMessage(message);
        if(message<=pack.getMessage())
            summary.setMessagePrice(0f);
        else
            summary.setMessage((message-pack.getMessage())*pack.getUnitMessage());

        //统计数据流量费用
        summary.setDataTraffic(traffic);
        if(traffic<=pack.getDateTraffic())
            summary.setDataTrafficPrice(0f);
        else
            summary.setDataTrafficPrice((traffic-pack.getDateTraffic())*pack.getUnitDateTraffic());

    }

    public SummaryExtend toSummaryResult(){
        SummaryExtend summaryExtend=new SummaryExtend();
        summaryExtend.setUserId(this.user.getId());
        summaryExtend.setUserPhone(this.user.getPhonenum());
        summaryExtend.setConversation(this.summary.getConversation());
        summaryExtend.setConversationPrice(this.summary.getConversationPrice());
        summaryExtend.setMessage(this.summary.getMessage());
        summaryExtend.setMessagePrice(this.summary.getMessagePrice());
        summaryExtend.setDataTraffic(this.summary.getDataTraffic());
        summaryExtend.setDataTrafficPrice(this.summary.getDataTrafficPrice());
        summaryExtend.setSumFare(summaryExtend.getConversationPrice()+summaryExtend.getMessagePrice()+summaryExtend.getDataTrafficPrice()+this.pack.getPrice());
        return summaryExtend;
    }

    public Pack getPack() {
        return pack;
    }

    public void setPack(Pack pack) {
        this.pack = pack;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


    public List<Record> getRecords() {
        return records;
    }

    public void setRecords(List<Record> records) {
        this.records = records;
    }

    public Summary getSummary() {
        return summary;
    }

    public void setSummary(Summary summary) {
        this.summary = summary;
    }
}
