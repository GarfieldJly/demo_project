package com.garfield.feign.logic;


/**
 * @author jingliyuan
 * @date 2020/12/30
 */
public class UserClientHystrix implements UserClient {
    @Override
    public String sayHello() {
        return "hello,加菲猫";
    }

    @Override
    public String timeOut() throws Exception {
        return "超时啦";
    }

    @Override
    public String exception() throws Exception {
        return "接口异常啦";
    }
}
