package com.zynorl.bootvue.repository;

import com.zynorl.bootvue.entity.Book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface bookRepository extends JpaRepository<Book,Integer> {
//    @Query(value = "from com.zynorl.bootvue.entity.book")


}

