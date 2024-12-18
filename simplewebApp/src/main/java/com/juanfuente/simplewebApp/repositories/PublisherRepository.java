package com.juanfuente.simplewebApp.repositories;

import com.juanfuente.simplewebApp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
