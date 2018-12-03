package com.benny.november.business.domain.service.impl;

import com.benny.november.business.AbstractIntegrationTest;
import com.benny.november.business.common.dal.repository.UserRepository;
import com.benny.november.business.domain.convertor.UserConvertor;
import com.benny.november.business.domain.model.UserDO;
import com.benny.november.business.domain.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.stereotype.Service;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;

/**
 * @author yin.beibei
 * @date 2018/12/3 17:02
 */
public class UserServiceTest extends AbstractIntegrationTest {

    @Autowired
    private UserService userService;

    @Test
    public void saveUser() {
        UserDO userDO = generalUserDO();
        userDO = userService.saveUser(userDO);
        Assert.assertNotNull(userDO);
        userDO.setName("修改-测试小米");
        Assert.assertSame(userService.update(userDO).getName(),"修改-测试小米");
    }

    @Test
    public void update() {
    }

    private UserDO generalUserDO(){
        UserDO userDO = new UserDO();
        userDO.setUserName("测试小米");
        userDO.setName("测试小米");
        userDO.setPassword("111111");
        return userDO;
    }
}
