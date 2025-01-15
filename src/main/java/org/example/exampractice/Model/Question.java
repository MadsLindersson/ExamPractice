package org.example.exampractice.Model;

public class Question {
    private int id;
    private Subjects subject;
    private int semester;
    private String question;
    private String answer;

    public Question(int id, Subjects subject, int semester, String question, String answer) {
        this.id = id;
        this.subject = subject;
        this.semester = semester;
        this.question = question;
        this.answer = answer;
    }

    public enum Subjects {
        Programmering,
        SU,
        Teknologi,
        ITF
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Subjects getSubject() {
        return subject;
    }

    public void setSubject(Subjects subject) {
        this.subject = subject;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
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
