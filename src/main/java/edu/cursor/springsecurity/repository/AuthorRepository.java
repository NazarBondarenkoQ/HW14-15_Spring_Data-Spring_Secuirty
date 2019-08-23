package edu.cursor.springsecurity.repository;

import edu.cursor.springsecurity.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
}
