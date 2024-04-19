package com.validationdemo.CustomerValidationForm.controller;


import com.validationdemo.CustomerValidationForm.Customer;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CustomerController {

    @GetMapping("/")
    public String showForm(Model theModel){
        theModel.addAttribute("customer",new Customer());

        return "customer-form";
    }

    @PostMapping("/processForm")
    public String ConfirmForm(@Valid @ModelAttribute Customer theCustomer, BindingResult theBindingResult){
        if(theBindingResult.hasErrors())
        {
            return "customer-form";
        }
        else{
            return "customer-confirmation";
        }
    }
}
