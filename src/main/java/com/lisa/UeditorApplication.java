package com.lisa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement 
@SpringBootApplication
@EnableScheduling
public class UeditorApplication extends SpringBootServletInitializer{
	@Override 
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(UeditorApplication.class);
    }
    public static void main(String[] args) throws Exception {
        SpringApplication.run(UeditorApplication.class, args);
    } 
}
