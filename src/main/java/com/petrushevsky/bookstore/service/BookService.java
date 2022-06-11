package com.petrushevsky.bookstore.service;

import com.petrushevsky.bookstore.domain.Books;

import java.util.List;
import java.util.Optional;

//@Service
public interface BookService {
    Books create(Books books);
    List<Books> getAll();
    Books findById(Integer id);
    List<Books> findByName(String name);
    Books updateByID(Integer id,Books books);
     void delete(Integer id);
}