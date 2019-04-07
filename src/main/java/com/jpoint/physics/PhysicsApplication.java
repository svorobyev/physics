package com.jpoint.physics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class PhysicsApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhysicsApplication.class, args);
    }

}
