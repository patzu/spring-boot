package com.example.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class ProfileApplication implements ApplicationRunner {
    @Autowired
    Environment environment;

    public static void main(String[] args) {
        SpringApplication.run(ProfileApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        for (String activeProfile : environment.getActiveProfiles()) {
            System.out.println(activeProfile);
        }
    }
}
