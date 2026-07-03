package com.shubham.service;

import com.shubham.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void initializeLibrary() {

        System.out.println(bookRepository.getRepositoryStatus());

        System.out.println("Book Service initialized successfully!!..");

        System.out.println("Spring IoC Container configured successfully!!..");

    }

}