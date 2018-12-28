package com.benny.november.business.web.controller;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;


/**
 * @author yin.beibei
 * @date 2018/12/7 10:13
 */
public class InterfaceProxyFactoryBean<T> implements InitializingBean, FactoryBean<T> {

    private String innerClassName;

    public void setInnerClassName(String innerClassName) {
        this.innerClassName = innerClassName;
    }

    @Override
    public T getObject() throws Exception {
//        Class innerClass = Class.forName(innerClassName);
//        if (innerClass.isInterface()) {
//            DefalutInterfaceProxyFactory<T> interfaceProxyFactory = new DefalutInterfaceProxyFactory<>();
//            return (T) interfaceProxyFactory.createInstance(innerClass);
//        } else {
//            DefalutClassProxyFactory<T> defalutClassProxyFactory = new DefalutClassProxyFactory<>();
//
//            return (T) defalutClassProxyFactory.createInstance(innerClass);
//        }
        return null;
    }

    @Override
    public Class<?> getObjectType() {
        try {
            return Class.forName(innerClassName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }

    public static void main(String[] args) throws Exception {
        System.out.println(11);
    }
}
