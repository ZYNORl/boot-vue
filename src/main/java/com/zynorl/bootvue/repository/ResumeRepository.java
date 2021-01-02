package com.zynorl.bootvue.repository;

import com.zynorl.bootvue.entity.Resume;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ResumeRepository extends JpaRepository<Resume,Integer> {
    List<Resume> findByStuid(Integer stuid);
}
