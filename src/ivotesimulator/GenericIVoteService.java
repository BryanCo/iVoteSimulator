/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ivotesimulator;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Bryan
 */
public class GenericIVoteService implements IVoteService {
    HashMap<Object, Student> students = new HashMap();
    Question question;

    GenericIVoteService(Question question){
        this.question = question;
    }

    @Override
    public Collection<Student> getStudents() {
        Collection<Student> s = this.students.values();
        return s;
    }

    @Override
    public Question getQuestion() {
        return question;
    }
    
    @Override
    public void recieveStudentAnswer(Student student){
        students.put(student.getId(), student);
    }
    
    @Override
    public void displayStudentAnswers(){
        Map<PossibleAnswer, Integer> tally = new HashMap();
        for(Student s: this.students.values()){
            if(tally.containsKey(s.getStudentAnswer())){
                tally.put(s.getStudentAnswer(), tally.get(s.getStudentAnswer())+1 );
            }
            else{
                tally.put(s.getStudentAnswer(), 1);
            }
        }
        
        System.out.println(question.getQuestion()+ ":");
        for(PossibleAnswer a : tally.keySet()){
            System.out.println(a.getAnswer() + ": " + a.getCorrectness().toString() + ": "+ tally.get(a));
        }
    }
}