package com.persado.assignment.project.controller;

import com.persado.assignment.project.controller.mappers.CreateBookToModelMapper;
import com.persado.assignment.project.domain.Books;
import com.persado.assignment.project.form.CreateBookForm;
import com.persado.assignment.project.models.BookModel;
import com.persado.assignment.project.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
public class BookController {

    private static final String CREATE_BOOK_FORM = "createBookForm";
    @Autowired
    private BookServiceImpl bookServiceImpl;
    @Autowired
    private CreateBookToModelMapper mapper;

    @GetMapping(value = "/create_book")
    public String createUser(Model model) {
        model.addAttribute(CREATE_BOOK_FORM,
                new CreateBookForm());
        return "create_book";

    }
    @PostMapping(value = "/create_book")
    public String createUser(Model model,
                             @Valid @ModelAttribute(CREATE_BOOK_FORM)
                                     CreateBookForm createBookForm,
                             BindingResult bindingResult){


        BookModel bookModel = mapper.createBookFormToBookModel(createBookForm);
        bookServiceImpl.create(bookModel);
        return "redirect:/";
    }
    @GetMapping("/manage_books")
    public String booksList(Model model){
        List<Books> books = bookServiceImpl.findAllBooks();
        model.addAttribute("list",books);
        return "manage_books";
    }

}
