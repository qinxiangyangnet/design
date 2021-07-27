package com.yangyue.design.template.demo1;

/**
 * @author gusteau.qin@dbappsecurity.com.cn
 * @date 2021/07/27 10:54:25
 */
public abstract class TemplateMethod1 {



    //模板方法


    public void template(){
        open();
        display();
        if(isPrint()){
            print();
        }

        primitiveOperation1();
    }

    //基本方法,钩子方法
    private void primitiveOperation1() {
    }

    private void print() {
    }

    //钩子方法,决定print方法是否可以执行
    protected  boolean isPrint(){
        return  true;
    }

    public void open() {
    }
    abstract void display();

}
