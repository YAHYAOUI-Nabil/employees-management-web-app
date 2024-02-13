package com.employees.managment.webapp.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "com.employees.management.webapp")
@Data
public class CustomProperties {
    private String apiUrl;
}
