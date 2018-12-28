package com.benny.november.business.web.controller;

import com.benny.november.business.common.dal.persistant.UserPO;
import com.benny.november.business.common.dal.repository.UserRepository;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.sql.SQLException;

import static org.slf4j.LoggerFactory.getLogger;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * @author yin.beibei
 * @date 2018/11/22 11:08
 */
@RestController
@RequestMapping("test")
public class TestDataSource {

    private static final Logger logger = getLogger(TestDataSource.class);

    @Autowired
    private DataSource dataSource;

    @Autowired
    private UserRepository userRepository;

    @ResponseBody
    @RequestMapping(value = "/hello", method = GET)
    public String test() throws SQLException {
        logger.info("datasource is null:{}",dataSource==null);
        return dataSource==null?"null":dataSource.getConnection().getClientInfo().toString();
    }

    @ResponseBody
    @RequestMapping(value = "/jpa", method = GET)
    public String jpa() {
        UserPO userPO = new UserPO();
        userPO.setName("测试");
        userPO.setPassword("123456");
        userPO.setUserName("测试");
        UserPO result = userRepository.save(userPO);
        return result.getId().toString();
    }
}
