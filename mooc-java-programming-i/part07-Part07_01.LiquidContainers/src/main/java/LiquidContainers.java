
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int container1 = 0;
        int container2 = 0;
        int availableSpace = 0;
        int amountToMove = 0;
        int maxAmount = 100;
  
        String[] userData = {};
       
        while (true) {
            System.out.println("First: "+container1+"/"+maxAmount+"\n"+"Second: "+container2+"/"+maxAmount);
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

                   amountToMove += container1;
                   if (maxAmount < amountToMove){
                       amountToMove = maxAmount;
                   } 
                   container1 = amountToMove;

                } else if (command.equals("move")){
                  
                    // Calculate the amount to move

                    if (amountToMove > container1){
                        amountToMove = container1;
                    }

                    // Calculate available space in the second container
                    availableSpace = maxAmount - container2;

                    // Calculate the actual amount to move based on available space
                    if (amountToMove > availableSpace){
                        amountToMove = availableSpace;
                    }

                    // Update container levels
                    container1 -= amountToMove;
                    container2 += amountToMove;
                    
                } else if (userData[0].equals("remove")){
                    if (container2 > 0){
                        if (amountToMove > container2){
                            amountToMove = container2;
                        }

                        // Update container levels
                        container2 -= amountToMove;
                    }
                }
            }

            
            

        }
    }

}
