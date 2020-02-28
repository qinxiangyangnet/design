package com.yangyue.design.proxy.example3;

import com.yangyue.design.proxy.example2.Proxy;

/**
 * @program: design
 * @description:动态代理
 * @author: yueyang
 * @create: 2020-02-27 05:30
 **/
public class Client {
    public static void main(String[] args) {

        DynamicProxy dynamicProxy = new DynamicProxy();
        OrderAPI orderAPI = dynamicProxy.getProxyInterface(new Order("设计模式", 100, "詹三"));
    }
}
