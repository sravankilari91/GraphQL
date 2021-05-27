package com.learning.GraphQLSample.repository;

import com.learning.GraphQLSample.entity.Books;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BooksRepository extends JpaRepository<Books, Long> {
}
