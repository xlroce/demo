package com.cw.f0001;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan("com.cw.f0001.dao")
@EnableSwagger2
public class F0001Application {

    public static void main(String[] args) {
        SpringApplication.run(F0001Application.class, args);
    }

}
