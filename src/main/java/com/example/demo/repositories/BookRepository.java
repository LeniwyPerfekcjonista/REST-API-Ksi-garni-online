package com.example.demo.repositories;

import com.example.demo.models.entities.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {
    void delete(Integer id);
}
