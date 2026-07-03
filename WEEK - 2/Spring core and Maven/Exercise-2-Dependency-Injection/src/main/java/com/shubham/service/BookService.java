package com.shubham.service;

import com.shubham.repository.BookRepository;

public class BookService {

    private BookRepository repository;

    public void setRepository(BookRepository repository) {
        this.repository = repository;
    }

    public void displayBook() {

        System.out.println("Book Name : " + repository.getBookDetails());

        System.out.println("Dependency Injection completed successfully!!..");

    }
}