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

public class Stack {
    private ArrayList<String> stackList;
    public Stack(){
        this.stackList = new ArrayList<>();
    }
    public boolean isEmpty(){
        return this.stackList.size() == 0;
    }
    
    public void add(String value){
        this.stackList.add(0, value);
    }
    
    public ArrayList<String> values(){
        return this.stackList;
    }
    
    public String take(){
        return this.stackList.remove(0);
    }
}
