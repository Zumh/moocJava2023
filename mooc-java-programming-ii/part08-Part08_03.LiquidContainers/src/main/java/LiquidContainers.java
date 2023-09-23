
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int container1 = 0;
        int container2 = 0;
        int maxAmount = 100;
        
        while (true) {
            System.out.println("First: "+container1+"/"+maxAmount);
            System.out.println("Second: "+container2+"/"+maxAmount);
            String input = scan.nextLine();
            
            if (input.equals("quit")) {
                break;
            }
            System.out.println("");
            String[] commands = input.split(" ");
            String command = commands[0] ;
            int currentLiquidLevel = Integer.valueOf(commands[1]);
            if(currentLiquidLevel > 0){
                if (command.equals("add")){
                    currentLiquidLevel += container1;
                    if (currentLiquidLevel > maxAmount){
                        currentLiquidLevel = maxAmount;
                    }
                    container1 = currentLiquidLevel;
                } else if (command.equals("move")){
                    if(currentLiquidLevel > container1){
                        currentLiquidLevel = container1;
                    }

                    // update container1 level
                    container1 -= currentLiquidLevel;

                    // we update container2 level
                    currentLiquidLevel += container2;
                    if (currentLiquidLevel > maxAmount){
                        currentLiquidLevel = maxAmount;
                    }

                    container2 = currentLiquidLevel;
                } else if (command.equals("remove")){
                    
                    if (currentLiquidLevel > container2){
                        currentLiquidLevel = container2;
                    }
                    
                    container2 -= currentLiquidLevel;
                }
            }
        }
    }

}
