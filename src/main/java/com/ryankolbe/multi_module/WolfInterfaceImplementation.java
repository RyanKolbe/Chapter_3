package com.ryankolbe.multi_module;

public class WolfInterfaceImplementation implements AnimalActionInterface {

    String animalType = "Wolf";

    @Override
    public String animalAction(String animalType) {
        return "Wolves can snarl.";
    }
}
