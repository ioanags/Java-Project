package com.persado.assignment.project.domain;




import javax.persistence.*;

@Entity
@Table(name="BOOKS")
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private long id;
    @Column(name = "book_name")
    private String bookName;
    @Column(name = "book_summary")
    private String bookSummary;
    @Column(name = "isbn")
    private long ISBN;
    @Column(name = "copies_purchased")
    private int copiesPurschased;
    @Column(name = "copies_available")
    private int copiesAvailableForLoan;

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

    public long getISBN() {
        return ISBN;
    }

    public void setISBN(long ISBN) {
        this.ISBN = ISBN;
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
