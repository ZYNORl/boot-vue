package com.zynorl.bootvue.controller;

import com.zynorl.bootvue.entity.Check;
import com.zynorl.bootvue.repository.CheckRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/check")

public class CheckController {
    @Autowired
    private CheckRepository checkRepository;
    @CrossOrigin
    @RequestMapping("getAll")
    List<Check> getCheckAll(){
        return checkRepository.findAll();
    }
}
