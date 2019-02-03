package com.persado.assignment.project.controller.mappers;

import com.persado.assignment.project.form.CreateBookForm;
import com.persado.assignment.project.models.BookModel;
import org.springframework.stereotype.Component;

@Component
public class CreateBookToModelMapper {
    public BookModel createBookFormToBookModel(CreateBookForm createBookForm) {
        BookModel bookModel = new BookModel();
        bookModel.setBookName(createBookForm.getBookName());
        bookModel.setBookSummary(createBookForm.getBookSummary());
        bookModel.setIsbn(createBookForm.getIsbn());
        bookModel.setCopiesPurchased(createBookForm.getCopiesPurchased());
        bookModel.setCopiesAvailableForLoan(createBookForm.getCopiesAvailableForLoan());
        return bookModel;
    }
}
