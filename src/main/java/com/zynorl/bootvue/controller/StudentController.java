package com.zynorl.bootvue.controller;

import com.zynorl.bootvue.entity.Student;
import com.zynorl.bootvue.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;
    @GetMapping("/getAll")
    List<Student> findAll(){
        return studentRepository.findAll();
    }
}
