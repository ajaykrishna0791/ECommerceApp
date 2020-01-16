package com.caseStudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.caseStudy.DAO")
@EnableTransactionManagement
@ComponentScan(basePackages = "com.caseStudy")
@EntityScan(basePackages = "com.caseStudy.model")
@RestController
public class SpringbootStarterApp {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootStarterApp.class, args);
    }

    @RequestMapping("/")
    public String hello() {
        return "Hello App";
    }
}
