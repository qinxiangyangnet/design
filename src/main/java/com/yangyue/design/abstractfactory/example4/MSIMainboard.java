package com.yangyue.design.abstractfactory.example4;

/**
 * @program: design
 * @description:
 * @author: yueyang
 * @create: 2020-02-26 06:54
 **/
public class MSIMainboard implements MainboardApi {

    private int  cpusHoles=0;

    public MSIMainboard( int  cpusHoles){this.cpusHoles=cpusHoles;}
    public void installCPU() {
        System.out.println("now in  int  MSIMainboard，cpusHoles="+cpusHoles);
    }
}
