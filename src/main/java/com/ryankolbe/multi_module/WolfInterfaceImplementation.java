package com.ryankolbe.multi_module;

public class WolfInterfaceImplementation implements AnimalActionInterface {

    @Override
    public String animalAction(String animalType) {
        return "Wolves can snarl.";
    }
}
