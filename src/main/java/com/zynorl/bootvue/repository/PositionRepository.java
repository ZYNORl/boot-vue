package com.zynorl.bootvue.repository;

import com.zynorl.bootvue.entity.Position;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PositionRepository extends JpaRepository<Position,Integer> {
    @Query(value = "from com.zynorl.bootvue.entity.Position where lablel='java工程师'")
    List<Position> findBy();
    List<Position> findByLablel(String lablel);
    List<Position> findBySalaryBetweenOrderBySalary(String minsalary,String maxsalary);
}

