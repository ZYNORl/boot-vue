package com.zynorl.bootvue.controller;

import com.zynorl.bootvue.entity.Position;
import com.zynorl.bootvue.repository.PositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;



@RestController
@CrossOrigin
@RequestMapping("/job")
public class jobController {

    @Autowired
     private PositionRepository positionRepository;
    @CrossOrigin
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
    @CrossOrigin
  @RequestMapping("/findbylabel")
    List<Position> PositionBylabel(String lablel){
      //lablel="java工程师";
      return positionRepository.findByLablel(lablel);
    //    return positionRepository.findByLablel("java工程师");
  }
    @CrossOrigin
    @RequestMapping("/findbybetween")
    List<Position> findBySalaryBetweenOrderBySalary(String salary1,String salary2){
        return positionRepository.findBySalaryBetweenOrderBySalary(salary1,salary2);
    }
//通过地址、name、学历、
@CrossOrigin
    @RequestMapping("/findbyloc")
    List<Position> PositionByloc(String address){
        return positionRepository.findByAddress(address);
    }
    @CrossOrigin
    @RequestMapping("/findbyedu")
    List<Position> PositionByedu(String edu){
        return positionRepository.findByEdu(edu);
    }
    @CrossOrigin
    @RequestMapping("/findbynamelike")
    List<Position> PositionByname(String name){
        return positionRepository.findByNameLike("%"+name+"%");
    }
    @CrossOrigin
    @RequestMapping("/findbytype")
    List<Position> PositionBytype(Integer type){
        return positionRepository.findByType(type);
    }
    @CrossOrigin
    @RequestMapping("/findbyid")
    List<Position> PositionByid(Integer pid){return positionRepository.findByPid(pid);}

}
