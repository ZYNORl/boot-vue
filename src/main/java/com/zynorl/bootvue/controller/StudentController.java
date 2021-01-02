package com.zynorl.bootvue.controller;

import com.zynorl.bootvue.entity.Student;
import com.zynorl.bootvue.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/student")

public class StudentController {
    @Autowired
    private StudentRepository studentRepository;
    @CrossOrigin
    @GetMapping("/getAll")
    List<Student> findAll(){
        return studentRepository.findAll();
    }
    //学生注册
    @CrossOrigin
    @RequestMapping("/add")
    public void add(@RequestBody Student student){
        studentRepository.save(student);
    }
}
