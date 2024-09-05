package com.alex.crud.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alex.crud.entities.Book;
import com.alex.crud.repositories.BookRepository;

@Service
public class BookServiceImpl implements BookService { // clase a implementar la interface
    @Autowired
    BookRepository bookRepository;

    @Override
    public Book saveBook(Book book){
        return bookRepository.save(book);
    }

    @Override
    public Book updateBook(Book book){
        return bookRepository.save(book);
    }
    @Override
    public List<Book> getBooks(){
        return bookRepository.findAll();
    }
    @Override
    public Optional<Book> getBookById(Long id){
        return bookRepository.findById(id);
    }
    @Override
    public void deleteBook(Long id){
        bookRepository.deleteById(id);
    }
}
