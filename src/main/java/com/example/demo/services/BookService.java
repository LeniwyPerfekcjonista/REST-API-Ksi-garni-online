package com.example.demo.services;

import com.example.demo.models.entities.dtos.BookDto;
import com.example.demo.models.entities.models.Book;
import com.example.demo.repositories.BookRepository;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class BookService {

    private final BookRepository repository;

    public BookService(BookRepository repository){
        this.repository = repository;
    }

    public BookDto save () {
        return BookDto.fromEntity(repository.save(Book.fromDto(bookDto)));
    }
    public List<BookDto> findAll(){
        return repository.findAll().stream().map(book -> BookDto.fromEntity(book)).collect(Collectors.toList());
    }
    public BookDto findById(Integer id){
        return BookDto.fromEntity(repository.findById(id).orElseThrow(NoSuchElementException::new));
    }
    public BookDto edit(BookDto book){
        return BookDto.fromEntity(repository.save(Book.fromDto(bookDto)));
    }

    public void deleted(Integer id){
        repository.delete(id);
    }
}
