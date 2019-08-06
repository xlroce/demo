package com.cw.f0016.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Lao SiCheng
 * @version 0.1
 */
//@Configuration
public class MyRibbonConfig {

//    @Bean
    public IRule ribbonRule(){
        return new RandomRule();
    }
}
