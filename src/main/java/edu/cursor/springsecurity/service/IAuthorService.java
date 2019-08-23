package edu.cursor.springsecurity.service;


import edu.cursor.springsecurity.models.Author;

import java.util.Optional;

public interface IAuthorService {
    void saveAuthor(Author author);

    Optional<Author> findAuthor(Integer authorID);

    void deleteAuthor(Integer authorID);

}
