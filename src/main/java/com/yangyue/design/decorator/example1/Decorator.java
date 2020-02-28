package com.yangyue.design.decorator.example1;

/**
 * @program: design
 * @description: 装饰器接口，维持一个指向组件对象的接口对象
 * 并定义一个与组件接口一致的接口
 * @author: yueyang
 * @create: 2020-02-28 20:00
 **/
public abstract class Decorator extends Component {
    /**
     * 持有组件对象
     */
    protected   Component component;

    public Decorator(Component component){
        this.component=component;
    }
    public void operation(){
        //缺省实现
        //转发请求给组件对象，可在转发前后执行一些附加操作
        System.out.println("begin-------->");
        component.operation();
        System.out.println("after-------->");
    }
}
