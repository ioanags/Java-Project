package com.persado.assignment.project.domain;




import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="USER")
public class User {
    @Id
    @Column(name="user_id",nullable=false)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Column(name="first_name")
   private String firstName;
    @Column(name="last_name")
   private String lastName;
    @Column(name="address")
   private String address;
    @ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(name="LOAN_DETAILS", joinColumns=
    @JoinColumn(name="user_id",
            referencedColumnName="user_id"),
            inverseJoinColumns=
            @JoinColumn(name="book_id",
                    referencedColumnName="book_id") )
    private List<Books> books = new ArrayList<>();
    public List<Books> getBooks(){
        return books;}
public User(){}

    public User(String firstName, String lastName, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
