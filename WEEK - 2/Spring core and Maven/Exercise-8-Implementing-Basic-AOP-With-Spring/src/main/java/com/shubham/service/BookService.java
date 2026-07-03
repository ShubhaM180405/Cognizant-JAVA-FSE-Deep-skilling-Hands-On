package com.shubham.service;

import com.shubham.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayBookInformation() {

        System.out.println(bookRepository.getBookDetails());

        System.out.println("Book Service executed successfully!!..");

    }

}