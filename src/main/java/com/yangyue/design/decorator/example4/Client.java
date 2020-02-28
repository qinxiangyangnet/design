package com.yangyue.design.decorator.example4;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @program: design
 * @description:
 * @author: yueyang
 * @create: 2020-02-28 23:26
 **/
public class Client {
    public static void main(String[] args) throws IOException {

        //问题 ，按道理说 装饰器之间没有依赖关系的，顺序是可以变的，
        DataOutputStream dout = new DataOutputStream(new BufferedOutputStream(new EncrypetOutputStream(new FileOutputStream("MyEncryt.txt"))));
        dout.write("fasdfads".getBytes());
        dout.close();
    }
}
