package com.cw.f0016.controller;

import com.cw.f0016.service.ApiInfoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Lao SiCheng
 * @version 0.1
 */

@RestController
public class ClientController {

    @Autowired
    ApiInfoClient apiInfoClient;


    @GetMapping("/client")
    public String client(){
        return apiInfoClient.getApiInfo(1);
    }
}
