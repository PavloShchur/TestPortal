package com.pavlo.testPortal.controller;

import com.pavlo.testPortal.DTO.BookAuthorDTO;
import com.pavlo.testPortal.entity.Answer;
import com.pavlo.testPortal.entity.Book;
import com.pavlo.testPortal.service.AnswerService;
import com.pavlo.testPortal.service.AuthorService;
import com.pavlo.testPortal.service.BookService;
import com.pavlo.testPortal.service.UserService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

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

//    @GetMapping("/getAllBooks")
//    public String getAllAuthors(Model model) {
//
//        List<Book> books = bookService.fetchAuthor();
//        model.addAttribute("books", books);
//            model.addAttribute("emptyBook", new Book());
//
//        return "bookViews/allBooks";
//    }

    @GetMapping("/getAllBooks")
    public String getAllAuthors(Model model) {

        model.addAttribute("emptyBook", new Book());

        List<Book> books = bookService.fetchAuthor();
        System.out.println("books - " + books);
        books.forEach(book -> System.out.println(book.getAuthor()));
        List<BookAuthorDTO> bookAuthorDTOS = new ArrayList<BookAuthorDTO>();

        for (Book book : books) {

            BookAuthorDTO dto = new BookAuthorDTO();

            dto.setIdBook(book.getId());
            dto.setIdAuthor(book.getAuthor().getId());
            dto.setTitleOfBook(book.getTitleOfBook());
            dto.setNameOfAuthor(book.getAuthor().getNameOfAuthor());
            System.out.println("dto 83 = " + dto);
            dto.setSurnameOfAuthor(book.getAuthor().getSurnameOfAuthor());
            System.out.println("dto 85 = " + dto);

            bookAuthorDTOS.add(dto);

        }

        model.addAttribute("bookAuthorDTO", bookAuthorDTOS);
        System.out.println("bookAuthorDTOS - " + bookAuthorDTOS);

        return "bookViews/allBooks";
    }


}













