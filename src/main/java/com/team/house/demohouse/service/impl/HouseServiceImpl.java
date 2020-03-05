package com.team.house.demohouse.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.team.house.demohouse.entity.House;
import com.team.house.demohouse.mapper.HouseMapper;
import com.team.house.demohouse.service.HouseService;
import com.team.house.demohouse.util.HouseConndition;
import com.team.house.demohouse.util.PagePrameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HouseServiceImpl  implements HouseService {
    @Autowired(required = false)
    private HouseMapper houseMapper;

    @Override
    public int addHouse(House house) {
        return houseMapper.insertSelective(house);
    }

    @Override
    public PageInfo<House> getHouseByUserId(Integer uid, PagePrameter pagePrameter) {
      //开启分页
        PageHelper.startPage(pagePrameter.getPage(),pagePrameter.getPageSize());
        //查询所有
        List<House>  list=houseMapper.getHouseByUser(uid);
        //返回分页相关信息
        return  new PageInfo<>(list);
    }

    @Override
    public PageInfo<House> getBroswerHouse(HouseConndition houseConndition) {
        PageHelper.startPage(houseConndition.getPage(),houseConndition.getPageSize());
        List<House> list=  houseMapper.getBroswerHouse(houseConndition);

        return new PageInfo<>(list);
    }
}
