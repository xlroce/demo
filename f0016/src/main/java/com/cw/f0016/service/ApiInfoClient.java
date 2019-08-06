package com.cw.f0016.service;

import com.cw.f0016.fallback.ApiInfoFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Lao SiCheng
 * @version 0.1
 */
@FeignClient(value = "F0015", fallback = ApiInfoFallBack.class)
public interface ApiInfoClient {

    @GetMapping("/{id}/info")
    String getApiInfo(@PathVariable("id") Integer id);

}
