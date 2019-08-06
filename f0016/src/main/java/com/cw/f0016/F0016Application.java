package com.cw.f0016;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableFeignClients
@EnableHystrix
@EnableHystrixDashboard
@EnableDiscoveryClient
public class F0016Application {

    public static void main(String[] args) {
        SpringApplication.run(F0016Application.class, args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){

        return new RestTemplate();
    }

}
