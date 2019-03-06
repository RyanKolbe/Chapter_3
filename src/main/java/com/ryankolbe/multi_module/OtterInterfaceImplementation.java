package com.ryankolbe.multi_module;

public class OtterInterfaceImplementation implements AnimalActionInterface {

    @Override
    public String animalAction(String animalType) {
        return "Otters can swim.";
    }
}
