package com.cw.f0002.dao;

import com.cw.f0002.entity.TMultiple;
import com.cw.f0002.entity.TSingle;

import java.util.List;

/**
 * @author Lao SiCheng
 * @version 0.1
 */
public interface MultipleMapper {

    TMultiple getMultipleById(Integer id);

    List<TMultiple> getMultipleBySingleId(Integer id);
}
