package edu.cursor.springsecurity.service;

import edu.cursor.springsecurity.models.Book;

public interface BookService {
    void saveBook(Book book);

    Book findBook(Integer bookID);

    void deleteBook(Integer bookID);

}