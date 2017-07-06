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
