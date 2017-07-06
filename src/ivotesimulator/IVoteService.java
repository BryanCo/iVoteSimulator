package ivotesimulator;

import java.util.Collection;

/**
 *
 * @author Bryan
 */
public interface IVoteService {
    public Collection<Student> getStudents();
    public Question getQuestion();
    public void recieveStudentAnswer(Student student);
    public void displayStudentAnswers();
}
