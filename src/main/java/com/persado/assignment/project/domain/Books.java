package com.persado.assignment.project.domain;

public class Books {
    String bookName;
    String bookSummary;
    long ISBN;
    int copiesPurschased;
    int copiesAvailableForLoan;

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
