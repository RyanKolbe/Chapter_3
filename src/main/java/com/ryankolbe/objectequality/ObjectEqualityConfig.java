package com.ryankolbe.objectequality;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ObjectEqualityConfig {
    @Bean(name = "ObjectEquality")
    public ObjectEqualityInterface getService() {
        return new ObjectEqualityInterfaceImplementation();
    }
}