/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathgamepartonejava;
import java.util.Random;

/**
 *
 * @author j.k.
 */
public class AdditionQuestion {
    private final String question;
    private final int answer;
    private double startTime;
    private double endTime;

    
    public AdditionQuestion() {
        Random randomValue = new Random();
        int leftValue = randomValue.nextInt(10) + 1;
        int rightValue = randomValue.nextInt(10) + 1;
        question = leftValue + " + " + rightValue;
        answer = leftValue + rightValue;
        startTime = System.currentTimeMillis();
    }
    
    public double getTotalTime() {
        return (endTime - startTime)/ 1000.0;
    }
    

    public String getQuestion() {
        return question;
    }
    
    public int getAnswer() {
        endTime = System.currentTimeMillis();
        return answer;
    }
}
