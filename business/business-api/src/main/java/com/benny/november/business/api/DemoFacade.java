package com.benny.november.business.api;

import com.benny.framework.common.net.annotations.CommonNet;
import com.benny.november.business.api.request.UserQueryRequest;
import com.benny.november.business.api.result.UserQueryResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * api示例
 * @author yin.beibei
 * @date 2018/11/19 15:31
 */
@RestController
@RequestMapping("/business/user")
@CommonNet(appName = "business")
public interface DemoFacade {

    /**
     * 查询用户信息
     * @param request 请求参数
     * @return userQueryResult 返回参数
     */
    @RequestMapping(value = "queryUser", method = RequestMethod.POST)
    UserQueryResult queryUser(UserQueryRequest request);
}
