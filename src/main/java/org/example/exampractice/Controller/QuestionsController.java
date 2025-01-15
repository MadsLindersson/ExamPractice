package org.example.exampractice.Controller;

import org.example.exampractice.Model.Question;
import org.example.exampractice.Service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class QuestionsController {

    @Autowired
    QuestionService qs;

    @GetMapping("AllSubjects")
    public String AllSubjects(Model model) {
        model.addAttribute("question", qs.randomQuestionUsingParam("AlleFag"));
        return "AllSubjectsPage";
    }

    @PostMapping("AllSubjectsAnswer")
    public String AllSubjectsAnswer(Model model, @ModelAttribute Question question) {
        model.addAttribute("question", question);
        return "AllSubjectsAnswerPage";
    }
}