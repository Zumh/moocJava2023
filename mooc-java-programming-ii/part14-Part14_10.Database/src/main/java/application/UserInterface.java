package application;

import java.sql.SQLException;
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private TodoDao database;

    public UserInterface(Scanner scanner, TodoDao database) {
        this.scanner = scanner;
        this.database = database;
    }
    private void operations(String command) throws SQLException{
        // implement the functionality here
        if(command.equals("1")){
            System.out.println("Listing the database contents");
            for(Todo task : this.database.list()){
                System.out.println(task);
            }
        } else if(command.equals("2")) {
           
            System.out.println("Adding a new todo");
            // ask for name
            System.out.println("Enter name");
            String name = this.scanner.nextLine();
            // ask for description
            System.out.println("Enter description");
            // then add the string
            String description = this.scanner.nextLine();
            
            int id = 0;
            if (!this.database.list().isEmpty()){
                id = this.database.list().get(this.database.list().size()-1).getId()+1;
            }
            // add them to the database 
            Todo todo = new Todo(id,name, description, false);
            this.database.add(todo);
            
        } else if (command.equals("3")) {
            int doneId = 0;
            boolean foundData = false;
            System.out.println("Which todo should be marked as done (give the id)");
            doneId = this.scanner.nextInt();
            for(Todo data : this.database.list()){
                if(data.getId() == doneId){
                    foundData = true;
                    break;
                }
            }
            if (foundData){
                this.database.markAsDone(doneId);
            }
            
        } else if (command.equals("4")) {
            int removeId = 0;
            boolean isDataExist = false;
            System.out.println("Which todo should be remove (give the id)");
            removeId = this.scanner.nextInt();
            for(Todo data : this.database.list()){
                if(data.getId() == removeId){
                    isDataExist = true;
                    break;
                }
            }
            if (isDataExist){
                this.database.remove(removeId);
            }
            
        }
    
    }
    public void start() throws SQLException {
        while (true) {
            System.out.println("");
            System.out.println("Enter command:");
            System.out.println("1) list");
            System.out.println("2) add");
            System.out.println("3) mark as done");
            System.out.println("4) remove");
            System.out.println("x) quit");

            System.out.print("> ");
            String command = this.scanner.nextLine();
            if (command.equals("x")) {
                break;
            }

            operations(command);
        }

        System.out.println("Thank you!");
    }

}
