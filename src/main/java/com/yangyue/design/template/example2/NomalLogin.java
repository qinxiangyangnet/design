package com.yangyue.design.template.example2;

/**
 * @program: design
 * @description:
 * @author: yueyang
 * @create: 2020-02-29 10:15
 **/
public class NomalLogin {

    public boolean login(LoginModel loginModel) {
        UserModel userModel = this.findUserByUserId(loginModel.getUserId());
        if(userModel!=null){
            if(userModel.getPwd().equals(loginModel.getPwd())&&loginModel.getUserId().equals(userModel.getUserId())){
                return true;
            }
        }
        return false;

    }

    private UserModel findUserByUserId(String userId) {
        UserModel userModel = new UserModel();
        userModel.setUserId(userId);
        userModel.setName("test");
        userModel.setPwd("test");
        userModel.setUuid("User001");
        return userModel;
    }
}
