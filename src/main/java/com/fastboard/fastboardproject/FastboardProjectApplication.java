package com.fastboard.fastboardproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@ConfigurationPropertiesScan
public class FastboardProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(FastboardProjectApplication.class, args);
    }

}
