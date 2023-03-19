package com.example.demo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Document(collection="todos")
public class Todo {

	@Id
    private String id;
        
    private String name;

    private Integer status;

    private String detail;

}
