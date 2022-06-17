package com.petrushevsky.bookstore.web;

import com.petrushevsky.bookstore.domain.Books;
import com.petrushevsky.bookstore.dto.BooksDto;
import com.petrushevsky.bookstore.dto.BooksReadDto;
import com.petrushevsky.bookstore.util.config.BookConverter;
import com.petrushevsky.bookstore.service.BookService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.*;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
@Slf4j
@Tag(name ="Booksstore", description = "Books API")
public class BookController {


    private final BookService bookService;
    private final BookConverter converter;

    @PostMapping("/books")
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(summary = "This is endpoint to add a new book.", description = "Create request to add a new book.", tags = {"Books"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "CREATED. The new book is successfully created and added to database."),
            @ApiResponse(responseCode = "400", description = "Invalid input"),
            @ApiResponse(responseCode = "404", description = "NOT FOUND. Specified book request not found."),
            @ApiResponse(responseCode = "409", description = "Book already exists")})
    public BooksDto saveBook(@RequestBody @Valid BooksDto requestForSave){
        var book = converter.getMapperFacade().map(requestForSave, Books.class);
        var dto = converter.toDto(bookService.create(book));
        return dto;

    }


    @GetMapping("/books")
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "This is endpoint returns all records with books.", description = "Create request to view all books", tags = {"Book"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "OK. Welldone."),
            @ApiResponse(responseCode = "400", description = "Invalid input"),
            @ApiResponse(responseCode = "404", description = "NOT FOUND. Specified employee request not found."),
            @ApiResponse(responseCode = "409", description = "Something goes wrong. Oops")})
      public List<Books> readAllBooksFromDto() {
            return bookService.getAll();
    }



    @GetMapping(value = "/books", params={"name"})
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "This is endpoint finds a book by its NAME.", description = "Create request to find record with a books named", tags = {"Book"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "OK. Welldone."),
            @ApiResponse(responseCode = "400", description = "Invalid input"),
            @ApiResponse(responseCode = "404", description = "NOT FOUND. Specified employee request not found."),
            @ApiResponse(responseCode = "409", description = "Something goes wrong. Oops")})
    public List<Books> findBookByName(String name) {
        return bookService.findByName(name);
    }


    @GetMapping("/books/{id}")
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "This is endpoint returned a book by his id.", description = "Create request to read a book by id", tags = {"Book"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "OK. pam pam param."),
            @ApiResponse(responseCode = "400", description = "Invalid input"),
            @ApiResponse(responseCode = "404", description = "NOT FOUND. Specified employee request not found."),
            @ApiResponse(responseCode = "409", description = "Employee already exists")})
    public BooksReadDto findBySomeID(@PathVariable Integer id){
        log.debug("getEmployeeById() Controller - start: id = {}", id);
        var book = bookService.getById(id);
        log.debug("getById() Controller - to dto start: id = {}", id);
        var dto = converter.toReadDto(book);
        log.debug("getEmployeeById() Controller - end: name = {}", dto.name);
        return dto;
    }


    @PutMapping("/books/{id}")
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "This is endpoint updates a book by it's id.", description = "Create put request to read a book by id", tags = {"Book"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "OK. Welldone."),
            @ApiResponse(responseCode = "400", description = "Invalid input"),
            @ApiResponse(responseCode = "404", description = "NOT FOUND. Specified employee request not found."),
            @ApiResponse(responseCode = "409", description = "Something goes wrong. Oops")})
    public Books refreshBook(@PathVariable("id") Integer id, @RequestBody Books books) {
        return bookService.updateByID(id,books);
    }

    @PatchMapping ("/books/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @Operation(summary = "This is endpoint deletes a book by its id.", description = "Create request to delete record with a book by id", tags = {"Book"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "OK. Welldone."),
            @ApiResponse(responseCode = "400", description = "Invalid input"),
            @ApiResponse(responseCode = "404", description = "NOT FOUND. Specified employee request not found."),
            @ApiResponse(responseCode = "409", description = "Something goes wrong. Oops")})
    public void removeBooksById(@PathVariable Integer id) {
        bookService.delete(id);
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