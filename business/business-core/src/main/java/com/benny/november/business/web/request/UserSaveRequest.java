package com.benny.november.business.web.request;

import com.benny.november.business.web.info.UserInfo;
import lombok.Data;

import java.io.Serializable;

/**
 * @author yin.beibei
 * @date 2018/11/22 16:29
 */
@Data
public class UserSaveRequest implements Serializable {
    private static final long serialVersionUID = -7563105387447277454L;

    UserInfo userInfo;
}
