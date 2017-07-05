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
    
    private Question createQuestion(String question){
        List<PossibleAnswer> choices = new ArrayList();
        for(String a : this.answers){
            boolean truth = (r.nextBoolean());
            choices.add(new GenericPossibleAnswer(a, truth));
        }
        
        GenericQuestion q = new GenericQuestion(question, choices);
        
        return q;
    }
    
    private void sendAnswersFor(String[] studentsList, IVoteService service){
        for(String name : studentsList){
            Student s = new GenericStudent(name);
            
            int numberOfOptions = service.getQuestion().getPossibleAnswers().size();
            List<PossibleAnswer> options = service.getQuestion().getPossibleAnswers();
            PossibleAnswer answer = options.get(r.nextInt(numberOfOptions));
            s.setAnswer(answer);
            
            service.recieveStudentAnswer(s);
        }
    }
    
    private void simulateStudents(IVoteService service){
        sendAnswersFor(this.students, service);
    }
    
    private void simulateStudentsChangingMind(IVoteService service){
        int numIndecisiveStudents = r.nextInt(this.students.length);
        String[] indecisiveStudents = new String[numIndecisiveStudents];
        for(int i = 0; i < numIndecisiveStudents; i++){
            indecisiveStudents[i] = this.students[r.nextInt(this.students.length)];
        }
        sendAnswersFor(indecisiveStudents, service);
        
    }

    public void run(){
        for(String q : this.questions){
            IVoteService service = new GenericIVoteService(createQuestion(q));
            simulateStudents(service);
            service.displayStudentAnswers();
            simulateStudentsChangingMind(service);
            service.displayStudentAnswers();
        }       
    }
}
