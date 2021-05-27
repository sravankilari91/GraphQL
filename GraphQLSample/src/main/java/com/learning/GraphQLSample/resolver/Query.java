package com.learning.GraphQLSample.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.learning.GraphQLSample.entity.Books;
import com.learning.GraphQLSample.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Query implements GraphQLQueryResolver {

    @Autowired
    private BooksRepository booksRepository;

    public Query(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    public Iterable<Books> findAllBooks() {
        return booksRepository.findAll();
    }
}
