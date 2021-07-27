package com.yangyue.design.strategy;

/**
 * @author gusteau.qin@dbappsecurity.com.cn
 * @date 2021/07/27 13:23:40
 */
public class Helicopter implements PlaneStrategy {
    public void takeOff() {
        System.out.println("直升机 垂直起飞");
    }

    public void fly() {
        System.out.println("直升机 亚音速飞行");
    }
}
