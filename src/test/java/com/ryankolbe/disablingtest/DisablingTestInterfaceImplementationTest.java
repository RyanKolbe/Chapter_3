package com.ryankolbe.disablingtest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

public class DisablingTestInterfaceImplementationTest {
    private DisablingTestInterface disablingTestInterface;

    @Before
    public void setUp() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(DisablingTestConfig.class);
        disablingTestInterface = (DisablingTestInterface) applicationContext.getBean("DisablingTest");
    }

    @Ignore
    @Test
    public void concatName() {
        String name = "Ryan";
        String result = disablingTestInterface.concatName(name);
        Assert.assertEquals("Concat name with text","Ryan Kolbe",result);
    }
}