package com.garfield.cache.domain;

import java.io.Serializable;

/**
 * @author jingliyuan
 * @date 2020/10/19
 */
public class User implements Serializable {
    private String userName;
    private String userId;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userId='" + userId + '\'' +
                '}';
    }

    public User(String userName, String userId) {
        this.userName = userName;
        this.userId = userId;
    }
}
