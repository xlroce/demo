package com.cw.f0003.service.impl;

import com.cw.f0003.entity.MyData;
import com.cw.f0003.service.MyDataService;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * 使用redis进行缓存数据
 * @author Lao SiCheng
 * @version 0.1
 */
@Service
//@CacheConfig(cacheNames = "myData")
public class MyDataServiceImpl implements MyDataService {
    Map<Integer, MyData> map = new HashMap<>(12);

    @Cacheable(value = "myData")
    @Override
    public MyData getData(Integer id) {
        return get(id);
    }

    @CachePut(value = "myData",key = "#myData.id")
    @Override
    public MyData updateData(MyData myData) {
        update(myData);
        return myData;
    }

    @CachePut(value = "myData",key = "#myData.id")
    @Override
    public MyData saveData(MyData myData) {
        save(myData);
        return myData;
    }

    @CacheEvict(value = "myData")
    @Override
    public int deleteData(Integer id) {
        delete(id);
        return 0;
    }


    private MyData get(Integer id){
        MyData myData = map.get(id);
        System.out.println("查询来了");

        return myData;
    }


    private int save(MyData myData){
        Integer size = map.size() + 1;
        map.put(size, myData);
        myData.setId(size);
        System.out.println("保存来了");
        return myData.getId();
    }

    private int delete(Integer id){
        map.remove(id);
        System.out.println("删除来了");
        return id;
    }
    private MyData update(MyData myData){
        map.put(myData.getId(), myData);
        System.out.println("更新来了");
        return myData;
    }
}
