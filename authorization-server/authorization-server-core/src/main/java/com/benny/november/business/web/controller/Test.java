package com.benny.november.business.web.controller;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @ClassName: Test
 * @Description:
 * @author:大贝
 * @date:2018年12月08日 18:49
 */
public class Test<T> implements InitializingBean,FactoryBean<T> {

    private String innerClassName;

    public void setInnerClassName(String innerClassName) {
        this.innerClassName = innerClassName;
    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }

    public static void main(String[] args) {
        System.out.println(111);
    }

    @Override
    public T getObject() throws Exception {
        return null;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
