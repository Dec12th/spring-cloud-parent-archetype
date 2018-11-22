package com.benny.november.business.common.dal.persistant;

import lombok.Data;

import javax.persistence.*;

/**
 * @author yin.beibei
 * @date 2018/11/22 13:57
 */
@Data
@Entity
@Table(name = "t_user2")
public class UserPO {
    @Id
    @Column(name="id",nullable = false)
    @GeneratedValue
    private Long id;

    @Column(name = "user_name")
    private String userName;

    @Column
    private String name;

    @Column
    private String password;
}
