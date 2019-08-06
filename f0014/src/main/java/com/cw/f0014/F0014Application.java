package com.cw.f0014;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class F0014Application {

    public static void main(String[] args) {
        SpringApplication.run(F0014Application.class, args);
    }

}
