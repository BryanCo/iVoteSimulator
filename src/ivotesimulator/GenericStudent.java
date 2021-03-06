package ivotesimulator;

/**
 *
 * @author Bryan
 */
public class GenericStudent<T> implements Student {
    private T id;
    private PossibleAnswer answer;

    @Override
    public PossibleAnswer getStudentAnswer() {
        return answer;
    }

    @Override
    public void setAnswer(PossibleAnswer answer) {
        this.answer = answer;
    }
    
    @Override
    public T getId() {
        return id;
    }
    
    GenericStudent(T id){
        this.id = id;
    }
    
}
