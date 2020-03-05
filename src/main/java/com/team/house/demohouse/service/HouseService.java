package com.team.house.demohouse.service;

import com.github.pagehelper.PageInfo;
import com.team.house.demohouse.entity.House;
import com.team.house.demohouse.util.HouseConndition;
import com.team.house.demohouse.util.PagePrameter;

public interface HouseService {
    //发布出租房
    public  int addHouse(House house);

    //查询某用户下所有出租房支持分页   传页码 页大小 返回 pageinfo
    public PageInfo<House> getHouseByUserId(Integer uid, PagePrameter pagePrameter);



    public  PageInfo<House>  getBroswerHouse(HouseConndition houseConndition);

}
