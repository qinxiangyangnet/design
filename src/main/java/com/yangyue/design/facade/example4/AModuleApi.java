package com.yangyue.design.facade.example4;

/**
 * @program: design
 * @description:
 * @author: yueyang
 * @create: 2020-02-18 03:14
 **/
public interface AModuleApi {
    //提供子系统外部使用
    public  void a1();
    //提供给同一个子系统中，不同模块使用比如B,C
    public  void a2();
    public  void a3();
}
