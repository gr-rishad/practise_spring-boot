package com.example.almighty.java.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController implements ErrorController {

    @RequestMapping("/error")
    public String handleError(){
        // do something
        return "error";
    }

}
