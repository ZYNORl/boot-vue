package com.zynorl.bootvue.controller;
import com.zynorl.bootvue.entity.Resume;
import com.zynorl.bootvue.repository.ResumeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/resume")
public class ResumeController {
    @Autowired
    private ResumeRepository resumeRepository;

    @GetMapping("/getAll")
    List<Resume> findAll(){
        return resumeRepository.findAll();
    }
    @RequestMapping("/add")
    public void add(String name,String address,Integer owner_id,String Date){
        Resume re = new Resume();
        re.setAddress(address);
        re.setName(name);
        re.setDate(Date);
        re.setOwner_id(owner_id);
        resumeRepository.save(re);
    }
    @GetMapping("delete")
    public void delete(Integer id){
        resumeRepository.deleteById(id);
    }
}
