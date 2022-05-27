package com.petrushevsky.bookstore.service;

import com.petrushevsky.bookstore.domain.Books;
import com.petrushevsky.bookstore.repository.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class BookServiceBean implements BookService{
    // @Autowired
    private final BookRepository bookRepository;


    @Override
    public List<Books> read() {
        return bookRepository.findAll();
    }

    @Override
    public List<Books> findByName(String name) {
        List<Books> books = bookRepository.findByName(name);
        return books;
    }
/*
    public Collection<Books> findBooksByNameByName(String name){
        Collection<Books> collection = bookRepository.findByName(name);
        return collection;
    }*/
    @Override
    public Optional<Books> update(Books books) {
        return bookRepository.findById(books.getId())
                .map(entity -> {
                    entity.setName(books.getName());
                    entity.setAuthor(books.getAuthor());
                    return bookRepository.save(books);
                });
    }
    @Override
    public void delete(Books books){
      bookRepository.deleteById(books.getId());
    }
    @Override
    public Books create(Books books) {
        return bookRepository.save(books);
    }
}
