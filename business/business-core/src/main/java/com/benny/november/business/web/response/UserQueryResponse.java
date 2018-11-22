package com.benny.november.business.web.response;

import com.benny.framework.common.net.domain.BaseResponse;
import com.benny.november.business.web.info.UserInfo;
import lombok.Data;

/**
 * 用户保存返回结果
 * @author yin.beibei
 * @date 2018/11/22 16:27
 */
@Data
public class UserQueryResponse extends BaseResponse {
    private static final long serialVersionUID = -8950532500907112422L;

    private UserInfo data;

    @Override
    protected void fillCodePairs() {

    }
}
