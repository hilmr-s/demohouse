package com.team.house.demohouse.service.impl;

import com.fasterxml.jackson.databind.annotation.JsonAppend;
import com.team.house.demohouse.entity.Type;
import com.team.house.demohouse.entity.TypeExample;
import com.team.house.demohouse.mapper.TypeMapper;
import com.team.house.demohouse.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeServiceImpl  implements TypeService {

    @Autowired(required = false)
    private TypeMapper typeMapper;

    @Override
    public List<Type> getAllType() {
        return typeMapper.selectByExample(new TypeExample());
    }
}
