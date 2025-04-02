package com.example.foodfight;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import com.example.launch.Launch;
import com.example.launch.LaunchAchiveApplication;
import com.example.launch.LaunchRepository;


@SpringBootTest(classes = LaunchAchiveApplication.class)
class LaunchAchiveApplicationTests {
    @Autowired
    private LaunchRepository launchRepository;
    
//	@Test
//    void testJpa() {        
//        Launch q1 = new Launch();
//        q1.setSubject("맛있다");
//        q1.setName("김보현");
//        q1.setMeal("바나나");
//        q1.setReview("그럭저럭");
//        q1.setCreateDate(LocalDateTime.now());
//        this.launchRepository.save(q1);  // 첫번째 질문 저장
//
//    }

}
