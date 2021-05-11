package com.example.bootreview;

import com.example.bootreview.entity.yml.Family;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class BootReviewApplicationTests {

    @Autowired
    private Family family;

    @Test
    void hello() {
        System.out.println(family);
    }

}
