package com.cw.f0001.service.impl;

import com.cw.f0001.dao.SingleMapper;
import com.cw.f0001.entity.TSingle;
import com.cw.f0001.service.SingleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Lao SiCheng
 * @version 0.1
 */
@Service
public class SingleServiceImpl implements SingleService {

    @Resource
    SingleMapper singleMapper;
    @Override
    public TSingle getSingle(Integer id) {
        return singleMapper.getSingleById(id);
    }
}
