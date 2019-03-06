package com.ryankolbe.multi_module;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnimalConfig {
    @Bean(name = "Bird")
    public AnimalActionInterface getBirdService() {
        return new BirdInterfaceImplementation();
    }

    @Bean(name = "Wolf")
    public AnimalActionInterface getWolfService() {
        return new WolfInterfaceImplementation();
    }

    @Bean(name = "Otter")
    public AnimalActionInterface getOtterService() {
        return new OtterInterfaceImplementation();
    }
}
