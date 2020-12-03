package com.garfield.dubbo.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.garfield.dubbo.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jingliyuan
 * @date 2020/12/3
 */
@RestController
@RequestMapping("/dubbo")
public class ConsumerController {
    @Reference()
    private UserService userService;

    @GetMapping(value = "/say")
    public void say(){
        System.out.println(userService.sayHello("加菲猫"));
    }
}
