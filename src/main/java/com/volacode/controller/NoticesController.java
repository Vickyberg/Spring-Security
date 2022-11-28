package com.volacode.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticesController {
    @GetMapping("/notices")
    public String getNotices(){
        return "<h1>Here are the notices  details from the DB</h1>";
    }
}
