package com.garfield.feign.logic;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author jingliyuan
 * @date 2020/12/30
 */
@FeignClient(value = "server-client",fallback = UserClientHystrix.class)
public interface UserClient {
    @GetMapping("/sayHello")
    String sayHello();

    @GetMapping("/timeOut")
    String timeOut() throws Exception;

    @GetMapping("/exception")
    String exception() throws Exception;
}
