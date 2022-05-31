package com.petrushevsky.bookstore.service;

import com.petrushevsky.bookstore.domain.Books;
import com.petrushevsky.bookstore.repository.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.web.reactive.error.ErrorAttributes;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class BookServiceBean implements BookService {
    // @Autowired
    private final BookRepository bookRepository;


    @Override
    public List<Books> read() {
        return bookRepository.findAll();
    }

    @Override
    public Books findById(Integer id) {

        Books book = getBookId(id);


        if ( book.getDeleted()) {

            throw new EntityNotFoundException("Book book with id = " + id + " was deleted");
        }


        //return bookRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Not found = " + id));
        return book;
    }

    private Books getBookId(Integer id) {
        Books book = bookRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Book not found with id = " + id));
        return book;
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
    public String errorMessage(String message) {
        return message;
    }

    @Override
    public void delete(Integer id) {
        Books book = getBookId(id);
        book.setDeleted(Boolean.TRUE);
        bookRepository.save(book);

        //  bookRepository.deleteById(id);
    }

    @Override
    public Books create(Books books) {
        return bookRepository.save(books);
    }
}
