package edu.cursor.springsecurity.service;

import edu.cursor.springsecurity.models.Author;

public interface AuthorService {
    void saveAuthor(Author author);

    Author findAuthor(Integer authorID);

    void deleteAuthor(Integer authorID);

}