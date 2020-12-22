package com.zynorl.bootvue.controller;

import com.zynorl.bootvue.entity.Book;
import com.zynorl.bootvue.repository.bookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/book")
public class bookController {
    @Autowired
    private bookRepository br;
    @GetMapping("/findAll")
    List<Book> findAll(){
        return br.findAll();
    }
}
