package com.benny.november.business.biz.impl;

import com.benny.november.business.api.DemoFacade;
import com.benny.november.business.api.info.UserInfo;
import com.benny.november.business.api.request.UserQueryRequest;
import com.benny.november.business.api.result.UserQueryResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author yin.beibei
 * @date 2018/11/19 16:03
 */
@Service("demoFacade")
public class DemoFacadeImpl implements DemoFacade {

    private static final Logger logger = LoggerFactory.getLogger(DemoFacadeImpl.class);
    @Override
    public UserQueryResult queryUser(@RequestBody UserQueryRequest request) {
        logger.info("queryUser request:{}",request.getId());
        UserQueryResult result = new UserQueryResult();
        UserInfo userInfo = new UserInfo();
        userInfo.setId(request.getId());
        userInfo.setUserName("测试");
        userInfo.setAge(18);
        result.setUserInfo(userInfo);
        return result;
    }
}
