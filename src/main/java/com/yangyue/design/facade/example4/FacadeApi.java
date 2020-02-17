package com.yangyue.design.facade.example4;

/**
 * @program: design
 * @description:选择性暴露接口，有些方法不需要让外部知道
 * @author: yueyang
 * @create: 2020-02-17 16:29
 **/
public interface FacadeApi {
    public  void a1();
    public  void b1();
    public  void c1();

    //
    public  void test();
}
