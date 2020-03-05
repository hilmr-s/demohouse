package com.team.house.demohouse.service.impl;


import com.team.house.demohouse.entity.Street;
import com.team.house.demohouse.entity.StreetExample;
import com.team.house.demohouse.mapper.StreetMapper;
import com.team.house.demohouse.service.StreetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StreetServiceImpl   implements StreetService {
    @Autowired(required = false)
    private StreetMapper streetMapper;

    @Override
    public List<Street> getStreetByDid(Integer did) {
        StreetExample streetExample=new StreetExample();
        StreetExample.Criteria criteria=streetExample.createCriteria();
        criteria.andDistrictIdEqualTo(did);
        return streetMapper.selectByExample(streetExample);
    }
}
