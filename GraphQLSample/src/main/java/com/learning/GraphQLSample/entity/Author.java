package com.learning.GraphQLSample.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Builder
//@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Author {
    private String authorName;
    private String authorExperience;
}
