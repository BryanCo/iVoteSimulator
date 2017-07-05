/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ivotesimulator;

/**
 *
 * @author Bryan
 */
public class NamedStudent implements Student {
    private String id;
    private PossibleStringAnswer answer;

    public PossibleStringAnswer getStudentAnswer() {
        return answer;
    }

    public void setAnswer(PossibleStringAnswer answer) {
        this.answer = answer;
    }
    
    public String getId() {
        return id;
    }
    
    NamedStudent(String id){
        this.id = id;
    }
    
}
