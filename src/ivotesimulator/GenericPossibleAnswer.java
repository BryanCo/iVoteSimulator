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
