package com.pavlo.testPortal.controller;


import com.pavlo.testPortal.entity.Answer;
import com.pavlo.testPortal.entity.Book;
import com.pavlo.testPortal.service.AnswerService;
import com.pavlo.testPortal.service.AuthorService;
import com.pavlo.testPortal.service.BookService;
import com.pavlo.testPortal.service.UserService;
import lombok.Getter;
import lombok.Setter;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Getter
@Setter
public class MainController {

    @Autowired
    UserService userService;

    @Autowired
    AnswerService answerService;

    private AuthorService authorService;
    private BookService bookService;

    @Autowired
    public MainController(AuthorService authorService, BookService bookService) {
        this.authorService = authorService;
        this.bookService = bookService;
    }


    @GetMapping("/getAllUsers")
    public String getAllUsers(Model model) {
        model.addAttribute("allUsers", userService.findAll());
        return "userViews/allUsers";
    }

    @GetMapping("/getAllAnswers")
    public String getAllAnswers(Model model) {
        model.addAttribute("allAnswers", answerService.findAll());
        model.addAttribute("emptyAnswer", new Answer());
        return "answerViews/allAnswers";
    }

    @GetMapping("/getAllBooks")
    public String getAllAuthors(Model model) {

            model.addAttribute("books", bookService.findAll());
            model.addAttribute("emptyBook", new Book());

        return "bookViews/allBooks";
    }


}
