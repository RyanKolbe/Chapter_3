package com.ryankolbe.disablingtest;

public class DisablingTestModel {

    private String name;

    public DisablingTestModel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "DisablingTestModel{" +
                "name='" + name + '\'' +
                '}';
    }
}
