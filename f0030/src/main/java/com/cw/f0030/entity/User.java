package com.cw.f0030.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author Lao SiCheng
 * @version 0.1
 */
@Data
public class User {
    private int id;
    private String username;
    private int age;
    private Date ctm;
}
