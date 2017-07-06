package ivotesimulator;

import java.util.Comparator;

/**
 *
 * @author Bryan
 */
public class QuestionComparator implements Comparator<PossibleAnswer<String>> {
    @Override
    public int compare(PossibleAnswer<String> a1, PossibleAnswer<String> a2){
        int r = a1.getAnswer().compareTo(a2.getAnswer());
        return r;
    }
}
