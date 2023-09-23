import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String tvName = "";
        int duration = 0;
        
        while(true){
            System.out.println("Name: ");
            tvName = scanner.nextLine();
            
            if (tvName.equals("")){
                break;
            }
            
            System.out.println("Duration: ");
            duration = Integer.valueOf(scanner.nextLine());
            
            programs.add(new TelevisionProgram(tvName, duration));
            
        }
        
        // find max duration
        int maxDuration = 0;
       
        System.out.println("Program's maximum duration? ");
        maxDuration = Integer.valueOf(scanner.nextLine());
        
        // find duration equal to or under max duration 
        for(TelevisionProgram program : programs){
            if(maxDuration >= program.getDuration()){
                System.out.println(program);
            }
        }
    }
}
