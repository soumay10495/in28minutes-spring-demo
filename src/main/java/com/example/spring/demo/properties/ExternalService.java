package com.example.spring.demo.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ExternalService {
    @Value("${external.service.url}")
    private String url;

    public String getUrl() {
        return url;
    }
}
