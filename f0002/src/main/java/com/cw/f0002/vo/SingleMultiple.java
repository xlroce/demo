package com.cw.f0002.vo;

import com.cw.f0002.entity.TMultiple;
import com.cw.f0002.entity.TSingle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

/**
 * @author Lao SiCheng
 * @version 0.1
 */
@Data
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler"})
public class SingleMultiple extends TSingle {

    private List<TMultiple> multipleList;

}
