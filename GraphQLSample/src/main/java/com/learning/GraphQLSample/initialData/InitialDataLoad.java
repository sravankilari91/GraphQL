package com.learning.GraphQLSample.initialData;

import com.learning.GraphQLSample.entity.Books;
import com.learning.GraphQLSample.repository.BooksRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InitialDataLoad {
    @Bean
    CommandLineRunner LoadDB(BooksRepository booksRepository) {
        return args -> {
            booksRepository.save(Books.builder().bookName("Java").publishYear(1991).build());
            booksRepository.save(Books.builder().bookName("C++").publishYear(1992).build());
            booksRepository.save(Books.builder().bookName("DevOps").publishYear(1994).build());
        };
    }
}
