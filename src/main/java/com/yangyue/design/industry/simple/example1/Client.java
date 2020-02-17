package com.yangyue.design.industry.simple.example1;

/**
 * @program: design
 * @description: 不能实现面向接口编程，因为new Api(),假如不知道实现，Api  api =；不成立，知道封装体的内部，起不到封装隔离
 * @author: yueyang
 * @create: 2020-02-17 10:19
 **/
public class Client {
    public static void main(String[] args) {
        Api  api =new Impl();
        api.operation("test no");
    }
}
