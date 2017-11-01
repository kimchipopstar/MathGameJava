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
        
        ScoreKeeper scoreKeeper = new ScoreKeeper();
        Scanner userInput = new Scanner(System.in);
        String userAnswer;
        boolean gameOn = true;

        while (gameOn) {
            AdditionQuestion addition = new AdditionQuestion();
            System.out.println(addition.getQuestion());
            userAnswer = userInput.nextLine();
            try {
               if (userAnswer.equals("quit")) {
                    gameOn = false;
                } else if (Integer.parseInt(userAnswer) == addition.getAnswer()) {
                    System.out.println("Right!");
                    scoreKeeper.setRight(scoreKeeper.getRight()+ 1);

                } else {
                    System.out.println("Wrong!");
                    scoreKeeper.setWrong(scoreKeeper.getWrong()+ 1);
                }  
            } catch (NumberFormatException error) {
                System.out.print(error.getMessage());
                System.out.println("To quit enter 'quit'");
            } 
            
            scoreKeeper.trackScore();
        }
    }
    
}
