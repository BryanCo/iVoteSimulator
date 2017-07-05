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
 * @param <T> - Data type for question.
 */
public interface Question<T> {
    public T getQuestion();
    public List<PossibleAnswer> getPossibleAnswers();
}
