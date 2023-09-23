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
    private TodoList todoList;
    private Scanner scan;
    public UserInterface(TodoList list, Scanner scanner){
        this.todoList = list;
        this.scan = scanner;
    }
    
    private void add(){
        System.out.print("To add: ");
        String userInput = this.scan.nextLine();
        this.todoList.add(userInput);
    }
    
    private void showAll(){
        this.todoList.print();
    }
    
    private void removeItem(){
        System.out.print("Which one is removed? ");
        int index = Integer.valueOf(this.scan.nextLine());
        this.todoList.remove(index);
    }
    
    public void start(){
        String command = "";
        
        while(true){
            System.out.print("Command: ");
            command = this.scan.nextLine();
            if(command.equals("stop")){
                break;
            }
            
            if(command.equals("add")){
                this.add();
            } else if(command.equals("list")){
                this.showAll();
            } else if(command.equals("remove")){
                this.removeItem();
            }
        }
    }
}
