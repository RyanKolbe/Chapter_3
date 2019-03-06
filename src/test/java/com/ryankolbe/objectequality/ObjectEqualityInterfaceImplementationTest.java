package com.ryankolbe.objectequality;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ObjectEqualityInterfaceImplementationTest {
    private ObjectEqualityInterface objectEqualityInterface;
    ObjectEqualityModel object1 = new ObjectEqualityModel("Ryan", "Kolbe");
    ObjectEqualityModel object2 = new ObjectEqualityModel("Ryan", "Kolbe");

    @Before
    public void setUp() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ObjectEqualityConfig.class);
        objectEqualityInterface = (ObjectEqualityInterface) applicationContext.getBean("ObjectEquality");
    }

    @Test
    public void objectEquality() {
        //The same object tested true when compared to itself.
        System.out.println(object1.hashCode());
        System.out.println(object2.hashCode());
        boolean result = objectEqualityInterface.objectEquality(object1, object1);
        Assert.assertSame("AssertSame check.",true, result);
        boolean resultTwo = objectEqualityInterface.objectEquality(object1, object2);
        Assert.assertNotSame("AssertNotSame check.",true, resultTwo);
    }
}