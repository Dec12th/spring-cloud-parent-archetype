package com.benny.november.business.biz.impl;

import com.benny.framework.common.framework.service.template.ServiceCallBack;
import com.benny.framework.common.framework.service.template.ServiceExecuteTemplate;
import com.benny.framework.common.framework.util.AssertUtil;
import com.benny.framework.common.framework.util.ScenarioHolder;
import com.benny.november.business.api.DemoFacade;
import com.benny.november.business.api.info.UserInfo;
import com.benny.november.business.api.request.UserQueryRequest;
import com.benny.november.business.api.request.UserSaveRequest;
import com.benny.november.business.api.result.UserQueryResult;
import com.benny.november.business.api.result.UserSaveResult;
import com.benny.november.business.biz.BizScenario;
import com.benny.november.business.biz.convertor.UserInfoConvertor;
import com.benny.november.business.domain.exception.BizErrorCode;
import com.benny.november.business.domain.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author yin.beibei
 * @date 2018/11/19 16:03
 */
@Service("demoFacade")
public class DemoFacadeImpl implements DemoFacade {

    @Autowired
    UserService uservice;

    @Autowired
    UserInfoConvertor userInfoConvertor;

    @Autowired
    protected ServiceExecuteTemplate serviceExecuteTemplate;

    private static final Logger logger = LoggerFactory.getLogger(DemoFacadeImpl.class);
    @Override
    public UserQueryResult queryUser(@RequestBody UserQueryRequest request) {
        ScenarioHolder.set(BizScenario.QUERY_USER);
        UserQueryResult userQueryResult = new UserQueryResult();
        return serviceExecuteTemplate.executeService(userQueryResult, new ServiceCallBack() {
            @Override
            public void check() throws Exception {
                AssertUtil.isNotNull(request, BizErrorCode.PARAM_FORMAT_ERROR, "请求对象为空");
                AssertUtil.isGreaterZero(request.getId(), BizErrorCode.PARAM_FORMAT_ERROR, "请求对象为空");
            }

            @Override
            public void doService() throws Exception {

                UserInfo userInfo = new UserInfo();
                userInfo.setId(request.getId());
                userInfo.setUserName("mock");
                userInfo.setName("mock");
                userInfo.setPassword("mock");
                userQueryResult.setUserInfo(userInfo);
                userQueryResult.setSuccess(true);
            }

            @Override
            public void afterService() throws Exception {

            }
        });
    }

    @Override
    public UserSaveResult saveUser(@RequestBody UserSaveRequest request) {
        ScenarioHolder.set(BizScenario.SAVE_USER);
        UserSaveResult result = new UserSaveResult();
        return serviceExecuteTemplate.executeService(result, new ServiceCallBack() {
            @Override
            public void check() throws Exception {
                AssertUtil.isNotNull(request, BizErrorCode.PARAM_FORMAT_ERROR, "请求对象为空");
                AssertUtil.isNotNull(request.getUserInfo(), BizErrorCode.PARAM_FORMAT_ERROR, "请求对象为空");
                AssertUtil.isNotBlank(request.getUserInfo().getName(), BizErrorCode.PARAM_FORMAT_ERROR, "请求对象为空");
                AssertUtil.isNotBlank(request.getUserInfo().getPassword(), BizErrorCode.PARAM_FORMAT_ERROR, "请求对象为空");
                AssertUtil.isNotBlank(request.getUserInfo().getUserName(), BizErrorCode.PARAM_FORMAT_ERROR, "请求对象为空");
            }

            @Override
            public void doService() throws Exception {
                uservice.saveUser(userInfoConvertor.convertToUpper(request.getUserInfo()));
                result.setSuccess(true);
            }

            @Override
            public void afterService() throws Exception {

            }
        });
    }
}
