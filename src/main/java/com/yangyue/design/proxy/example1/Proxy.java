package com.yangyue.design.proxy.example1;

/**
 * @program: design
 * @description:代理对象
 * @author: yueyang
 * @create: 2020-02-26 13:42
 **/
public class Proxy implements  Subject{
    /**
     * 持有被代理的具体目标对象
     */
    private RealSubject realSubject=null;

    /**
     * 传入被代理的具体的目标对象
     * @param realSubject
     */
    public Proxy(RealSubject realSubject){
        this.realSubject=realSubject;
    }

    public void request() {
        //在转调目标对象之前可以执行一些功能处理（数据校验，）
//        if(s==null){
//            
//        }
        //转调具体目标对象的方法
        realSubject.request();
        //在转调目标对象之前可以执行一些功能处理
    }
}
