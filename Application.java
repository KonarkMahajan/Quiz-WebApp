package com.learn.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

// To build this project, run the following command:
// mvn clean install --settings /Users/kmahajan/.m2/settings-local.xml
// http://localhost:15672/ for RabbitMQ management console

@EnableScheduling
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        System.out.println("ENVIRONMENTS" + System.getenv());
    }

}
