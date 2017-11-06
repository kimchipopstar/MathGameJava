/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathgamepartonejava;
import java.util.ArrayList;

/**
 *
 * @author j.k.
 */
public class QuestionManager {
    
    private ArrayList<AdditionQuestion> questions = new ArrayList<AdditionQuestion>();
    private double totalTime;
  
    public void addQuestion (AdditionQuestion additionQuestion) {
        this.questions.add(additionQuestion);
    }
    
    public void updateTotalTime(double time) {
        totalTime = totalTime + time;
    }
    
    public double averageTime() {
        return totalTime / questions.size();
    }
    
    public double getTotalTime() {
        return totalTime;
    }
    
    public String totalTimeAndAverMessage() {
        return String.format("total time: %fs, average time: %fs", totalTime, totalTime / questions.size());
    }
}
