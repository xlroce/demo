package com.cw.f0002.service.impl;

import com.cw.f0002.dao.SingleMultipleMapper;
import com.cw.f0002.service.SingleMultipleService;
import com.cw.f0002.vo.SingleMultiple;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Lao SiCheng
 * @version 0.1
 */
@Service
public class SingleMultipleServiceImpl implements SingleMultipleService {

    @Resource
    SingleMultipleMapper singleMultipleMapper;
    @Override
    public SingleMultiple getSingleMultiple(Integer id) {
        return singleMultipleMapper.getSingleByIdWithMultiple(id);
    }
}
