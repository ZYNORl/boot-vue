package com.zynorl.bootvue.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class bookRepositoryTest {
    @Autowired
    private bookRepository br;
    @Test
    void findAll(){
        System.out.println(br.findAll());

    }

}
