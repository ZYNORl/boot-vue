package com.zynorl.bootvue;

import com.zynorl.bootvue.entity.Company;
import com.zynorl.bootvue.entity.Position;
import com.zynorl.bootvue.repository.CompanyRepository;
import com.zynorl.bootvue.repository.PositionRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class BootVueApplicationTests {
    @Autowired
    private CompanyRepository companyRepository;
    @Autowired
    private PositionRepository positionRepository;


    @Test
    void contextLoads() {
        List<Company> companies=companyRepository.findAll();
        for(Company company : companies){
            System.out.println(company.getCid()+" "+company.getName());
        }
    }
    @Test
    void PositionLoads() {
        List<Company> companies=companyRepository.findAll();
        for(Company company : companies){
            System.out.println(company.getCid()+" "+company.getName());
        }
    }
    @Test
    void PositionBycolumn() {
        List<Position> positionList=positionRepository.findByLablel("java工程师");
        System.out.println(positionList);

    }
    @Test
    void PositionBysql() {
        List<Position> positionList=positionRepository.findBy();
        System.out.println(positionList);
    }
    @Test
    void PositionBybetween() {
        List<Position> positionList=positionRepository.findBySalaryBetweenOrderBySalary("10000","15000");
        System.out.println(positionList);
    }

}
