package org.example.service;

import org.example.model.Book;
import org.example.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

    public List getAllBooks(){
        List books = new ArrayList();
        bookRepository.findAll().forEach(book -> books.add(book));
        return books;
    }

    public Book getBookId(long id){
        return bookRepository.findById(id).get();
    }

    public List getBookTitle(String title) {
        List books = new ArrayList<>();
        bookRepository.findByTitle(title).forEach(book -> books.add(book));
        return books;
    }


    public List getBookList(String title, String genre){
        Book book = new Book();
        book.setTitle(title);
        book.setGenre(genre);
        bookRepository.save(book);
        List books = new ArrayList<>();
        books.add(book);
        return books;
    }
    
    public void deleteBook(Long id){
        if(bookRepository.findById(id).isPresent()) {
            bookRepository.deleteById(id);
        }
    }
}
