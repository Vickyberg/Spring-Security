package com.volacode.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalanceController {

    @GetMapping("/myBalance")
    public  String getBalanceDetails(){
        return "Here is your balance details from the DB";
    }
}
