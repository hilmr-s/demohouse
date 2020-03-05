package com.team.house.demohouse;

import com.team.house.demohouse.entity.District;
import com.team.house.demohouse.entity.DistrictExample;
import com.team.house.demohouse.mapper.DistrictMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemohouseApplicationTests {

    //注入mapper对象
    @Autowired(required = false)
    private DistrictMapper districtMapper;
    @Test
    public void contextLoads() {
        List<District> list=districtMapper.selectByExample(new DistrictExample());
        System.out.println("总数是:"+list.size());
    }

}
