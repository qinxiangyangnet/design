package com.yangyue.design.abstractfactory.example3;

/**
 * @program: design
 * @description:装机方案1.一系列匹配的对象
 * @author: yueyang
 * @create: 2020-02-26 07:22
 **/
public class Schema1 implements AbstractFactory {
    public CPUApi createCPUApi() {
        return new IntelCPU(1156);
    }

    public MainboardApi createMainboardApi() {
        return new MSIMainboard(1156);
    }
}
