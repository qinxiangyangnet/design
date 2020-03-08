package com.yangyue.design.template.example7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @program: design
 * @description:
 * @author: yueyang
 * @create: 2020-03-01 07:38
 **/
public class Client {


    public static void main(String[] args) {
        UserModel um1 = new UserModel("u1", "user1", 23);
        UserModel um2 = new UserModel("u2", "user2", 21);
        UserModel um3 = new UserModel("u3", "user3", 22);
        UserModel um4 = new UserModel("u4", "user4", 24);

        List<UserModel> userModels = new ArrayList<UserModel>();
        userModels.add(um1);
        userModels.add(um2);
        userModels.add(um3);
        userModels.add(um4);
        System.out.println("排序前---------------------------------");
        printList(userModels);

        Collections.sort(userModels, new Comparator<UserModel>() {
            public int compare(UserModel u1, UserModel u2) {
                if(u1.getAge()>u2.getAge()){
                    return 1;
                }else if(u1.getAge()==u2.getAge()){
                    return 0;
                }else if(u1.getAge()<u2.getAge()){
                    return -1;
                }

                return 0;
            }
        });
        System.out.println("排序后---------------------------------");
        printList(userModels);

    }

    public static void printList(List<UserModel> userModels) {
        for (UserModel um :
                userModels) {
            System.out.println(um);
        }
    }
}
