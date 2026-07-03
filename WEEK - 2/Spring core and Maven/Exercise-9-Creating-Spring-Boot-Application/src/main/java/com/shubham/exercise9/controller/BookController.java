package com.shubham.exercise9.controller;

import com.shubham.exercise9.entity.Book;
import com.shubham.exercise9.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService service;

    public BookController(BookService service) {
        this.service = service;
    }

    @PostMapping
    public Book addBook(@RequestBody Book book) {
        return service.addBook(book);
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return service.getAllBooks();
    }

    @GetMapping("/{id}")
    public Optional<Book> getBook(@PathVariable Long id) {
        return service.getBookById(id);
    }

    @PutMapping("/{id}")
    public Book updateBook(@PathVariable Long id,
                           @RequestBody Book book) {
        return service.updateBook(id, book);
    }

    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable Long id) {

        service.deleteBook(id);

        return "Book deleted successfully.";

    }

}