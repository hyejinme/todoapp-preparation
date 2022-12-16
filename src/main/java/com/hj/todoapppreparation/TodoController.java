package com.hj.todoapppreparation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {

    @GetMapping("/")
    public String Hello() {
        return "To-do Application !";
    }
}
