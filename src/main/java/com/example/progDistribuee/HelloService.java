package com.example.progDistribuee;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloService {

    @GetMapping("/")
    public String hello() {
        return "hello ndeye cisse";
    }
}

