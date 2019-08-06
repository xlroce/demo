package com.cw.f0002.controller;

import com.cw.f0002.entity.TSingle;
import com.cw.f0002.service.SingleMultipleService;
import com.cw.f0002.vo.SingleMultiple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * CRUD 测试控制器
 * @author Lao SiCheng
 * @version 0.1
 */

@RestController
public class SingleMultipleController {

    @Autowired
    private SingleMultipleService singleMultipleService;

    @GetMapping("/{id}/single")
    public Object getSingleM(@PathVariable("id") Integer id){
        // todo check data
        SingleMultiple singleMultiple = singleMultipleService.getSingleMultiple(id);

        return singleMultiple;
    }
}
