package com.example.launch;

import java.time.LocalDate;
import java.util.List;
import org.springframework.stereotype.Service;
import com.example.launch.LaunchRepository;
import lombok.RequiredArgsConstructor;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class LaunchService {
    private final LaunchRepository launchRepository;
    public void create(String name, LocalDate date, String meal, String review) {
        Launch q = new Launch();
        q.setName(name);
        q.setCreateDate(date);
        q.setMeal(meal);
        q.setReview(review);
        this.launchRepository.save(q);
    }
    
    public void deleteAllLaunches() {
        launchRepository.deleteAll(); // 모든 데이터 삭제
    }


}
