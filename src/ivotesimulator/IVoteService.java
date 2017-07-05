/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
