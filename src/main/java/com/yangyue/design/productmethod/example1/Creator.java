package com.yangyue.design.productmethod.example1;

/**
 * @program: design
 * @description: 创建器，声明工厂方法
 * @author: yueyang
 * @create: 2020-02-22 18:45
 **/
public abstract   class Creator {
    /**
     * 创建Product的方法
     * 具体的实现不知道，
     * @return
     */
    protected  abstract  Product factoryMethod();

    /**
     * 示意，实现某些功能的方法
     *
     *
     */
    public void  someOperation(){
        //通常在这种方法实现中，需要调用工厂方法来获取Product对象
        //需要的时候从这里获取就可以了
        Product product = factoryMethod();
    }
}
