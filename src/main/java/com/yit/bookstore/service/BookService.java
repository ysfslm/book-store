package com.yit.bookstore.service;

import com.yit.bookstore.model.Book;
import com.yit.bookstore.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Optional<Book> findBookById(Integer bookId) {
        return bookRepository.findById(bookId);
    }


}
