package org.example.exampractice.Controller;

import org.example.exampractice.Model.Question;
import org.example.exampractice.Service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class QuestionsController {

    @Autowired
    QuestionService qs;

    @GetMapping("Menu/{semesterInt}")
    public String Menu(@PathVariable int semesterInt, Model model) {
        model.addAttribute("semesterInt", semesterInt);
        return "Menu";
    }

    @GetMapping("QuestionsPage/{subject}/{semesterInt}")
    public String QuestionsPage(Model model, @PathVariable (required = false) String subject, @PathVariable int semesterInt) {

        model.addAttribute("question", qs.randomQuestionUsingParam(subject, semesterInt));
        model.addAttribute("semesterInt", semesterInt);
        model.addAttribute("subject", subject);
        return "QuestionsPage";
    }

    @PostMapping("AnswerPage")
    public String AnswerPage(Model model, @ModelAttribute Question question, @RequestParam String subjectString, @RequestParam int semesterInt) {
        model.addAttribute("question", question);
        model.addAttribute("subject", subjectString);
        model.addAttribute("semesterInt", semesterInt);
        return "AnswerPage";
    }

    @GetMapping("AllQuestionsPage/{semesterInt}")
    public String AllQuestionsPage(Model model, @PathVariable int semesterInt) {

        model.addAttribute("listOfQuestions", qs.fetchListOfAllQuestionsBasedOnSemester(semesterInt));
        model.addAttribute("semesterInt", semesterInt);
        return "AllQuestionsPage";
    }
}