package com.zynorl.bootvue.controller;

import com.zynorl.bootvue.entity.Admire;
import com.zynorl.bootvue.repository.AdmireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admire")
public class AdmireController {
    @Autowired
    AdmireRepository admireRepository;
    @RequestMapping("/getAll")
    List<Admire> getAdmireAll(){
        return admireRepository.findAll();
    }
//





}
