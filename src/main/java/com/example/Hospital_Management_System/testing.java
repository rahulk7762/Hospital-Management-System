package com.example.Hospital_Management_System;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testing {
    @GetMapping("/testing")
    public String testing(){
        return "testing";
    }
}
