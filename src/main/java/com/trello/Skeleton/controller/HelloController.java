package com.trello.Skeleton.controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

@Controller
public class HelloController {

    public String getHello() {
        return "Hello";
    }
}
