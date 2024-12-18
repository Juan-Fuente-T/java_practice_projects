package com.juanfuente.simplewebApp.repositories;

import com.juanfuente.simplewebApp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
