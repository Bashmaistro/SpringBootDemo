package com.example.SpringBootDemo.Rest;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/dummy")
    public String sayDummy() {
        return "dummy";
    }




}
