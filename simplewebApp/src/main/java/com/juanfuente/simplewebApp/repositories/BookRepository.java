package com.juanfuente.simplewebApp.repositories;

import com.juanfuente.simplewebApp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
