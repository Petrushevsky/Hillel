package com.petrushevsky.bookstore.web;

import com.petrushevsky.bookstore.domain.Books;
import com.petrushevsky.bookstore.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
public class BookController {
    // @Autowired(required = false)
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/books")
    @ResponseStatus(HttpStatus.OK)
    public List<Books> readAllBooks() {
        return bookService.read();
    }
    @GetMapping(value = "/books", params={"name"})
    @ResponseStatus(HttpStatus.OK)
    public List<Books> findBookByName(String name) {
        return bookService.findByName(name);
    }

    @PutMapping("/books")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Books> updateBook(@RequestBody Books books) {
        return bookService.update(books);
    }

    @DeleteMapping("/books")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removeBooksById(@RequestBody Books books) {
       bookService.delete(books);
    }

    @PostMapping("/books")
    @ResponseStatus(HttpStatus.CREATED)
    public Books crateBook(@RequestBody Books books) {
        return bookService.create(books);
    }


}
