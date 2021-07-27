package com.yangyue.design.strategy;

/**
 * @author gusteau.qin@dbappsecurity.com.cn
 * @date 2021/07/27 13:25:22
 */
public class AirPlane implements PlaneStrategy {
    public void takeOff() {
        System.out.println("客机 长距离起飞");
    }

    public void fly() {
        System.out.println("客机 亚音速飞行");
    }
}
