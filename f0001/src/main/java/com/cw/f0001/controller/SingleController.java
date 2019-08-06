package com.cw.f0001.controller;

import com.cw.f0001.entity.TSingle;
import com.cw.f0001.service.SingleService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.models.HttpMethod;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * CRUD 测试控制器
 * @author Lao SiCheng
 * @version 0.1
 */

@RestController
//@RequestMapping("/test")
public class SingleController {

    @Autowired
    private SingleService singleService;

    @GetMapping("/{id}/single")
    public String getSingle(@PathVariable("id") Integer id){
        // todo check data
        TSingle single = singleService.getSingle(id);

        return single.getField();
    }

    @RequestMapping(value = "/get",method = RequestMethod.POST, consumes = "text/plain")
//    @ApiImplicitParam(name="student", value = "查询", paramType = "Student", dataType = "body")
    public Student get(Student student){


        return student;
    }
}
@Data
class Student{
    Integer id;
    String name;
        }