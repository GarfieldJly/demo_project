package com.garfield.sort.递归;

import org.junit.*;


/**
 * @author jingliyuan
 * @date 2020/8/31
 */
public class TestFactorialTest {

    /**
     * @Test：把一个方法标记为测试方法
     */
    @Test
    public void testFactorial(){
        int factorialValue = new TestFactorial().getFactorialValue(5);
        Assert.assertEquals(120,new TestFactorial().getFactorialValue(5));
        System.out.println(factorialValue);
    }

    /**
     * @BeforeClass：所有测试方法执行前执行一次，在测试类还没有实例化就已经被加载，所以用static修饰
     */
    @BeforeClass
    public static void testBeforeClass(){
        System.out.println("testBeforeClass");
    }

    /**
     * @AfterClass：所有测试方法执行完执行一次，在测试类还没有实例化就已经被加载，所以用static修饰
     */
    @AfterClass
    public static void testAfterClass(){
        System.out.println("testAfterClass");
    }

    /**
     * @Before：每一个测试方法执行前自动调用一次
     */
    @Before
    public void testBefore(){
        System.out.println("testBefore");
    }

    /**
     * @After：每一个测试方法执行完自动调用一次
     */
    @After
    public void testAfter(){
        System.out.println("testAfter");
    }

    /**
     * @Ignore：暂不执行该测试方法
     */
    @Ignore
    public void testIgnore(){
        new TestFactorial().init();
    }
}