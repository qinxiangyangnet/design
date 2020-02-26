package com.yangyue.design.abstractfactory.example3;

/**
 * @program: design
 * @description:
 * @author: yueyang
 * @create: 2020-02-26 07:06
 **/
public class Client {
    public static void main(String[] args) {
        ComputerEngineer engineer = new ComputerEngineer();
        AbstractFactory schema1 = new Schema1();
        engineer.makeComputer(schema1);
    }
}
