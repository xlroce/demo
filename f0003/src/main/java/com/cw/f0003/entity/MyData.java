package com.cw.f0003.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import springfox.documentation.annotations.ApiIgnore;

import java.io.Serializable;

/**
 * @author Lao SiCheng
 * @version 0.1
 */
@Data
public class MyData implements Serializable {

    @ApiModelProperty(hidden = true)
    private Integer id;
    private String value;
}
