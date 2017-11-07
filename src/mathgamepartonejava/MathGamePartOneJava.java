/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathgamepartonejava;
import java.util.Scanner;
/**
 *
 * @author j.k.
 */
public class MathGamePartOneJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        QuestionManager questionManager = new QuestionManager();
        QuestionFactory questionFactory = new QuestionFactory();
        ScoreKeeper scoreKeeper = new ScoreKeeper();
        Scanner userInput = new Scanner(System.in);
        String userAnswer;
        boolean gameOn = true;
        while (gameOn) {
            Question question = questionFactory.generateRandomQuestion();
            questionManager.addQuestion(question);
            System.out.println(question.getQuestion());
            userAnswer = userInput.nextLine();
            double answer = question.getAnswer();
            System.out.println(Math.round(answer*100)/100.0);
            try {
               if (userAnswer.equals("quit")) {
                    gameOn = false;
                } else if (Double.parseDouble(userAnswer) == Math.round(answer*100)/100.0) {
                    System.out.println("Right!");
                    scoreKeeper.incrementRight();
                } else {
                    System.out.println("Wrong!");
                    scoreKeeper.incrementWrong();
                }  
            } catch (NumberFormatException error) {
                System.out.print(error.getMessage());
                System.out.println("To quit enter 'quit'");
            } 
            if(gameOn){
                scoreKeeper.trackScore();
                questionManager.updateTotalTime(question.getTotalTime());
                System.out.println(questionManager.totalTimeAndAverMessage());
            }
        }
    }   
}
