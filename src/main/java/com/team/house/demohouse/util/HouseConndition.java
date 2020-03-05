package com.team.house.demohouse.util;

public class HouseConndition extends  PagePrameter{
    //一个属性一个条件
    private  String  title;// 标题
    private  Integer did;
    private  Integer tid;
    private  Long startPrice; //开始价格
    private  Long endPrice;  //结束价格


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Long getStartPrice() {
        return startPrice;
    }

    public void setStartPrice(Long startPrice) {
        this.startPrice = startPrice;
    }

    public Long getEndPrice() {
        return endPrice;
    }

    public void setEndPrice(Long endPrice) {
        this.endPrice = endPrice;
    }
}
