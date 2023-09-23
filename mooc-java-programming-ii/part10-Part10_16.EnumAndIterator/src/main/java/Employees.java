/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
public class Employees {
    List<Person> employees;
    
    public Employees(){
        employees = new ArrayList<>();
    }
    public void add(Person personToAdd){
        this.employees.add(personToAdd);
                
    }
    
    public void add(List<Person> peopleToAdd){
        this.employees.addAll(peopleToAdd);
    }
    
    public void print(){
        this.employees
                .stream()
                .forEach(employee -> System.out.println(employee));
    }
    
    public void print(Education education){
       
        
        Iterator<Person> iterator = this.employees.iterator();
        
        while(iterator.hasNext()){
            Person currentPerson = iterator.next();
            if(currentPerson.getEducation() == education){
                
                System.out.println(currentPerson);
            }
        }
        
    }
    
    public void fire(Education education){
        Iterator<Person> iterator = this.employees.iterator();
        
        while(iterator.hasNext()){
            if(iterator.next().getEducation() == education){
                
                iterator.remove();
            }
        }
    }
}
