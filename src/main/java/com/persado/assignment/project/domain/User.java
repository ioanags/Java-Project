package com.persado.assignment.project.domain;




import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="USER")
public class User {
    @Id
    @Column(name="user_id",nullable=false)
    private Long id;
    @Column(name="first_name")
   private String firstName;
    @Column(name="last_name")
   private String lastName;
    @Column(name="address")
   private String address;
    @ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(name="LOANED_DETAILS", joinColumns=
    @JoinColumn(name="user_id",
            referencedColumnName="user_id"),
            inverseJoinColumns=
            @JoinColumn(name="book_id",
                    referencedColumnName="book_id") )
    private List<Books> booksOnLoan;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
