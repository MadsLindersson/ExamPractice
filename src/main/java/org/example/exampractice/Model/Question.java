package org.example.exampractice.Model;

public class Question {
    public int id;
    public Subjects subject;
    public String question;
    public String answer;

    public Question(int id, Subjects subject, String question, String answer) {
        this.id = id;
        this.subject = subject;
        this.question = question;
        this.answer = answer;
    }

    public enum Subjects {
        Programmering,
        SU,
        Teknologi,
        ITF
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", subject=" + subject +
                ", question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }
}
