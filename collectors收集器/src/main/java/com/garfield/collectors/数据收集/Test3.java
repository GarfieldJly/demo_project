package com.garfield.collectors.数据收集;

import org.apache.tomcat.util.buf.StringUtils;

import java.util.Optional;

/**
 * Test3
 *
 * @author jly
 * @date 2021/6/23
 */
public class Test3 {
    public static void main(String[] args) {

    }

    //判断对象A里的对象B中的值是否相等，用map()的形式
    private void testEquals() {
        TestA testA = new TestA();
        testA.setName("garfield");

        TestB testB = new TestB();
        testB.setCode("jly");
        //没看懂
//        Optional.ofNullable(testA.getName()).map(TestA::getName).map(TestB::getCode).map(str ->)

    }

    class TestA {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }

    class TestB {
        private String code;

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }
    }
}
