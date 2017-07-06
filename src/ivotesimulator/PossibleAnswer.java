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
