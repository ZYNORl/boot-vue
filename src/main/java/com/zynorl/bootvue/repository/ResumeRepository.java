package com.zynorl.bootvue.repository;

import com.zynorl.bootvue.entity.Resume;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ResumeRepository extends JpaRepository<Resume,Integer> {
}
