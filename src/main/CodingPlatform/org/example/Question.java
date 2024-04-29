package org.example;

import org.example.model.Level;
import org.example.model.User;

public class Question {
    String questionName;
    int questionId;
    String questionText;

    Level questionLevel;
    User questionCreator;

    public String getQuestionName() {
        return questionName;
    }

    public void setQuestionName(String questionName) {
        this.questionName = questionName;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public Level getQuestionLevel() {
        return questionLevel;
    }

    public void setQuestionLevel(Level questionLevel) {
        this.questionLevel = questionLevel;
    }

    public User getQuestionCreator() {
        return questionCreator;
    }

    public void setQuestionCreator(User questionCreator) {
        this.questionCreator = questionCreator;
    }

    Question(int questionId, Level questionLevel, String questionName, String questionText, User questionCreator){
        this.questionId = questionId;
        this.questionLevel = questionLevel;
        this.questionName = questionName;
        this.questionText = questionText;
        this.questionCreator = questionCreator;
    }
    public int getQuestionScore(Level questionLevel){
        if(questionLevel == Level.LOW) return 10;
        else if(questionLevel == Level.MEDIUM) return 20;
        else if(questionLevel == Level.DIFFICULT) return 50;
        else return -1;
    }
}
