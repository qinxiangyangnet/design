package com.yangyue.design.Abstractfactory.example2;

/**
 * @program: design
 * @description:
 * @author: yueyang
 * @create: 2020-02-26 06:48
 **/
public class IntelCPU implements CPUApi {

    private int pins=0;

    public IntelCPU(int pins){
        this.pins=pins;
    }
    public void calculate() {
        System.out.println("now in IntelCpu  ,pins="+pins);
    }
}
