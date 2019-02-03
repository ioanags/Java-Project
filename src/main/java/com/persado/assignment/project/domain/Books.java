package com.persado.assignment.project.domain;




import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="BOOKS")
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private Long id;
    @Column(name = "book_name")
    private String bookName;
    @Column(name = "book_summary")
    private String bookSummary;
    @Column(name = "isbn")
    private Long isbn;
    @Column(name = "copies_purchased")
    private int copiesPurschased;
    @Column(name = "copies_available")
    private int copiesAvailableForLoan;
    @ManyToMany(mappedBy="books")
    private List<User> user = new ArrayList<>();

    public List<User> getUser(){
        return user;
    }

    public Books(String bookName, String bookSummary, Long isbn, int copiesPurschased, int copiesAvailableForLoan) {
        this.bookName = bookName;
        this.bookSummary = bookSummary;
        this.isbn = isbn;
        this.copiesPurschased = copiesPurschased;
        this.copiesAvailableForLoan = copiesAvailableForLoan;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookSummary() {
        return bookSummary;
    }

    public void setBookSummary(String bookSummary) {
        this.bookSummary = bookSummary;
    }

    public Long getIsbn() {
        return isbn;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    public int getCopiesPurschased() {
        return copiesPurschased;
    }

    public void setCopiesPurschased(int copiesPurschased) {
        this.copiesPurschased = copiesPurschased;
    }

    public int getCopiesAvailableForLoan() {
        return copiesAvailableForLoan;
    }

    public void setCopiesAvailableForLoan(int copiesAvailableForLoan) {
        this.copiesAvailableForLoan = copiesAvailableForLoan;
    }
}
