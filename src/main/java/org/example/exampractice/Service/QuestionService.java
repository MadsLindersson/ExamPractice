package org.example.exampractice.Service;

import org.example.exampractice.Model.Question;
import org.example.exampractice.Repository.QuestionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static org.example.exampractice.Model.Question.Subjects.*;

@Service
public class QuestionService {

    @Autowired
    QuestionsRepository qr;

    public Question randomQuestionUsingParam (String subject, int semesterInt)   {

        return switch (subject) {
            case "AlleFag" -> {
                List<Question> questions = fetchListOfQuestionsBySubject("AlleFag", semesterInt);
                int randomIndexAllSubjects = (int) (Math.random() * questions.size());
                yield questions.get(randomIndexAllSubjects);
            }
            case "Programmering" -> {
                List<Question> questions = fetchListOfQuestionsBySubject("Programmering", semesterInt);
                int randomIndexProgramming = (int) (Math.random() * questions.size());
                yield questions.get(randomIndexProgramming);
            }
            case "SU" -> {
                List<Question> questions = fetchListOfQuestionsBySubject("SU", semesterInt);
                int randomIndexSU = (int) (Math.random() * fetchListOfQuestionsBySubject("SU", semesterInt).size());
                yield questions.get(randomIndexSU);
            }
            case "Teknologi" -> {
                List<Question> questions = fetchListOfQuestionsBySubject("Teknologi", semesterInt);
                int randomIndexTech = (int) (Math.random() * fetchListOfQuestionsBySubject("Teknologi", semesterInt).size());
                yield questions.get(randomIndexTech);
            }
            case "ITF" -> {
                List<Question> questions = fetchListOfQuestionsBySubject("ITF", semesterInt);
                int randomIndexITF = (int) (Math.random() * fetchListOfQuestionsBySubject("ITF", semesterInt).size());
                yield questions.get(randomIndexITF);
            }
            default -> new Question(1, null,1, "", "");
        };
    }

    public List<Question> fetchListOfQuestionsBySubject (String subject, int semesterInt) {
        List<Question> questions = new ArrayList<>();

        if(subject.equals("AlleFag") && semesterInt == 1) {
            for (Question element : qr.makeListOfQuestions()) {
                if (element.getSemester() == 1) {
                    questions.add(element);
                }
            }
        } else if(subject.equals("AlleFag") && semesterInt == 2) {
                for (Question element : qr.makeListOfQuestions()) {
                    if (element.getSemester() == 2) {
                        questions.add(element);
                    }
                }
        } else if (semesterInt == 1) {
            for (Question element : qr.makeListOfQuestions()) {
                if (element.getSemester() == 1 && element.getSubject().toString().equals(subject)) {
                    questions.add(element);
                }
            }
        } else if (semesterInt == 2) {
            for (Question element : qr.makeListOfQuestions()) {
                if (element.getSemester() == 1 || element.getSemester() == 2 && element.getSubject().toString().equals(subject)) {
                    questions.add(element);
                }
            }
        }
        return questions;
    }

    public List<Question> fetchListOfAllQuestionsBasedOnSemester (int semesterInt) {
        List<Question> questions = new ArrayList<>();

        switch (semesterInt)    {
            case 1:
                for(Question element : qr.makeListOfQuestions()) {
                    if (element.getSemester() == 1) {
                        questions.add(element);
                    }
                }
                break;
            case 2:
                for(Question element : qr.makeListOfQuestions()) {
                    if (element.getSemester() == 1 || element.getSemester() == 2) {
                        questions.add(element);
                    }
                }
        }

        return questions;
    }
}

