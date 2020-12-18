package com.garfield.starter.exercise.controller;

import com.garfield.log.starter.config.SysLog;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jingliyuan
 * @date 2020/12/18
 */
@RestController
@RequestMapping("/log")
public class LogController {
    @SysLog("测试")
    @GetMapping("/getLog")
    public void getLog(){
        System.out.println("测试");
    }
}
