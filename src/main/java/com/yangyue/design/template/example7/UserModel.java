package com.yangyue.design.template.example7;

import lombok.Data;

/**
 * @program: design
 * @description:
 * @author: yueyang
 * @create: 2020-03-01 07:36
 **/
@Data
public class UserModel {

    private String userId, name;
    private int age;

    public UserModel() {

    }

    public UserModel(String userId, String name, int age) {
        this.age = age;
        this.name = name;
        this.userId = userId;
    }
}
