package com.ryankolbe.failingtest;

import com.ryankolbe.objectequality.ObjectEqualityConfig;
import com.ryankolbe.objectequality.ObjectEqualityInterface;
import com.ryankolbe.objectequality.ObjectEqualityModel;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ObjectEqualityInterfaceImplementationTest {
    ObjectEqualityModel object1 = new ObjectEqualityModel("Ryan", "Kolbe");
    ObjectEqualityModel object2 = new ObjectEqualityModel("Ryan", "Kolbe");
    private ObjectEqualityInterface objectEqualityInterface;

    @Before
    public void setUp() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ObjectEqualityConfig.class);
        objectEqualityInterface = (ObjectEqualityInterface) applicationContext.getBean("ObjectEquality");
    }

    @Test
    public void objectEquality() {
        //Intentional fail. Test recycled.
        System.out.println(object1.hashCode());
        System.out.println(object2.hashCode());
        boolean result = objectEqualityInterface.objectEquality(object1, object1);
        System.out.println(result);
        Assert.fail("Test intentionally failed.");
    }
}