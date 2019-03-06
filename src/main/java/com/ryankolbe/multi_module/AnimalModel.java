package com.ryankolbe.multi_module;

public class AnimalModel {
    private String animalType;

    public AnimalModel(String animalType) {
        this.animalType = animalType;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    @Override
    public String toString() {
        return "AnimalModel{" +
                "animalType='" + animalType + '\'' +
                '}';
    }
}
