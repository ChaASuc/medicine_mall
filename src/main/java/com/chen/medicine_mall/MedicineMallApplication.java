package com.chen.medicine_mall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.chen.medicine_mall.mapper")
public class MedicineMallApplication {

    public static void main(String[] args) {
        SpringApplication.run(MedicineMallApplication.class, args);
    }

}

