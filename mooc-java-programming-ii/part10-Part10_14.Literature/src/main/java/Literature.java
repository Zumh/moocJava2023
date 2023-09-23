/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
public class Literature {
    private String title;
    private int age;
    
    public Literature(String title, int age){
        this.title = title;
        this.age = age;
    }
    
    public int getAge(){
        return age;
    }
    
    public String getTitle(){
        return title;
    }
    
    @Override
    public String toString(){
        return this.title + " ("+"recommanded for "+this.age+" year-olds or older"+")";
    }
}
