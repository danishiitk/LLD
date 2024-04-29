package org.example;

import org.example.model.Level;
import org.example.model.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contest {
    String contestName;
    Level contestLevel;
    int contestId;
    List<Question> questionList;
    User contestCreator;
    List<User> userList = new ArrayList<>();

    public LocalDate getContestStartDate() {
        return contestStartDate;
    }

    public void setContestStartDate(LocalDate contestStartDate) {
        this.contestStartDate = contestStartDate;
    }

    public LocalDate getGetContestEndDate() {
        return contestEndDate;
    }

    public void setGetContestEndDate(LocalDate contestEndDate) {
        this.contestEndDate = contestEndDate;
    }

    LocalDate contestStartDate;

    LocalDate contestEndDate;

    public String getContestName() {
        return contestName;
    }

    public void setContestName(String contestName) {
        this.contestName = contestName;
    }

    public Level getContestLevel() {
        return contestLevel;
    }

    public void setContestLevel(Level contestLevel) {
        this.contestLevel = contestLevel;
    }

    public int getContestId() {
        return contestId;
    }

    public void setContestId(int contestId) {
        this.contestId = contestId;
    }

    public List<Question> getQuestionList() {
        return questionList;
    }

    public void setQuestionList(List<Question> questionList) {
        this.questionList = questionList;
    }

    public User getContestCreator() {
        return contestCreator;
    }

    public void setContestCreator(User contestCreator) {
        this.contestCreator = contestCreator;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public Contest(int contestId, String contestName, Level contestLevel, List<Question> questionList, User contestCreator, LocalDate contestStartDate, LocalDate contestEndDate) {
        this.contestId = contestId;
        this.contestName = contestName;
        this.contestLevel = contestLevel;
        this.questionList = questionList;
        this.contestCreator = contestCreator;
       // this.userList = userList;
        this.contestStartDate = contestStartDate;
        this.contestEndDate = contestEndDate;
    }

    public void start() {
        System.out.println("Contest started by: "+contestCreator.getUserName());
    }

    public void showHistory() {
        System.out.println("Contest started at: "+contestStartDate+" and Contest ended on: "+ contestEndDate+" attendend by: "+userList.size()+" users");
    }
}
