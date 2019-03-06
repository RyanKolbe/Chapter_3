package com.ryankolbe.timeouts;

public class TimeoutsModel {
    private String name;

    public TimeoutsModel(String name) {
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
        return "TimeoutsModel{" +
                "name='" + name + '\'' +
                '}';
    }
}
