package com.garfield.jwt.domain;

/**
 * UserBean
 *
 * @author jly
 * @date 2021/6/24
 */
public class UserBean {
    private String userName;

    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
