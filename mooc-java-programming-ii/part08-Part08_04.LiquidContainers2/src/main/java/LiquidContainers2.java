
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container container1 = new Container();
        Container container2 = new Container();
        int maxAmount = 100;
        
        while (true) {
            System.out.println("First: "+container1);
            System.out.println("Second: "+container2);
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
                    // add contianer1
                    container1.add(currentLiquidLevel);
                } else if (command.equals("move")){
                    if(currentLiquidLevel > container1.contains()){
                        currentLiquidLevel = container1.contains();
                    }

                    // update container1 level
                    container1.remove(currentLiquidLevel);

                    // we update container2 level
                    currentLiquidLevel += container2.contains();
                    if (currentLiquidLevel > maxAmount){
                        currentLiquidLevel = maxAmount;
                    }

                    container2.add(currentLiquidLevel);
                } else if (command.equals("remove")){

                    container2.remove(currentLiquidLevel);
                }
            }
        }
    }

}
