package ru.netology.sbAuthorization;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("ru.netology.sbAuthorization")
public class SbAuthorizationApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbAuthorizationApplication.class, args);

    }

}
