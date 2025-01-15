package org.example.exampractice.Controller;

import org.example.exampractice.Service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    QuestionService qs;

    @GetMapping("/")
    public String home() {
        return "Home";
    }

    @GetMapping("1.semester")
    public String firstSemester() {
        return "1.semester";
    }

    @GetMapping("2.semester")
    public String secondSemester() {
        return "2.semester";
    }
}
