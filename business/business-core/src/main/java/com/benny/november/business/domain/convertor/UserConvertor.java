package com.benny.november.business.domain.convertor;

import com.benny.framework.common.framework.lang.ModelConvertor;
import com.benny.framework.common.framework.lang.annotations.Convertor;
import com.benny.november.business.common.dal.persistant.UserPO;
import com.benny.november.business.domain.model.UserDO;

/**
 * @author yin.beibei
 * @date 2018/11/22 14:23
 */
@Convertor("userConvertor")
public class UserConvertor implements ModelConvertor<UserDO, UserPO> {
    @Override
    public UserPO convertToUpper(UserDO lowerModel) {
        if (lowerModel==null) {
            return null;
        }
        UserPO userPO = new UserPO();
        userPO.setId(lowerModel.getId());
        userPO.setUserName(lowerModel.getUserName());
        userPO.setName(lowerModel.getName());
        userPO.setPassword(lowerModel.getPassword());
        return userPO;
    }

    @Override
    public UserDO convertToLower(UserPO upperModel) {
        if (upperModel==null) {
            return null;
        }
        UserDO userDO = new UserDO();
        userDO.setId(upperModel.getId());
        userDO.setUserName(upperModel.getUserName());
        userDO.setName(upperModel.getName());
        userDO.setPassword(upperModel.getPassword());
        return userDO;
    }
}
