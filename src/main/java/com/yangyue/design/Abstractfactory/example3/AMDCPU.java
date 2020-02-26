package com.yangyue.design.Abstractfactory.example3;

/**
 * @program: design
 * @description:
 * @author: yueyang
 * @create: 2020-02-26 06:49
 **/
public class AMDCPU implements CPUApi {


    private int pins=0;

    public AMDCPU(int pins){
        this.pins=pins;
    }
    public void calculate() {
        System.out.println("now in AMDCPU  ,pins="+pins);
    }
}
