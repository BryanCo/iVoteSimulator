/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ivotesimulator;

import java.util.List;

/**
 *
 * @author Bryan
 */
public class StringQuestion implements Question {
    private String question;
    private List<PossibleStringAnswer> choices;
    
    StringQuestion(String question, List<PossibleStringAnswer> choices){
        this.question = question;
        this.choices = choices;
    }
    
    public String getQuestion(){
        return question;
    }
    
    public List<PossibleStringAnswer> getPossibleAnswers(){
        return choices;
    }
}
