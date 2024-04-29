package org.example;

import org.example.model.Level;
import org.example.model.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CodingPlatform {
    List<User> userList = new ArrayList<>();
    List<Question> questionList = new ArrayList<>();
    List<Contest> contestList = new ArrayList<>();

//    public CodingPlatform(List<User> userList, List<Question> questionList, List<Contest> contestList) {
//        this.userList = userList;
//        this.questionList = questionList;
//        this.contestList = contestList;
//    }

    public void createUser(User user){
        userList.add(user);
    }
    public void addQuestion(Question question){
        questionList.add(question);
    }
    public void addContest(Contest contest){
        contestList.add(contest);
    }

    public Question createQuestion(int questionId, Level questionLevel, String questionName, String questionText, User user){
        Question question = new Question(questionId, questionLevel, questionName, questionText, user);
        addQuestion(question);
        return question;
    }

    public List<Question> getQuestionList(Level questionLevel){
        List<Question> returnQuestionList = new ArrayList<>();
        for(Question q: questionList){
            if(q.getQuestionLevel() == questionLevel)
                returnQuestionList.add(q);
        }
        return returnQuestionList;
    }

    public Contest createContest(int contestId, String contestName, Level contestLevel, User contestCreator, List<Question> contestQuestionList, LocalDate contestStartDate, LocalDate contestEndDate){
        Contest contest = new Contest(contestId, contestName, contestLevel, contestQuestionList, contestCreator, contestStartDate, contestEndDate);
        addContest(contest);
        return contest;
    }

    public List<Contest> getContestList(Level contestLevel){
        List<Contest> returnContestList = new ArrayList<>();
        for(Contest contest: contestList){
            if(contest.getContestLevel() == contestLevel)
                returnContestList.add(contest);
        }
        return returnContestList;
    }
    private Contest getContestById(int contestId){
        for(Contest contest: contestList){
            if(contest.getContestId()==contestId)
                return contest;
        }
        return null;
    }

    public void attendContest(int contestId, User user){
        Contest contestToAttend = getContestById(contestId);
        contestToAttend.getUserList().add(user);
    }

    public void runContest(int contestId, User user){
        Contest contestToStart = getContestById(contestId);
        contestToStart.start();
    }

    public void showLeaderBoard(boolean asc){
        List<User> usersOnLeaderBoard = new ArrayList<>(userList);
        if(asc){
            //sort the userList function based on his score
            Collections.sort(usersOnLeaderBoard, (user1, user2)->user1.getTotalScore() - user2.getTotalScore());
        } else {
            Collections.sort(usersOnLeaderBoard, (user1, user2)->user2.getTotalScore() - user1.getTotalScore());
        }
        for(User user: usersOnLeaderBoard){
            System.out.println("USer: "+user+" Total score: "+user.getTotalScore());
        }
    }

    public void showContestHistory(int contestId){
        Contest contest = getContestById(contestId);
        contest.showHistory();
    }

    public void withdrawFromContest(User user, int contestId){
        Contest contest = getContestById(contestId);
        User contestCreator = contest.getContestCreator();
        if(user == contestCreator)
            contestList.remove(contest);
        else
            contest.getUserList().remove(user);
    }
}
