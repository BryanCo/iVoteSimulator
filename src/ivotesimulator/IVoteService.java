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
public class IVoteService implements IVoteServiceInterface {
    HashMap<Object, NamedStudent> students = new HashMap();
    StringQuestion question;

    IVoteService(StringQuestion question){
        this.question = question;
    }

    public Collection<NamedStudent> getStudents() {
        Collection<NamedStudent> s = this.students.values();
        return s;
    }

    public StringQuestion getQuestion() {
        return question;
    }
    
    public void recieveStudentAnswer(NamedStudent student){
        students.put(student.getId(), student);
    }
    
    public void displayStudentAnswers(){
        Map<PossibleStringAnswer, Integer> tally = new HashMap();
        for(NamedStudent s: this.students.values()){
            if(tally.containsKey(s.getStudentAnswer())){
                tally.put(s.getStudentAnswer(), tally.get(s.getStudentAnswer())+1 );
            }
            else{
                tally.put(s.getStudentAnswer(), 1);
            }
        }
        
        System.out.println(question.getQuestion()+ ":");
        for(PossibleStringAnswer a : tally.keySet()){
            System.out.println(a.getAnswer() + ": " + a.getCorrectness().toString() + ": "+ tally.get(a));
        }
    }
}