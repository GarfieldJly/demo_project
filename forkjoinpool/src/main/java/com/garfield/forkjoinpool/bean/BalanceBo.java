package com.garfield.forkjoinpool.bean;

import lombok.Data;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @author jingliyuan
 * @date 2020/8/29
 */
@Data
public class BalanceBo {
    private AtomicReference<Double> balance = new AtomicReference<>(100.8);
    private String name = "加菲猫";
}
