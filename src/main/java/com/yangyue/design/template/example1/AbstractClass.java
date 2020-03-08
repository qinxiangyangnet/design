package com.yangyue.design.template.example1;

/**
 * @program: design
 * @description: 定义模板方法，原语操作等抽象类
 * @author: yueyang
 * @create: 2020-02-29 10:04
 **/
public abstract class AbstractClass {
    /**
     * 原语操作1
     */
    public abstract   void doPrimitiveOperation1();
    public abstract   void doPrimitiveOperation2();

    public final void  templateMethod(){
        doPrimitiveOperation1();
        doPrimitiveOperation2();
    }
}
