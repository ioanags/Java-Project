package com.persado.assignment.project.controller;

import com.persado.assignment.project.controller.mappers.CreateBookToModelMapper;
import com.persado.assignment.project.controller.mappers.DeleteMapper;
import com.persado.assignment.project.domain.Books;
import com.persado.assignment.project.form.CreateBookForm;
import com.persado.assignment.project.form.DeleteForm;
import com.persado.assignment.project.models.BookModel;
import com.persado.assignment.project.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    @Autowired
    private DeleteMapper deleteMapper;

    @GetMapping(value = "/create_book")
    public String createUser(Model model) {
        model.addAttribute(CREATE_BOOK_FORM,
                new CreateBookForm());
        return "create_book";

    }
    @PostMapping(value = "/create_book")
    public String createUser(@Valid @ModelAttribute(CREATE_BOOK_FORM)
                                     CreateBookForm createBookForm){


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
    @GetMapping("/delete_book")
    public String deleteUser(Model model,
                             DeleteForm deleteForm){
        List<Books> books = bookServiceImpl.findAllBooks();
        model.addAttribute("list",books);
        BookModel bookModel = deleteMapper.bookDelete(deleteForm);
        bookServiceImpl.delete(bookModel.getId());
        return "redirect:/manage_books";
    }

}
