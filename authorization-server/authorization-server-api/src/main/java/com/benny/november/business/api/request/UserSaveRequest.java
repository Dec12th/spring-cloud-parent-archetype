package com.benny.november.business.api.request;

import com.benny.framework.common.net.domain.BaseRequest;
import com.benny.november.business.api.info.UserInfo;
import lombok.Data;

/**
 * @author yin.beibei
 * @date 2018/11/22 15:30
 */
@Data
public class UserSaveRequest extends BaseRequest {
    private static final long serialVersionUID = 2694050074086750198L;

    private UserInfo userInfo;
}
