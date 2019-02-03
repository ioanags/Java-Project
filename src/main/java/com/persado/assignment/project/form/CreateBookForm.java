package com.persado.assignment.project.form;

public class CreateBookForm {
    private String bookName;
    private String bookSummary;
    private Long isbn;
    private int copiesPurchased;
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

    public Long getIsbn() {
        return isbn;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    public int getCopiesPurchased() {
        return copiesPurchased;
    }

    public void setCopiesPurchased(int copiesPurchased) {
        this.copiesPurchased = copiesPurchased;
    }

    public int getCopiesAvailableForLoan() {
        return copiesAvailableForLoan;
    }

    public void setCopiesAvailableForLoan(int copiesAvailableForLoan) {
        this.copiesAvailableForLoan = copiesAvailableForLoan;
    }
}
