package com.yangyue.design.proxy.example3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @program: design
 * @description:
 * @author: yueyang
 * @create: 2020-02-27 05:40
 **/
public class DynamicProxy implements InvocationHandler {
    private OrderAPI order = null;

    public OrderAPI getProxyInterface(Order order) {
        this.order = order;
        OrderAPI orderAPI = (OrderAPI) Proxy.newProxyInstance(this.order.getClass().getClassLoader(), this.order.getClass().getInterfaces(), this);
        return orderAPI;
    }

    public  Object invoke(Object proxy, Method method, Object[] args) throws  Throwable{
        if(method.getName().startsWith("set")){
            if(order.getOrderUser().equals(args[1])){
                return  method.invoke(order,args);
            }else{
                System.out.println("你无权操作");
            }
        }else{
            return  method.invoke(order,args);
        }
        return null;
    }
}
