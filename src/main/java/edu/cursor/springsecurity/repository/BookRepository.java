package edu.cursor.springsecurity.repository;

import edu.cursor.springsecurity.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
