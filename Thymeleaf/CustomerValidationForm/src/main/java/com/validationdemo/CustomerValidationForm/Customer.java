package com.validationdemo.CustomerValidationForm;


import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Customer {

    private String firstName;



    @NotNull(message = "is Required")
    @Size(min = 1,message = "Last Name Should not be empty")
    private String lastName="";

    @Min(value = 1,message = "Number should be greater than 1")
    @Max(value = 10,message = "Number should be less than 10")
    private int freePasses;

    public int getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(int freePasses) {
        this.freePasses = freePasses;
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
}
