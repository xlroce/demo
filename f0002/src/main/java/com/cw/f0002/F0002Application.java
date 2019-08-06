package com.cw.f0002;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cw.f0002.dao")
public class F0002Application {

    public static void main(String[] args) {
        SpringApplication.run(F0002Application.class, args);
    }

}
