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
 * @param <T> - Data type for question
 */
public class GenericQuestion<T> implements Question {
    private T question;
    private List<PossibleAnswer> choices;
    
    GenericQuestion(T question, List<PossibleAnswer> choices){
        this.question = question;
        this.choices = choices;
    }
    
    @Override
    public T getQuestion(){
        return question;
    }
    
    @Override
    public List<PossibleAnswer> getPossibleAnswers(){
        return choices;
    }
}