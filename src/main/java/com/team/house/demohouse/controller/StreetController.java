package com.team.house.demohouse.controller;


import com.team.house.demohouse.entity.Street;
import com.team.house.demohouse.service.StreetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StreetController {
    @Autowired
    private StreetService streetService;

    @RequestMapping("/getStreetByDid")  // 传递区域编号
    @CrossOrigin
    public List<Street>  getStreetByDid(Integer did){
        return streetService.getStreetByDid(did);
    }
}
