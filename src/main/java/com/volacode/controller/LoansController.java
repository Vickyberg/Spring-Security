package com.volacode.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoansController {

    @GetMapping("/myLoans")
    public  String getLoansDetails(){
        return "Here is your loan details from the DB";
    }
}
