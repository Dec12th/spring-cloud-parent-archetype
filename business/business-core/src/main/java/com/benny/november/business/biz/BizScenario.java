package com.benny.november.business.biz;

import com.benny.framework.common.framework.config.CommonConfig;
import com.benny.framework.common.framework.config.ConfigKeyEnum;
import com.benny.framework.common.framework.lang.enums.CommonScenario;

/**
 * 业务场景码枚举
 * Created by flamhaze on 2018/04/08.
 */
public enum BizScenario implements CommonScenario<BizScenario> {
    /**
     * 保存用户
     */
    SAVE_USER("1000", "保存用户"),
    /**
     * 查询用户
     */
    QUERY_USER("1001", "查询用户");


    /**
     * 场景码
     */
    private String code;

    /**
     * 场景描述
     */
    private String description;

    /**
     * 构造函数
     *
     * @param code        场景码
     * @param description 场景描述
     */
    private BizScenario(String code, String description) {
        this.code = code;
        this.description = description;
    }

    /**
     * @see CommonScenario#getAppCode()
     */
    @Override
    public String getAppCode() {
        return CommonConfig.getProperty(ConfigKeyEnum.APP_CODE);
    }

    /**
     * @see CommonScenario#getCode()
     */
    @Override
    public String getCode() {
        return code;
    }

    /**
     * @see CommonScenario#getDescription()
     */
    @Override
    public String getDescription() {
        return description;
    }
}
