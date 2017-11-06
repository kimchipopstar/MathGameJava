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
//        double startTime = System.currentTimeMillis() / 1000.0;
        
        QuestionManager questionManager = new QuestionManager();
        ScoreKeeper scoreKeeper = new ScoreKeeper();
        Scanner userInput = new Scanner(System.in);
        String userAnswer;
        boolean gameOn = true;
        while (gameOn) {

            AdditionQuestion addition = new AdditionQuestion();
            questionManager.addQuestion(addition);
            System.out.println(addition.getQuestion());
            userAnswer = userInput.nextLine();
            int answer = addition.getAnswer();
            try {
               if (userAnswer.equals("quit")) {
                    gameOn = false;
                } else if (Integer.parseInt(userAnswer) == answer) {
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
                questionManager.updateTotalTime(addition.getTotalTime());
//                System.out.println("time taken: " + addition.getTotalTime() + "total time: " + questionManager.getTotalTime() + " average time: " + questionManager.averageTime());
                System.out.println(questionManager.totalTimeAndAverMessage());
            }
        }
    }
    
}
