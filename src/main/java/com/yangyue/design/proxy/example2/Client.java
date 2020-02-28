package com.yangyue.design.proxy.example2;

/**
 * @program: design
 * @description:保护代理 
 * @author: yueyang
 * @create: 2020-02-27 05:30
 **/
public class Client {
    public static void main(String[] args) {
        Proxy proxy = new Proxy(new Order("设计模式", 100, "詹三"));
    }
}
