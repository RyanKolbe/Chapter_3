package com.ryankolbe.timeouts;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;

public class TimeoutsInterfaceImplementationTest {

    Random randomNumber = new Random(2);
    private TimeoutsInterface timeoutsInterface;

    @Before
    public void setUp() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(TimeoutsConfig.class);
        timeoutsInterface = (TimeoutsInterface) applicationContext.getBean("Timeouts");

    }


    @Test(timeout = 1000)
    public void countTime() {
        int result = timeoutsInterface.countTime(randomNumber);
        System.out.println(result);
    }
}