package com.ryankolbe.disablingtest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DisablingTestConfig {
    @Bean(name = "DisablingTest")
    public DisablingTestInterface getService() {
        return new DisablingTestInterfaceImplementation();
    }
}
