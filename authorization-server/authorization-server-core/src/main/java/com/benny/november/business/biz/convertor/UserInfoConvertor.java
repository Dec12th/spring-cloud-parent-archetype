package com.benny.november.business.biz.convertor;

import com.benny.framework.common.framework.lang.ModelConvertor;
import com.benny.framework.common.framework.lang.annotations.Convertor;
import com.benny.november.business.api.info.UserInfo;
import com.benny.november.business.domain.model.UserDO;

/**
 * @author yin.beibei
 * @date 2018/11/22 15:33
 */
@Convertor("userInfoConvertor")
public class UserInfoConvertor implements ModelConvertor<UserInfo, UserDO> {
    @Override
    public UserDO convertToUpper(UserInfo lowerModel) {
        UserDO userDO = new UserDO();
        userDO.setId(lowerModel.getId());
        userDO.setUserName(lowerModel.getUserName());
        userDO.setName(lowerModel.getName());
        userDO.setPassword(lowerModel.getPassword());
        return userDO;
    }

    @Override
    public UserInfo convertToLower(UserDO upperModel) {
        UserInfo userInfo = new UserInfo();
        userInfo.setId(upperModel.getId());
        userInfo.setUserName(upperModel.getUserName());
        userInfo.setName(upperModel.getName());
        userInfo.setPassword(upperModel.getPassword());
        return userInfo;
    }
}
