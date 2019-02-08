package com.persado.assignment.project.controller;

import com.persado.assignment.project.domain.Books;
import com.persado.assignment.project.domain.User;
import com.persado.assignment.project.service.BookServiceImpl;
import com.persado.assignment.project.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class LoanController {
    @Autowired
    private BookServiceImpl bookServiceImpl;
    @Autowired
    private UserServiceImpl userServiceImpl;


    @GetMapping("/loan_books")
    public String loanBooks(Model model){
        List<Books> books = bookServiceImpl.findAllBooks();
        List<User> users = userServiceImpl.findAll();
        model.addAttribute("list",books);
        model.addAttribute("users",users);
        return "loan_books";
    }
}
