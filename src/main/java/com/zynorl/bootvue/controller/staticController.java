package com.zynorl.bootvue.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping
public class staticController {
    @RequestMapping({"/index", "/index.html"})
    public String index() {

        return "index";
    }
    @RequestMapping("/static")
    public String file() {

        return "index";
    }



}
