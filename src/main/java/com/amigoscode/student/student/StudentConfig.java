package com.amigoscode.student.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
   /* @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student iheb = new Student(
                     "iheb"
                    , "ihebtbessi37@gmail.com"
                    , LocalDate.of(2001, Month.JUNE, 14)

            );
            Student yahya = new Student(
                     "yahya"
                    , "yahya579@gmail.com"
                    , LocalDate.of(2004, Month.JANUARY, 5)

            );
            repository.saveAll(
                    List.of(iheb,yahya)
            );
        };

    }*/
}
