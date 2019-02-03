package com.persado.assignment.project.controller.mappers;

import com.persado.assignment.project.domain.Books;
import com.persado.assignment.project.models.BookModel;
import org.springframework.stereotype.Component;

@Component
public class BookToBookModelMapper {
    public BookModel mapToBookModel(Books books) {
        BookModel bookModel = new BookModel();
        bookModel.setBookName(books.getBookName());
        bookModel.setBookSummary(books.getBookSummary());
        bookModel.setIsbn(books.getIsbn());
        bookModel.setCopiesPurchased(books.getCopiesPurschased());
        bookModel.setCopiesAvailableForLoan(books.getCopiesAvailableForLoan());
        return bookModel;
    }
}
