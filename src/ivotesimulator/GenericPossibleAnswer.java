/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ivotesimulator;

/**
 *
 * @author Bryan
 * @param <T> - Data type for possible answer
 */
public class GenericPossibleAnswer<T> implements PossibleAnswer {
    private T answer;
    private Boolean isTrue;
    
    GenericPossibleAnswer(T answer, Boolean isTrue){
        this.answer = answer;
        this.isTrue = isTrue;
    }
    
    @Override
    public T getAnswer(){
        return answer;
    }
    
    @Override
    public Boolean getCorrectness(){
        return isTrue;
    }
}
