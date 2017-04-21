package com.jinhui.po;

public class Pack {
    private Long id;

    private Integer conversation;

    private Integer message;

    private Integer dateTraffic;

    private Float unitConversation;

    private Float unitMessage;

    private Float unitDateTraffic;

    private String description;

    private String title;

    private String type;

    private Float price;

    private String picture;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getConversation() {
        return conversation;
    }

    public void setConversation(Integer conversation) {
        this.conversation = conversation;
    }

    public Integer getMessage() {
        return message;
    }

    public void setMessage(Integer message) {
        this.message = message;
    }

    public Integer getDateTraffic() {
        return dateTraffic;
    }

    public void setDateTraffic(Integer dateTraffic) {
        this.dateTraffic = dateTraffic;
    }

    public Float getUnitConversation() {
        return unitConversation;
    }

    public void setUnitConversation(Float unitConversation) {
        this.unitConversation = unitConversation;
    }

    public Float getUnitMessage() {
        return unitMessage;
    }

    public void setUnitMessage(Float unitMessage) {
        this.unitMessage = unitMessage;
    }

    public Float getUnitDateTraffic() {
        return unitDateTraffic;
    }

    public void setUnitDateTraffic(Float unitDateTraffic) {
        this.unitDateTraffic = unitDateTraffic;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }
}