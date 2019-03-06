package com.ryankolbe.multi_module;

public class OtterInterfaceImplementation implements AnimalActionInterface {

    String animalType = "Otter";

    @Override
    public String animalAction(String animalType) {
        return "Otters can swim.";
    }
}
