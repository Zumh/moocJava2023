/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> exercises;

    public TodoList(){
        this.exercises = new ArrayList<>();
    }
    
    public void add(String task){
        this.exercises.add(task);
    }
    
    public void print(){
        
        for(int task = 0; task < exercises.size(); task++){
            System.out.println(task+1 + ": " + this.exercises.get(task));
        }
    }
    
    public void remove(int number){
        this.exercises.remove(number-1);
    }
}
