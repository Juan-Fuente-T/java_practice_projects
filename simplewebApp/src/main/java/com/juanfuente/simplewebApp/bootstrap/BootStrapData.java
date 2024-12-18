package com.juanfuente.simplewebApp.bootstrap;

import com.juanfuente.simplewebApp.model.Author;
import com.juanfuente.simplewebApp.model.Book;
import com.juanfuente.simplewebApp.model.Publisher;
import com.juanfuente.simplewebApp.repositories.AuthorRepository;
import com.juanfuente.simplewebApp.repositories.BookRepository;
import com.juanfuente.simplewebApp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Started in bootstrap");

        Publisher alice = new Publisher("Alice", "Una direccion, 7", "Barcelona", "Cataluna", "123");
        publisherRepository.save(alice);
        System.out.println("Number of publishers:  " + publisherRepository.count());

        Author juan = new Author("Juan", "García");
        Book book1 = new Book("Domain Design Driven", "123456");

        juan.getBooks().add(book1);
        book1.getAuthors().add(juan);
        alice.getBooks().add(book1);
        book1.setPublisher(alice);
        authorRepository.save(juan);
        bookRepository.save(book1);
        publisherRepository.save(alice);

        Author pedro = new Author("Pedro", "López");
        Book book2 = new Book("Libro LoQueSea", "987654");

        pedro.getBooks().add(book2);
        book2.getAuthors().add(pedro);
        book2.setPublisher(alice);
        alice.getBooks().add(book2);
        authorRepository.save(pedro);
        bookRepository.save(book2);
        publisherRepository.save(alice);

        System.out.println("Number of books:  " + bookRepository.count());
        System.out.println("Number of authors:  " + authorRepository.count());
        System.out.println("Number of books for Alice:  " + alice.getBooks().size());
    }
}
