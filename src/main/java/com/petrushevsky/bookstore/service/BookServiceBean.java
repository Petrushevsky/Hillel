package com.petrushevsky.bookstore.service;

import com.petrushevsky.bookstore.domain.Books;
import com.petrushevsky.bookstore.repository.BookRepository;
import com.petrushevsky.bookstore.util.ResourceNotFoundException;
import com.petrushevsky.bookstore.util.ResourceWasDeletedException;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;


//@Service //ok
@AllArgsConstructor
@Slf4j
@org.springframework.stereotype.Service
public class BookServiceBean implements BookService {
    // @Autowired
    private final BookRepository bookRepository;

    @Override
    public Books create(Books books) {
        return bookRepository.save(books);
    }

    @Override
    public List<Books> getAll() {
        return bookRepository.findAll();
    }

    @Override
    public Books findById(Integer id) {
        Books books = bookRepository.findById(id)
                .orElseThrow(ResourceNotFoundException::new);
        /*Books book = getBookId(id);

        if (book.getDeleted()) {
            throw new EntityNotFoundException("Book book with id = " + id + " was deleted");
        }
        //return bookRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Not found = " + id));*/
        return books;
    }
/*
    private Books getBookId(Integer id) {
        Books book = bookRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Book not found with id = " + id));
        return book;
    }*/

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
    public Books updateByID(Integer id, Books books) {
        return bookRepository.findById(id)
                .map(entity -> {
                    entity.setName(books.getName());
                    entity.setAuthor(books.getAuthor());
                    return bookRepository.save(books);
                })
                .orElseThrow(() -> new EntityNotFoundException("Books with this id = " + id + " not found"));
    }

    @Override
    public void delete(Integer id) {
        Books book = bookRepository.findById(id)
                .orElseThrow(ResourceWasDeletedException::new);
        bookRepository.delete(book);
        /*
        book.setDeleted(Boolean.TRUE);
        bookRepository.save(book);

        bookRepository.deleteById(id);*/
    }


}