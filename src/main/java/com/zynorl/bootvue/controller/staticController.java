package com.zynorl.bootvue.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@CrossOrigin
@RequestMapping
public class staticController {
    @CrossOrigin
    @RequestMapping("/static")
    public String file() {

        return "index";
    }
    @CrossOrigin
    @RequestMapping({"/index", "/index.html","/","/login","/login.html"})
    public String login() {
        return "login";
    }
}
