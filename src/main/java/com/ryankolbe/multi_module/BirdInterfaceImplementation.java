package com.ryankolbe.multi_module;

public class BirdInterfaceImplementation implements AnimalActionInterface {

    String animalType = "Bird";

    @Override
    public String animalAction(String animalType) {
        return "Birds can fly.";
    }
}
