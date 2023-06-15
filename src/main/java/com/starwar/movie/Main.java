package com.starwar.movie;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.starwar.movie.repository", "com.starwar.movie.controller",
//         "com.starwar.movie.impl"})
//@Configuration
//@EnableAutoConfiguration
//@ComponentScan
//@EnableJpaRepositories(basePackages = "com.starwar.movie.repository")
//@EntityScan(basePackages = "com.starwar.movie.model")
public class Main extends SpringBootServletInitializer implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Main.class);
    }

    @Override
    public void run(String... strings) throws Exception {
        System.out.println("========================================================================== " +
                "APPLICATION STATUS: RUNNING ==========================================================================");
    }
}