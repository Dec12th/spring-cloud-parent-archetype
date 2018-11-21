package com.benny.november.controller;

import com.benny.archetype.business.api.DemoFacade;
import com.benny.archetype.business.api.request.UserQueryRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yin.beibei
 * @date 2018/11/21 10:30
 */
@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    private DemoFacade demoFacade;

    @ResponseBody
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        UserQueryRequest request = new UserQueryRequest();
        request.setId(1);
        return demoFacade.queryUser(request).toString();
    }
}
