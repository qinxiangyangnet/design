package com.yangyue.design.abstractfactory.example2;

/**
 * @program: design
 * @description:
 * @author: yueyang
 * @create: 2020-02-26 07:06
 **/
public class Client {
    public static void main(String[] args) {
        ComputerEngineer engineer = new ComputerEngineer();
        engineer.makeComputer(1,2);
    }
}
