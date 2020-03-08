package com.yangyue.design.proxy.examle4;

/**
 * @program: design
 * @description:
 * @author: yueyang
 * @create: 2020-03-08 14:21
 **/
public class Person  implements  BaseService {
    public void eat() {
        System.out.println("吃饭");
    }

    public void wc() {
        System.out.println("上厕所");
    }
}
