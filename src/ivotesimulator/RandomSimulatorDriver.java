/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ivotesimulator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Bryan
 */
public class RandomSimulatorDriver implements SimulatorDriver {
    private String[] students = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
    private String[] questions = {"Question 1","Question 2","Question 3","Question 4","Question 5"};
    private String[] answers = {"a", "b", "c", "d", "e", "f"};
    private Random r = new Random();
    
    private StringQuestion createQuestion(String question){
        List<PossibleStringAnswer> choices = new ArrayList();
        for(String a : this.answers){
            boolean truth = (r.nextBoolean());
            choices.add(new PossibleStringAnswer(a, truth));
        }
        
        StringQuestion q = new StringQuestion(question, choices);
        
        return q;
    }
    
    private void simulateStudents(IVoteService service){
        for(String name : students){
            NamedStudent s = new NamedStudent(name);
            
            int numberOfOptions = service.getQuestion().getPossibleAnswers().size();
            PossibleStringAnswer a = service.getQuestion().getPossibleAnswers().get(r.nextInt(numberOfOptions));
            s.setAnswer(a);
            
            service.recieveStudentAnswer(s);
        }
    }

    public void run(){
        for(String q : this.questions){
            IVoteService service = new IVoteService(createQuestion(q));
            simulateStudents(service);
            service.displayStudentAnswers();
        }       
    }
}
