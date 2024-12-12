package com.xworkx.travelplace.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("com.xworkz.travelplace")
@EnableWebMvc
public class WebConfiguration {
    public WebConfiguration() {
        System.out.println("creating no arg WebConfiguration constructor");
    }
}
