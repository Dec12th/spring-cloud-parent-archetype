package com.benny.november.business.domain.service.impl;

import com.benny.november.business.common.dal.repository.UserRepository;
import com.benny.november.business.domain.convertor.UserConvertor;
import com.benny.november.business.domain.model.UserDO;
import com.benny.november.business.domain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yin.beibei
 * @date 2018/11/22 14:15
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserConvertor userConvertor;

    @Override
    public UserDO saveUser(UserDO userDO) {
        return userConvertor.convertToLower(userRepository.save(userConvertor.convertToUpper(userDO)));
    }
}
