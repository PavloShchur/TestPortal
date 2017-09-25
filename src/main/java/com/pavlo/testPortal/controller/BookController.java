package com.pavlo.testPortal.controller;

import com.pavlo.testPortal.editor.AuthorEditor;
import com.pavlo.testPortal.entity.Author;
import com.pavlo.testPortal.entity.Book;
import com.pavlo.testPortal.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BookController {

    @Autowired
    BookService bookService;

    @Autowired
    AuthorEditor authorEditor;


    @PostMapping(value = "saveBookWithAuthor")
    public String saveBookWithAuthor(@ModelAttribute("emptyBook")Book book) {

            bookService.save(book);

        return "redirect:/getAllBooks";
    }



    @InitBinder
    public void bind(WebDataBinder webDataBinder) {

        webDataBinder.registerCustomEditor(Author.class, authorEditor);
    }
}













