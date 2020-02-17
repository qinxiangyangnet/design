package com.yangyue.design.adapter.example1;

/**
 * @program: design
 * @description:使用适配器的客户端
 * @author: yueyang
 * @create: 2020-02-18 04:00
 **/
public class Client {

    public static void main(String[] args) {
        //创建适配器对象
        Adaptee adaptee = new Adaptee();
        //创建客户端需要调用的接口对象
        Adapter adapter = new Adapter(adaptee);
        //请求处理
        adapter.request();
    }
}
