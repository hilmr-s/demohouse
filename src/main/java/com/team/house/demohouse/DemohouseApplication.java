package com.team.house.demohouse;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.team.house.demohouse.mapper")
public class DemohouseApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemohouseApplication.class, args);
    }

}
