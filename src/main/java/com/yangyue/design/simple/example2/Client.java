package com.yangyue.design.simple.example2;

/**
 * @program: design
 * @description: 客户端
 * @author: yueyang
 * @create: 2020-02-17 09:43
 **/
public class Client {

    public static void main(String[] args) {
        Api api = new Factory().createApi(1);
        api.operation("简单工厂测试");
    }
}
