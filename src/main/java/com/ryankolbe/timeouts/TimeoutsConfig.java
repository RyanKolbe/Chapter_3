package com.ryankolbe.timeouts;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TimeoutsConfig {
    @Bean(name = "Timeouts")
    public TimeoutsInterface getService() {
        return new TimeoutsInterfaceImplementation();
    }
}
