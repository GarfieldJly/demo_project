package com.garfield.sort.递归;

/**
 * @author jingliyuan
 * @date 2020/8/31
 *
 */
public class TestFactorial {
    /**
     * 计算阶乘的结果
     */
    public int getFactorialValue(int n){
        if(n < 0){
            System.out.println("负数没有阶乘");
        }else if(n == 1){
            return 1;
        }
        return n * getFactorialValue(n -1);
    }

    public void init(){
        System.out.println("测试ignore注解");
    }
}
