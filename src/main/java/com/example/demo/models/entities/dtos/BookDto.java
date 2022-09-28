package com.example.demo.models.entities.dtos;

import com.example.demo.models.entities.models.Book;
import lombok.Builder;

public class BookDto {
    private Integer id;
    private String name;
    private String description;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public BookDto(Integer id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public static BookDto fromEntity(Book book) {
        return new BookDto(
                book.getId(),
                book.getName(),
                book.getDiscription()
        );
    }
}
