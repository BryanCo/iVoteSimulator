/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ivotesimulator;

/**
 *
 * @author Bryan
 * @param <T> Data type for answer
 */
public interface PossibleAnswer<T> {
    public T getAnswer();
    public Boolean getCorrectness();
}
