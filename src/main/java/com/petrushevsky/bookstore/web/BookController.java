package com.petrushevsky.bookstore.web;

import com.petrushevsky.bookstore.domain.Books;
import com.petrushevsky.bookstore.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.*;

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
        return bookService.getAll();
    }

    @GetMapping(value = "/books", params={"name"})
    @ResponseStatus(HttpStatus.OK)
    public List<Books> findBookByName(String name) {
        return bookService.findByName(name);
    }


    @GetMapping("/books/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Books findBySomeID(@PathVariable Integer id){
        return bookService.findById(id);
    }


    @PutMapping("/books/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Books refreshBook(@PathVariable("id") Integer id, @RequestBody Books books) {
        return bookService.updateByID(id,books);
    }

    @PatchMapping ("/books/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removeBooksById(@PathVariable Integer id) {
        bookService.delete(id);
    }


    @PostMapping("/books")
    @ResponseStatus(HttpStatus.CREATED)
    public Books crateBook(@RequestBody Books books) {
        return bookService.create(books);
    }

    /*
    @ExceptionHandler(Exception.class)
    public ResponseEntity<Map<String, String>> handleException(
            Exception e) throws IOException {
        Map<String, String> errorResponse = new HashMap<>();
        errorResponse.put("Error message", e.getLocalizedMessage());
        errorResponse.put("OUR Error status", HttpStatus.INTERNAL_SERVER_ERROR.toString());

        return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }*/

}