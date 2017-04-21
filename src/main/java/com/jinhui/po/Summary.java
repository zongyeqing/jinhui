package com.jinhui.po;

import java.util.Date;

public class Summary {
    private Long id;

    private Long userId;

    private Float conversation;

    private Float message;

    private Float dataTraffic;

    private Float conversationPrice;

    private Float messagePrice;

    private Float dataTrafficPrice;

    private Date startTime;

    private Date endTime;

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

    public Float getConversation() {
        return conversation;
    }

    public void setConversation(Float conversation) {
        this.conversation = conversation;
    }

    public Float getMessage() {
        return message;
    }

    public void setMessage(Float message) {
        this.message = message;
    }

    public Float getDataTraffic() {
        return dataTraffic;
    }

    public void setDataTraffic(Float dataTraffic) {
        this.dataTraffic = dataTraffic;
    }

    public Float getConversationPrice() {
        return conversationPrice;
    }

    public void setConversationPrice(Float conversationPrice) {
        this.conversationPrice = conversationPrice;
    }

    public Float getMessagePrice() {
        return messagePrice;
    }

    public void setMessagePrice(Float messagePrice) {
        this.messagePrice = messagePrice;
    }

    public Float getDataTrafficPrice() {
        return dataTrafficPrice;
    }

    public void setDataTrafficPrice(Float dataTrafficPrice) {
        this.dataTrafficPrice = dataTrafficPrice;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}