package com.zynorl.bootvue.controller;

import com.zynorl.bootvue.entity.Position;
import com.zynorl.bootvue.repository.PositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;



@RestController
@RequestMapping("/job")
public class jobController {

    @Autowired
     private PositionRepository positionRepository;
    @GetMapping("/findAll")
  public List<Position> findAll() {
        return positionRepository.findAll();
//        List<Position> positionList = positionRepository.findAll();
//        for(Position position : positionList){
//            System.out.println(position.toString());
//        }
//    }

  }
  @GetMapping("/findbylabel")
    List<Position> PositionBycolumn(){
      return positionRepository.findByLablel("java工程师");
  }

    @GetMapping("/findbybetween")
    List<Position> findBySalaryBetweenOrderBySalary(){
        return positionRepository.findBySalaryBetweenOrderBySalary("10000","15000");
    }




}
