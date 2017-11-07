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
public class AdditionQuestion extends Question {
    
    @Override
    public void generateQuestion (){
        question = String.format("%i + %i", leftValue, rightValue);
        answer = leftValue + rightValue;
    }

}
