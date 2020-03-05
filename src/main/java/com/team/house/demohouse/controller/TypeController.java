package com.team.house.demohouse.controller;

import com.team.house.demohouse.entity.Type;
import com.team.house.demohouse.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TypeController {
    @Autowired
    private TypeService typeService;

    @CrossOrigin(value = "*")
    @RequestMapping("/getType")
    public List<Type> getTypes(){
        return typeService.getAllType();
    }
}
