package com.yangyue.design.proxy.examle4;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @program: design
 * @description:
 * @author: yueyang
 * @create: 2020-03-08 14:27
 **/
public class ProxyFactory {
    /**
     * jdk动态代理
     * 代理对象的数据类型由监控的行为来描述
     * c参数： class文件，监控类
     */
    public static BaseService   build (Class classFile)throws Exception{
        //创建被监控的实例对象
        BaseService bb = (BaseService) classFile.newInstance();
        //创建一个通知对象
        InvocationHandler invacation = new Invacation(bb);
        //向JVM申请负责监控obj对象中执行行为的监控对象
        /**
         * loader:被监控对象隶属的类文件在内存中的真实地址
         * interface:被监控对象隶属的类文件实现接口
         */
       BaseService $proxy=(BaseService) Proxy.newProxyInstance(bb.getClass().getClassLoader(),bb.getClass().getInterfaces(),invacation);
    return $proxy;
    }
}
