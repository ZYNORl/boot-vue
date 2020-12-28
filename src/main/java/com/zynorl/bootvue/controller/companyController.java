package com.zynorl.bootvue.controller;

import com.zynorl.bootvue.entity.Company;
import com.zynorl.bootvue.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/company")
public class companyController {
    @Autowired
    private CompanyRepository companyRepository;
    @RequestMapping("/getAll")
    public List<Company> findAll(){
        return companyRepository.findAll();

    }
}

