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

public class Room {
    ArrayList<Person> persons;
    
    public Room(){
        this.persons = new ArrayList<>();
    }
    
    public void add(Person person){
        this.persons.add(person);
    }
    
    public boolean isEmpty(){
        return this.persons.size() == 0;
    }
    
    public ArrayList<Person> getPersons(){
        return this.persons;
    }
    
    public Person shortest(){
        
        if (persons.size() == 0){
            return null;
        }
        
        Person shortestPerson = persons.get(0);
        
        for(Person person:persons){
            
            // check their height 
            if (person.getHeight()< shortestPerson.getHeight()){
                shortestPerson = person;
            }
        }
        
        return shortestPerson;
    }
    
    public Person take(){
        if(this.persons.size() == 0){
            return null;
        }
        // we take a copy of shortest person and it's values;
        Person shortest = this.shortest();
        
        // we remove from persons arraylist. here 
        this.persons.remove(this.shortest());
        
        // we return it here;
        return shortest;
    }
}
