package com.benny.november.business.web.controller;

import com.benny.framework.common.net.domain.ResultCallback;
import com.benny.november.business.api.DemoFacade;
import com.benny.november.business.api.info.UserInfo;
import com.benny.november.business.api.request.UserQueryRequest;
import com.benny.november.business.api.result.UserQueryResult;
import com.benny.november.business.api.result.UserSaveResult;
import com.benny.november.business.web.convertor.UserInfoConvertor;
import com.benny.november.business.web.request.UserSaveRequest;
import com.benny.november.business.web.response.UserQueryResponse;
import com.benny.november.business.web.response.UserSaveResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * @author yin.beibei
 * @date 2018/11/22 16:35
 */
@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    DemoFacade demoFacade;

    @Autowired
    UserInfoConvertor userInfoConvertor;

    @ResponseBody
    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    public UserQueryResponse getUser(Long id) {
        UserQueryRequest request = new UserQueryRequest();
        request.setId(id);
        UserQueryResult result = demoFacade.queryUser(request);
        UserQueryResponse response = new UserQueryResponse();
        response.fillResponseState(result, new ResultCallback() {
            @Override
            public void onSuccess() throws Exception {
                UserInfo userInfo = result.getUserInfo();
                response.setData(userInfoConvertor.convertToLower(userInfo));
            }
        });
        return response;
    }

    @ResponseBody
    @RequestMapping(value = "/saveUser", method = POST)
    public UserSaveResponse saveUser(@RequestBody UserSaveRequest request) {
        UserSaveResponse userSaveResponse = new UserSaveResponse();
        com.benny.november.business.api.request.UserSaveRequest userSaveRequest = new com.benny.november.business.api.request.UserSaveRequest();
        userSaveRequest.setUserInfo(userInfoConvertor.convertToUpper(request.getUserInfo()));
        UserSaveResult result = demoFacade.saveUser(userSaveRequest);
        userSaveResponse.fillResponseState(result);
        return userSaveResponse;
    }
}
