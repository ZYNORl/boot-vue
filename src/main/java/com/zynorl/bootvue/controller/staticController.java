package com.zynorl.bootvue.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

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
