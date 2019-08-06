package com.cw.f0003.controller;

import com.cw.f0003.entity.MyData;
import com.cw.f0003.service.MyDataService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Lao SiCheng
 * @version 0.1
 */
@RestController
@Api(tags = {"f0003"})
public class f0003Controller {


    @Autowired
    MyDataService myDataService;

    @GetMapping("/get/{id}")
    public String getString(@PathVariable Integer id){
        MyData myData = myDataService.getData(id);

        return myData.getValue();
    }
    @PostMapping("/save")
    public Integer saveString(@RequestBody MyData myData){
        myDataService.saveData(myData);
        return myData.getId();
    }
    @PutMapping("/update/{id}")
    public Integer updateString(@PathVariable Integer id,@RequestBody MyData myData){
        myData.setId(id);
        myDataService.updateData(myData);
        return myData.getId();
    }
    @DeleteMapping("/delete/{id}")
    public Integer saveString(@PathVariable Integer id){
        myDataService.deleteData(id);
        return id;
    }
}
