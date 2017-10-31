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
        Scanner userInput = new Scanner(System.in);
        int userAnswer;
        while (true) {
            
            AdditionQuestion addition = new AdditionQuestion();
            System.out.println(addition.getQuestion());
            userAnswer = userInput.nextInt();
            
            
        }
    }
    
}
