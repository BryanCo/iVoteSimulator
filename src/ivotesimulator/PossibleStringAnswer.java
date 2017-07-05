/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ivotesimulator;

/**
 *
 * @author Bryan
 */
public class PossibleStringAnswer implements PossibleAnswerInterface {
    private String answer;
    private Boolean isTrue;
    
    PossibleStringAnswer(String answer, Boolean isTrue){
        this.answer = answer;
        this.isTrue = isTrue;
    }
    
    public String getAnswer(){
        return answer;
    }
    
    public Boolean getCorrectness(){
        return isTrue;
    }
}
