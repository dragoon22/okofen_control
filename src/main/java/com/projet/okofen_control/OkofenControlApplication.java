package com.projet.okofen_control;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class OkofenControlApplication {

    public static void main(String[] args) {
        SpringApplication.run(OkofenControlApplication.class, args);
    }

}
