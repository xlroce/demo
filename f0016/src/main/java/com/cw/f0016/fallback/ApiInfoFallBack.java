package com.cw.f0016.fallback;

import com.cw.f0016.service.ApiInfoClient;
import org.springframework.stereotype.Component;

/**
 * @author Lao SiCheng
 * @version 0.1
 */
@Component
public class ApiInfoFallBack implements ApiInfoClient {
    @Override
    public String getApiInfo(Integer id) {
        System.out.println("123");
        return "fall back";
    }
}
