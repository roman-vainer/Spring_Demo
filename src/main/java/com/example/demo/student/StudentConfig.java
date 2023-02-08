package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student bob = new Student(
                    "Bob",
                    "bob@gmail.com",
                    LocalDate.of(2000, 01, 01));
            Student alisa = new Student(
                    "Alisa",
                    "alisa@gmail.com",
                    LocalDate.of(2003, 02, 02));
            repository.saveAll(List.of(bob, alisa));
        };
    }
}
