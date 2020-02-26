package com.yangyue.design.Abstractfactory.example4;

/**
 * @program: design
 * @description:
 * @author: yueyang
 * @create: 2020-02-26 07:06
 **/
public class Client {
    public static void main(String[] args) {
        ComputerEngineer engineer = new ComputerEngineer();
        AbstractFactory schema = new Scheme3();
        engineer.makeComputer(schema);
    }
}
