package com.shrikar;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping
    public String message(){
        return "welcome to javatechie";
    }

    @GetMapping("hello")
    public String hello(){
        return "Hello Real Madrid";
    }

    @GetMapping("hi")
    public String hi(){
        return "Hi Shrikar";
    }
}
