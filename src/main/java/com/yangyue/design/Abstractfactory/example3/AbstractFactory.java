package com.yangyue.design.Abstractfactory.example3;

/**
 * @program: design
 * @description:
 * @author: yueyang
 * @create: 2020-02-26 07:20
 **/
public interface AbstractFactory {

    public  CPUApi  createCPUApi();
    public  MainboardApi  createMainboardApi();
}
