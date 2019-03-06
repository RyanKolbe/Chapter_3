package com.ryankolbe.multi_module;

public class BirdInterfaceImplementation implements AnimalActionInterface {

    @Override
    public String animalAction(String animalType) {
        return "Birds can fly.";
    }
}
