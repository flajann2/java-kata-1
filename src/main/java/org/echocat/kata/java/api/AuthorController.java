package org.echocat.kata.java.api;

import org.echocat.kata.java.model.Author;
import org.echocat.kata.java.service.AuthorService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorController {
    private final AuthorService authorService = new AuthorService();
}









