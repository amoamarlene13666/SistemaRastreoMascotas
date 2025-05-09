package com.rastreo.mascotas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.rastreo.mascotas")
@EnableJpaRepositories(basePackages = "com.rastreo.mascotas")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}