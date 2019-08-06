package com.cw.f0003.service;

import com.cw.f0003.entity.MyData;

/**
 * @author Lao SiCheng
 * @version 0.1
 */
public interface MyDataService {

    MyData getData(Integer id);

    MyData updateData(MyData myData);

    MyData saveData(MyData myData);

    int deleteData(Integer id);
}
