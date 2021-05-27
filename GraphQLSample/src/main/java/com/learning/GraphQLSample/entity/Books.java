package com.learning.GraphQLSample.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Builder
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {

    @GeneratedValue
    @Id
    private long id;
    private String bookName;
    private int publishYear;
    //private Author author;
}
