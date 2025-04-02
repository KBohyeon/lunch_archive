package com.example.launch;
import java.time.LocalDate;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequiredArgsConstructor
@Controller
public class LaunchController {
    private final LaunchRepository launchRepository;
    private final LaunchService launchService;
    @GetMapping("/list")
    public String list(Model model) {
        List<Launch> launchList = this.launchRepository.findAll();
        model.addAttribute("launchList", launchList);
        return "launch";
    }
    
    @PostMapping("/create")
    public String launchCreate(@RequestParam(value="name") String name, @RequestParam(value="date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date,
    		@RequestParam(value="meal") String meal, @RequestParam(value="review") String review) {
        // TODO 질문을 저장한다.
    	this.launchService.create(name, date, meal, review);
        return "redirect:/list"; // 질문 저장후 질문목록으로 이동
    }
    
    @PostMapping("/delete")
    public String deleteAll() {
        this.launchService.deleteAllLaunches(); // 서비스 호출
        return "redirect:/list"; // 삭제 후 홈으로 리다이렉트
    }

}
