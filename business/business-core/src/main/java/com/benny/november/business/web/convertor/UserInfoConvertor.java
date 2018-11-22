package com.benny.november.business.web.convertor;

import com.benny.framework.common.framework.lang.ModelConvertor;
import com.benny.framework.common.framework.lang.annotations.Convertor;
import com.benny.november.business.web.info.UserInfo;

/**
 * @author yin.beibei
 * @date 2018/11/22 16:31
 */
@Convertor("fUserInfoConvertor")
public class UserInfoConvertor implements ModelConvertor<UserInfo, com.benny.november.business.api.info.UserInfo> {
    @Override
    public com.benny.november.business.api.info.UserInfo convertToUpper(UserInfo lowerModel) {
        if (lowerModel == null) {
            return null;
        }
        com.benny.november.business.api.info.UserInfo userInfo = new com.benny.november.business.api.info.UserInfo();
        userInfo.setId(lowerModel.getId());
        userInfo.setUserName(lowerModel.getUserName());
        userInfo.setName(lowerModel.getName());
        userInfo.setPassword(lowerModel.getPassword());

        return userInfo;
    }

    @Override
    public UserInfo convertToLower(com.benny.november.business.api.info.UserInfo upperModel) {
        if (upperModel == null) {
            return null;
        }
        UserInfo userInfo = new UserInfo();
        userInfo.setId(upperModel.getId());
        userInfo.setUserName(upperModel.getUserName());
        userInfo.setName(upperModel.getName());
        userInfo.setPassword(upperModel.getPassword());
        return userInfo;
    }
}
