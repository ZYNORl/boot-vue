package com.zynorl.bootvue.controller;

import com.zynorl.bootvue.entity.Admire;
import com.zynorl.bootvue.repository.AdmireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/admire")
public class AdmireController {
    @Autowired
    AdmireRepository admireRepository;
    @CrossOrigin
    @RequestMapping("/getAll")
    List<Admire> getAdmireAll(){
        return admireRepository.findAll();
    }
    @CrossOrigin
    @RequestMapping("/add")
    public void add(String sf_id,String name,String telephone,String email,String paword){
        Admire re = new Admire();
        re.setSf_id(sf_id);
        re.setName(name);
        re.setTelephone(telephone);
        re.setEmail(email);
        re.setPsword(paword);
        admireRepository.save(re);
    }
}
