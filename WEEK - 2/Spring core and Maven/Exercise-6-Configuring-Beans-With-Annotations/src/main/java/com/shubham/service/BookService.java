package com.shubham.service;

import com.shubham.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    private BookRepository bookRepository;

    @Autowired
    public void setBookRepository(BookRepository bookRepository) {

        this.bookRepository = bookRepository;

    }

    public void verifyConfiguration() {

        System.out.println(bookRepository.fetchRepositoryStatus());

        System.out.println("Book Service detected through @Service annotation!!..");

        System.out.println("Annotation-based bean configuration completed successfully!!..");

    }
}