package com.cw.f0015.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Lao SiCheng
 * @version 0.1
 */

@RestController
public class ApiController {

    @GetMapping("/{id}/info")
    public String getApiInfo(@PathVariable("id") Integer id){
        return "id = " + id;
    }
}
