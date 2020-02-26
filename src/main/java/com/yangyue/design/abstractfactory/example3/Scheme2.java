package com.yangyue.design.abstractfactory.example3;

/**
 * @program: design
 * @description:
 * @author: yueyang
 * @create: 2020-02-26 07:23
 **/
public class Scheme2 implements AbstractFactory {
    public CPUApi createCPUApi() {
        return new IntelCPU(939);
    }

    public MainboardApi createMainboardApi() {
        return new MSIMainboard(939);
    }
}
