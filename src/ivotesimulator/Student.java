package ivotesimulator;

/**
 *
 * @author Bryan
 */
public interface Student<T> {
    public PossibleAnswer getStudentAnswer();
    public void setAnswer(PossibleAnswer answer);
    public T getId();
    
}
