package com.benny.november.business.domain.exception;

import com.benny.framework.common.framework.lang.exception.CommonErrorCode;
import com.benny.framework.common.framework.lang.exception.GenericException;

/**
 * 业务异常类
 *
 * @author hou.jun
 */
public class BizException extends GenericException {
    private static final long serialVersionUID = 4966218735976475505L;

    /**
     * 构造函数, 异常信息为异常码默认信息
     *
     * @param errorCode 异常码
     */
    @SuppressWarnings("rawtypes")
    public BizException(CommonErrorCode errorCode) {
        super(errorCode);
    }

    /**
     * 构造函数, 异常信息为异常码默认信息和额外信息
     *
     * @param errorCode    异常码
     * @param extraMessage 额外信息
     */
    @SuppressWarnings("rawtypes")
    public BizException(CommonErrorCode errorCode, String extraMessage) {
        super(errorCode, extraMessage);
    }
}
