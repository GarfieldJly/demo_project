package com.garfield.jwt.util;

import com.garfield.jwt.domain.UserBean;

/**
 * LocalThread
 *
 * @author zhaojian
 * @date 2021/6/24
 */
public class UserLocalThread {
    public static ThreadLocal<UserBean> localThread = new ThreadLocal<>();
    public void setUser(UserBean userBean){
        localThread.set(userBean);
    }

    public UserBean getUserBean(){
        return localThread.get();
    }
}
