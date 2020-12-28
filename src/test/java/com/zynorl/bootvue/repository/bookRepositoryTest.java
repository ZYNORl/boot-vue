package com.zynorl.bootvue.repository;

import com.zynorl.bootvue.entity.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Jpa21Utils;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class bookRepositoryTest {
    @Autowired
    private bookRepository br;
    @Test
    void findAll(){


        br.findAll();
    }

}
