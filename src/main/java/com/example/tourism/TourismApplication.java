package com.example.tourism;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
@EnableReactiveMongoRepositories
public class TourismApplication {

    public static void main(String[] args) {
        SpringApplication.run(TourismApplication.class, args);
    }

}
