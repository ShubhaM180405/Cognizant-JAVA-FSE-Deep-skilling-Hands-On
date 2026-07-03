package com.shubham.service;

import com.shubham.model.LibraryInfo;
import com.shubham.repository.BookRepository;

public class BookService {

    private LibraryInfo libraryInfo;
    private BookRepository bookRepository;

    // Constructor Injection
    public BookService(LibraryInfo libraryInfo) {
        this.libraryInfo = libraryInfo;
    }

    // Setter Injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayLibraryStatus() {

        System.out.println("Library Name : " + libraryInfo.getLibraryName());
        System.out.println(bookRepository.getRepositoryStatus());
        System.out.println("Constructor and Setter Injection configured successfully!!..");

    }
}