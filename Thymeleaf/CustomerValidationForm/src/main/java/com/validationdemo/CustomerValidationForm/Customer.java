package com.validationdemo.CustomerValidationForm;


import com.validationdemo.CustomerValidationForm.validation.CourseCode;
import jakarta.validation.constraints.*;

public class Customer {

    private String firstName;



    @NotNull(message = "is Required")
    @Size(min = 1,message = "Last Name Should not be empty")
    private String lastName="";

    @NotNull(message = "is required")
    @Min(value = 1,message = "Number should be greater than 1")
    @Max(value = 10,message = "Number should be less than 10")
    private Integer freePasses;

    @Pattern(regexp = "^[a-zA-z0-9]{5}",message = "only 5 chars and digit")
    private String postalCode;

    @CourseCode
    private String courseCode;

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
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
