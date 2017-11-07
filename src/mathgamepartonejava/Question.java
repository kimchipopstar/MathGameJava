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
public class Question {
    
    private String question;
    private int answer;
    private double startTime;
    private double endTime;
    private int leftValue;
    private int rightValue;
    
    public Question() {
        Random randomValue = new Random();
        leftValue = randomValue.nextInt(10) + 1;
        rightValue = randomValue.nextInt(10) + 1;
        question = leftValue + " + " + rightValue;
        answer = leftValue + rightValue;
        startTime = System.currentTimeMillis();
    }
    
    public double getTotalTime() {
        return (endTime - startTime)/ 1000.0;
    }
    
    public int getLeftVavue() {
    		return leftValue;
    }
    
    public int getRightVavue() {
		return rightValue;
}
    

    public String getQuestion() {
        return question;
    }
    
    public int getAnswer() {
        endTime = System.currentTimeMillis();
        return answer;
    }
    
    public void generateQuestion() {
        
    }
}
