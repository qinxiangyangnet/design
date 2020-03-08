package com.yangyue.design.template.example5;

/**
 * @program: design
 * @description:
 * @author: yueyang
 * @create: 2020-02-29 12:33
 **/
public abstract class AbstractTemplate {

    public final void template(){
        //第一步
        this.operation1();
        //第二步
        this.operation2();
        //第三步
        this.doPrimitiveOperation1();
        //第四步
        this.doPrimitiveOperation2();
        //第五步
        this.hookOperation();
    }
    /**
     * 算法步骤，固定实现，子类不需要访问
     */
    private  void  operation1(){

    }

    /**
     * 算法步骤，固定实现，子类可能需要访问
     */
    protected  final  void  operation2(){

    }

    /**
     * 具体的抽象类操作，子类的公共功能
     * 但通常不是具体的算法步骤
     */
    protected void  commonOperation(){
        //在这里实现
    }

    /**
     * 原语操作，算法的必要步骤，父类无法确定如何真正实现，需要子类实现
     */
    protected   abstract  void doPrimitiveOperation1();
    /**
     * 原语操作，算法的必要步骤，父类无法确定如何真正实现，需要子类实现
     */
    protected   abstract  void doPrimitiveOperation2();

    /**
     * 构子操作，算法中不一定需要，需要提供缺省实现
     */
    protected  void hookOperation(){
        //缺省实现
    }

    /**
     * 工厂方法，创建某一个对象，不知道对象怎么来，
     * @return
     */
    protected  abstract Object  factoryMethod();

}
