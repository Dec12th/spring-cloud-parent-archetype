package com.benny.november.business.web.info;

import lombok.Data;

import java.io.Serializable;

/**
 * @author yin.beibei
 * @date 2018/11/22 16:29
 */
@Data
public class UserInfo implements Serializable {
    private static final long serialVersionUID = -7848038588017242230L;
    private Long id;

    private String userName;

    private String name;

    private String password;
}
