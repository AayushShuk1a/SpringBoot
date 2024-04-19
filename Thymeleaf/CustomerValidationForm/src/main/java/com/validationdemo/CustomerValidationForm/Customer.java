package com.validationdemo.CustomerValidationForm;


import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Customer {

    private String firstName;



    @NotNull(message = "is Required")
    @Size(min = 1,message = "Last Name Should not be empty")
    private String lastName="";

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
}
