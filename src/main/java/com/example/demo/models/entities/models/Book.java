package com.example.demo.models.entities.models;

import com.example.demo.models.entities.dtos.BookDto;
import lombok.Builder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.websocket.Session;
import java.time.LocalDate;

@Entity
@Builder
public class Book {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String discription;
    private LocalDate timestamp;

    public Book() {
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDiscription() {
        return discription;
    }

    public Book(Integer id, String name, String discription) {
        this.id = id;
        this.name = name;
        this.discription = discription;
        this.timestamp = timestamp.now();
    }
    public static Book fromDto(BookDto bookDto){
        return new Book(
                bookDto.getId(),
                bookDto.getName(),
                bookDto.getDescription()
        );
    }

}

