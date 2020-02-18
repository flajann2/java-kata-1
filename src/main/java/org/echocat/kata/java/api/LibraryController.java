package org.echocat.kata.java.api;

import org.echocat.kata.java.model.Author;
import org.echocat.kata.java.model.Book;
import org.echocat.kata.java.model.Magazine;

import org.echocat.kata.java.service.LibraryService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController {
    private final LibraryService libraryService = new LibraryService();
}
