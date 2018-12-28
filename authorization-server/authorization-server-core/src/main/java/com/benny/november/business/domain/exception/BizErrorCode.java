package com.benny.november.business.domain.exception;

import com.benny.framework.common.framework.lang.enums.InfoLevel;
import com.benny.framework.common.framework.lang.enums.InfoType;
import com.benny.framework.common.framework.lang.exception.CommonErrorCode;
import org.apache.commons.lang.StringUtils;

/**
 * 业务异常码
 *
 * @author hou.jun
 */
public enum BizErrorCode implements CommonErrorCode<BizErrorCode> {

    /** --------------------------------COMMON START-------------------------------- */
    /**
     * 系统异常
     */
    SYSTEM_ERROR("999", "系统异常", InfoType.SYSTEM, InfoLevel.ERROR),

    PARAM_EMPTY("998", "参数非法", InfoType.BIZ, InfoLevel.WARN),

    MEDIA_RESOURCE_NOT_EXIST("100", "资源不存在", InfoType.BIZ, InfoLevel.WARN),

    /**
     * 参数为空
     */
    PARAM_ILLEGAL("998", "参数非法", InfoType.BIZ, InfoLevel.WARN),

    /**
     * 参数为空
     */
    PARAM_FORMAT_ERROR("998", "参数格式错误", InfoType.BIZ, InfoLevel.WARN);
    /**
     * 业务异常码
     */
    private String code;

    /**
     * 异常信息类型
     */
    private InfoType infoType;

    /**
     * 异常信息等级
     */
    private InfoLevel infoLevel;

    /**
     * 业务异常描述
     */
    private String description;


    BizErrorCode(String code, String description, InfoType infoType, InfoLevel infoLevel) {
        this.code = code;
        this.infoType = infoType;
        this.infoLevel = infoLevel;
        this.description = description;
    }

    /**
     * 根据异常码获取异常枚举对象
     *
     * @param code 异常码
     * @return 异常枚举对象
     */
    public static BizErrorCode getByCode(String code) {
        for (BizErrorCode bizErrorCode : values()) {
            if (StringUtils.equals(bizErrorCode.getCode(), code)) {
                return bizErrorCode;
            }
        }

        return null;
    }

    public String getCode() {
        return code;
    }

    /**
     * method for get infoType
     */
    @Override
    public InfoType getInfoType() {
        return infoType;
    }

    /**
     * method for get infoLevel
     */
    @Override
    public InfoLevel getInfoLevel() {
        return infoLevel;
    }

    /**
     * method for get description
     */
    @Override
    public String getDescription() {
        return description;
    }
}
