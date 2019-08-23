package edu.cursor.springsecurity.service;


import edu.cursor.springsecurity.models.Book;

public interface IBookService {
    void saveBook(Book book);

    Book findBook(Integer bookID);

    void deleteBook(Integer bookID);

}
