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
    private TodoList exercises;
    private Scanner scanner;
    public UserInterface(TodoList exercises, Scanner scanner){
        this.exercises = exercises;
        this.scanner = scanner;
    }
    
    private void add(){
        // ask user to add more exercises.
        System.out.print("To add: ");
        this.exercises.add(this.scanner.nextLine());
    }
    private void printTodoList(){
        this.exercises.print();
    }
    private void removeExercise(){
        System.out.print("Which one is removed? ");
        int index = Integer.valueOf(this.scanner.nextLine());
        this.exercises.remove(index);
    }
    public void start(){
        String userInput = "";
        while(true){
            userInput = this.scanner.nextLine();
            if(userInput.equals("stop")){
                break;
            } else if (userInput.equals("add")){
                this.add();
            } else if (userInput.equals("list")){
                this.printTodoList();
            } else if (userInput.equals("remove")){
                this.removeExercise();
            }
        }
    }
}
