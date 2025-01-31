package com.example.dnd6th3moneyroutineserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/hello")
    public String HelloWorld(){
        return "Hello World!";
    }

    @GetMapping("/hello2")
    public String Hello(@RequestParam String param) {
        return param;
    }
}
