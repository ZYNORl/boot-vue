package com.zynorl.bootvue.controller;

import com.zynorl.bootvue.entity.Position;
import com.zynorl.bootvue.repository.PositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping("/job")
public class jobController {

    @Autowired
     private PositionRepository positionRepository;
    @GetMapping("/getAll")
  public List<Position> findAll() {
        return positionRepository.findAll();
//        List<Position> positionList = positionRepository.findAll();
//        for(Position position : positionList){
//            System.out.println(position.toString());
//        }
//    }

  }
    @ResponseBody
  @RequestMapping("/findbylabel")
    List<Position> PositionBylabel(String lablel){
      //lablel="java工程师";
      return positionRepository.findByLablel(lablel);
    //    return positionRepository.findByLablel("java工程师");
  }

    @RequestMapping("/findbybetween")
    List<Position> findBySalaryBetweenOrderBySalary(String salary1,String salary2){
        return positionRepository.findBySalaryBetweenOrderBySalary(salary1,salary2);
    }
//通过地址、name、学历、
    @RequestMapping("/findbyloc")
    List<Position> PositionByloc(String address){
        return positionRepository.findByAddress(address);
    }
    @RequestMapping("/findbyedu")
    List<Position> PositionByedu(String edu){
        return positionRepository.findByEdu(edu);
    }
    @RequestMapping("/findbynamelike")
    List<Position> PositionByname(String name){
        return positionRepository.findByNameLike("%"+name+"%");
    }
    @RequestMapping("/findbytype")
    List<Position> PositionBytype(Integer type){
        return positionRepository.findByType(type);
    }



}
