package org.example;

import org.example.model.Level;
import org.example.model.User;

import java.time.LocalDate;
import java.util.List;

public class App {
    public static void main(String[] args){
        CodingPlatform codingPlatform = new CodingPlatform();
        //Add users
        User user1 = new User(1,"John");
        User user2 = new User(2, "Rock");
        codingPlatform.createUser(user1);
        codingPlatform.createUser(user2);
        //Add questions
        Question question1 = new Question(1, Level.LOW, "Permutations", "Create all permutations", user1);
        codingPlatform.addQuestion(question1);
        //Add contest
        List<Question> questionList = codingPlatform.getQuestionList(Level.LOW);
        Contest contest1 = new Contest(1, "April Contest", Level.LOW, questionList, user1, LocalDate.now(), LocalDate.now().plusDays(3));
        codingPlatform.addContest(contest1);
        codingPlatform.attendContest(contest1.getContestId(), user2);

        codingPlatform.runContest(1, user1);
        user1.setTotalScore(10);
        codingPlatform.showLeaderBoard(true);
    }
}
