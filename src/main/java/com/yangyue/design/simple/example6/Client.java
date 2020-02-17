package com.yangyue.design.simple.example6;

/**
 * @program: design
 * @description:
 * @author: yueyang
 * @create: 2020-02-17 10:19
 **/
public class Client {
    public static void main(String[] args) {
        //重要的改变，没有new Impl,实现隔离开来
        for (int i = 0; i < 5; i++) {
            Api api = Factory.createApi();
            api.operation("test no");
        }
    }
}
