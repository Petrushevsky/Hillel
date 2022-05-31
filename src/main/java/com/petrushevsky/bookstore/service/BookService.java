package com.petrushevsky.bookstore.service;

import com.petrushevsky.bookstore.domain.Books;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

//@Service
public interface BookService {
    Books create(Books books);
    List<Books> read();
    Books findById(Integer id);
    List<Books> findByName(String name);
    Optional<Books> update(Books books);
    String errorMessage(String message);
    void delete(Integer id);
}
