package com.yangyue.design.strategy;

/**
 * @author gusteau.qin@dbappsecurity.com.cn
 * @date 2021/07/27 13:25:22
 */
public class Fighter implements PlaneStrategy {
    public void takeOff() {
        System.out.println("战斗机 长距离起飞");
    }

    public void fly() {
        System.out.println("战斗机 超音速飞行");
    }
}
