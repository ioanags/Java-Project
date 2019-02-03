package com.persado.assignment.project.form;

import javax.validation.constraints.Pattern;

public class CreateUserForm {
    private static final String VALID_PATTERN = "^[a-zA-Z0-9]*$";
    @Pattern(regexp = VALID_PATTERN, message = "Invalid First Name")
    private String firstName;
    @Pattern(regexp = VALID_PATTERN, message = "Invalid Last Name")
    private String lastName;

    private String address;

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
