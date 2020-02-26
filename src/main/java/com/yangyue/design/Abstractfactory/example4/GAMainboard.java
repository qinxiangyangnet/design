package com.yangyue.design.Abstractfactory.example4;



/**
 * @program: design
 * @description:技嘉主板
 * @author: yueyang
 * @create: 2020-02-26 06:52
 **/
public class GAMainboard implements MainboardApi{

    private int  cpusHoles=0;

    public GAMainboard(int  cpusHoles){this.cpusHoles=cpusHoles;}
    public void installCPU() {
        System.out.println("now in  int  GAMainboard，cpusHoles="+cpusHoles);
    }
}
