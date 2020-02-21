package com.yangyue.design.singleton.example9;

/**
 * @program: design
 * @description:  虚拟机保证不会多次被实例化
 * @author: yueyang
 * @create: 2020-02-21 09:08
 **/
public class Client {

        //测试
        public static void main(String[] args) {
            for(int i=0;i<3;i++){
                Singleton.uniqueInstance.singletonOperation();
            }
        }

}
