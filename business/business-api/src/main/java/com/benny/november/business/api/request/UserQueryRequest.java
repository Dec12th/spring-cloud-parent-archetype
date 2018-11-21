package com.benny.november.business.api.request;

import com.benny.framework.common.net.domain.BaseRequest;
import lombok.Data;

/**
 * @author yin.beibei
 * @date 2018/11/19 15:43
 */
@Data
public class UserQueryRequest extends BaseRequest {
    private static final long serialVersionUID = 1489179969228863357L;
    private long id;
}
