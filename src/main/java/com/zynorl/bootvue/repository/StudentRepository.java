package com.zynorl.bootvue.repository;

import com.zynorl.bootvue.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
