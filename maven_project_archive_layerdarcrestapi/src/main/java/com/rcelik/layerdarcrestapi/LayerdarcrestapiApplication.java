package com.rcelik.layerdarcrestapi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.rcelik.layerdarcrestapi")
public class LayerdarcrestapiApplication {
    public static void main(String[] args) {
        SpringApplication.run(LayerdarcrestapiApplication.class, args);
    }


    @Bean
    public CommandLineRunner loadData(InitDataLoader dataLoaderComponent) {
        return args -> dataLoaderComponent.load();
    }
}
