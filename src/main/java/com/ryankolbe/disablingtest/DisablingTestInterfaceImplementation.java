package com.ryankolbe.disablingtest;

public class DisablingTestInterfaceImplementation implements DisablingTestInterface{
    @Override
    public String concatName(String name) {
        return name.concat(" Kolbe");
    }
}
