package com.yangyue.design.simple.example2;

/**
 * @program: design
 * @description: 接口的具体实现对象
 * @author: yueyang
 * @create: 2020-02-17 09:44
 **/
public class ImplB  implements  Api {
    public void operation(String s) {
        System.out.println("ImplB  s="+s);
    }
}
