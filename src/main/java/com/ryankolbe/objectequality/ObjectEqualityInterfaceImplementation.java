package com.ryankolbe.objectequality;

public class ObjectEqualityInterfaceImplementation implements ObjectEqualityInterface {
    @Override
    public boolean objectEquality(ObjectEqualityModel object1, ObjectEqualityModel object2) {
        return object1.equals(object2);
    }
}
