package com.persado.assignment.project.service;

import com.persado.assignment.project.controller.mappers.BookToBookModelMapper;
import com.persado.assignment.project.domain.Books;
import com.persado.assignment.project.models.BookModel;
import com.persado.assignment.project.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookRepository bookRepository;
    @Autowired
    BookToBookModelMapper bookToBookModelMapper;
    @Override
    public BookModel create(BookModel bookModel){
        Books book = new Books(bookModel.getBookName(),bookModel.getBookSummary(),bookModel.getIsbn(),bookModel.getCopiesPurchased(),bookModel.getCopiesAvailableForLoan());
        Books savedBooks = bookRepository.save(book);
        return bookToBookModelMapper.mapToBookModel(savedBooks);

    }
    @Override
    public List<Books> findAllBooks(){
        return bookRepository.findAll();
    }
}
