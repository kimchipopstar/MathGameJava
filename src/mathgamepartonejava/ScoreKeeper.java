/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathgamepartonejava;

/**
 *
 * @author j.k.
 */
public class ScoreKeeper {
    
    private int right;
    private int wrong;
    
    public void trackScore() {
        int numberOfQuestions = right + wrong;
        int percentage;
        // if it's 0, it's undefined.
        percentage = right * 100 / numberOfQuestions;
        System.out.println("Score: " + right + " right, " + wrong + " wrong --- " + percentage + "%");
    }
    
    public void incrementRight() {
        right ++;
    }
    
    public void incrementWrong() {
        wrong ++;
    }
    
    public void setRight(int right) {
        this.right = right;
    }
    
    public int getRight() {
        return right;
    }
    
    public void setWrong(int wrong) {
        this.wrong = wrong;
    }
    
    public int getWrong() {
        return wrong;
    }
}
