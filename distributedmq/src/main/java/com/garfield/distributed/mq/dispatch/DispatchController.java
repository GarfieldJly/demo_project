package com.garfield.distributed.mq.dispatch;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jingliyuan
 * @date 2020/9/15
 */
@RestController
@RequestMapping("/waybill")
public class DispatchController {
    public String createWayBill(){
        return "ok";
    }
}

