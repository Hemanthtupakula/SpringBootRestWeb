package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/app")
public class App {
    List<String> users = new ArrayList<>();
    @GetMapping("/")
    public String sayHello(String name) {
        return "hello "+name+" you got it";
    }
    @PostMapping("/")
    public String addUser(String name) {

        users.add(name);
        return users.toString();

    }
}

