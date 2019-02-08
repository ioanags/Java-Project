package com.persado.assignment.project.service;

import com.persado.assignment.project.domain.Books;
import com.persado.assignment.project.models.BookModel;

import java.util.List;

public interface BookService {
    BookModel create(BookModel bookModel);
    List<Books> findAllBooks();
}
