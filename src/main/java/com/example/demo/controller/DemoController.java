package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo/api")
public class DemoController {

    @GetMapping("/getdemostring")
    public String getDemoString() {


        return "Shri NatarajanKamakshi Namaha";
    }


}
