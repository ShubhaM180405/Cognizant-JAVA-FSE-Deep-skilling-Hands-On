package com.shubham.exercise9.service;

import com.shubham.exercise9.entity.Book;
import com.shubham.exercise9.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    private final BookRepository repository;

    public BookService(BookRepository repository) {
        this.repository = repository;
    }

    public Book addBook(Book book) {
        return repository.save(book);
    }

    public List<Book> getAllBooks() {
        return repository.findAll();
    }

    public Optional<Book> getBookById(Long id) {
        return repository.findById(id);
    }

    public Book updateBook(Long id, Book updatedBook) {

        Book book = repository.findById(id).orElse(null);

        if (book == null) {
            return null;
        }

        book.setTitle(updatedBook.getTitle());
        book.setAuthor(updatedBook.getAuthor());

        return repository.save(book);
    }

    public void deleteBook(Long id) {
        repository.deleteById(id);
    }

}