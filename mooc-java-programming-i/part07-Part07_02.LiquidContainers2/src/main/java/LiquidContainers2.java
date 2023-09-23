
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int availableSpace = 0;
        int amountToMove = 0;
        int maxAmount = 100;
  
        String[] userData = {};
        Container container1  = new Container();
        Container container2 = new Container();
       
        while (true) {
            System.out.println("First: "+container1+"\n"+"Second: "+container2);
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            userData = input.split(" ");
            if (userData.length < 2) {
                System.out.println("Invalid input. Please provide a command and an amount.");
                continue;
            }
            String command = userData[0];
            amountToMove = Integer.parseInt(userData[1]);
            if (amountToMove > 0 ){
            
                if (command.equals("add")){

                    container1.add(amountToMove);

                } else if (command.equals("move")){
                  
                    // Calculate the amount to move

                    if (amountToMove > container1.contains()){
                        amountToMove = container1.contains();
                    }

                    // Calculate available space in the second container
                    availableSpace = maxAmount - container2.contains();

                    // Calculate the actual amount to move based on available space
                    if (amountToMove > availableSpace){
                        amountToMove = availableSpace;
                    }

                    // Update container levels
                    container1.remove(amountToMove);
                    container2.add(amountToMove);
                    
                } else if (userData[0].equals("remove")){
                    container2.remove(amountToMove);
                }
            }

            
            

        }
    }

}
