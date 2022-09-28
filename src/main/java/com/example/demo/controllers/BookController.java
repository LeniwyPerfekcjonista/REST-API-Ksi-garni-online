package com.example.demo.controllers;

import com.example.demo.models.entities.dtos.BookDto;
import com.example.demo.services.BookService;
import lombok.Builder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Builder
public class BookController {

    private final BookService service;

    public BookController(BookService service){
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<BookDto> save(@RequestBody BookDto){
        return ResponseEntity.ok(service.save());
    }
    @GetMapping
    public ResponseEntity<List<BookDto>> findAll(){
        return ResponseEntity.ok(service.findAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<BookDto> findById(@PathVariable Integer id){
        return ResponseEntity.ok(service.edit(new BookDto));
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleted (@PathVariable Integer id){
        service.deleted(id);
    }

}
