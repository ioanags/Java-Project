package com.persado.assignment.project.domain;

import javax.persistence.*;

@Entity
@Table(name="LOAN_DETAILS")
public class LoanDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="loan_id",nullable=false)
    private Long loadId;
    @Column(name="user_id",nullable=false)
    private Long userId;
    @Column(name="book_id",nullable=false)
    private Long bookId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }
}
