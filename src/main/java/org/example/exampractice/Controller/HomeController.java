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
    public String home(Model model) {
        model.addAttribute("list", qs.makeListOfQuestions());
        return "Home";
    }
}
