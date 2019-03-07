package com.ryankolbe.multi_module;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class WolfInterfaceImplementationTest {

    private AnimalActionInterface animalActionInterface;

    @Before
    public void setUp() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AnimalConfig.class);
        animalActionInterface = (AnimalActionInterface) applicationContext.getBean("Wolf");
    }

    @Test
    public void animalAction() {
        String result = animalActionInterface.animalAction("Wolf");
        Assert.assertEquals("Wolves can snarl.", result);
    }
}