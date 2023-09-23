/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */

import java.util.Scanner;

public class UserInterface {
    private JokeManager jokes;
    private Scanner scanner;
    
    public UserInterface(JokeManager jokes, Scanner scanner){
        this.jokes = jokes;
        this.scanner = scanner;
    }
    private void menu(){
        System.out.println("1 - add a joke\n2 - draw a joke\n3 - list jokes\nX - stop");
    }
    public void start(){
        String userInput = "";
        
        while(true){
            System.out.println("Commands:");
            this.menu();
            userInput = this.scanner.nextLine();
            if(userInput.toUpperCase().equals("X")){
                break;
            }
            
            if(userInput.equals("1")){
                this.add();
            } else if (userInput.equals("2")){
                this.draw();
            } else if (userInput.equals("3")){
                System.out.println("Printing the jokes.");
                this.printAll();
            }
        }
    }
    
    public void add(){
        
        System.out.println("Write the joke to be added:");
        this.jokes.addJoke(this.scanner.nextLine());
    }
    public void draw(){
        System.out.println(this.jokes.drawJoke());
    }
    public void printAll(){
        this.jokes.printJokes();
    }
    
}
