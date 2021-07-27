package com.yangyue.design.strategy;

/**
 * @author gusteau.qin@dbappsecurity.com.cn
 * @date 2021/07/27 13:28:56
 */
public class Context {

    private PlaneStrategy planeStrategy;

    public Context(PlaneStrategy planeStrategy) {
        this.planeStrategy = planeStrategy;
    }

    public void handler() {

        planeStrategy.fly();
        planeStrategy.takeOff();
    }


}
