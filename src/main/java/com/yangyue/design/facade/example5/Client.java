package com.yangyue.design.facade.example5;

/**
 * @program: design
 * @description:
 * @author: yueyang
 * @create: 2020-02-17 15:50
 **/
public class Client {

    public static void main(String[] args) {
        FacadeApi facadeApi = FacadeFactory.createFacadeApi();
        facadeApi.generate();
    }
}
