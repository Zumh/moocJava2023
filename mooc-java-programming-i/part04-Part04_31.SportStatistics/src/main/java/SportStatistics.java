
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {
    public static void collectSportData(ArrayList<Team> teamStatistics, String file){
       
        String[] sportData = {};
        try(Scanner fileScanner = new Scanner(Paths.get(file))){
            while(fileScanner.hasNext()){
                sportData = fileScanner.nextLine().split(",");
                String home = sportData[0];
                String visitor = sportData[1];
                int homePoint = Integer.valueOf(sportData[2]);
                int visitorPoint = Integer.valueOf(sportData[3]);
                
                if (visitorPoint > homePoint){
                    teamStatistics.add(new Team(visitor, 1, 1, 0));
                    teamStatistics.add(new Team(home, 1, 0, 1));
                } else {
                    teamStatistics.add(new Team(visitor, 1, 0, 1));
                    teamStatistics.add(new Team(home, 1, 1, 0));
                }
                
                
            }
        } catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public static void calculateSportStatistics(ArrayList<Team> teamStatistics, Team searchTeam){
        for(Team eachTeam: teamStatistics){
            if (searchTeam.getName().equals(eachTeam.getName())){
                searchTeam.setGame(searchTeam.getGame()+eachTeam.getGame());
                searchTeam.setWin(searchTeam.getWin()+eachTeam.getWin());
                searchTeam.setLost(searchTeam.getLost()+eachTeam.getLost());
            }
        }
    }
    
    public static void displayTeamStatistics(Team searchTeam){
        System.out.println("Games: "+searchTeam.getGame()+"\nWins: "+searchTeam.getWin()+"\nLosses: "+searchTeam.getLost());
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();
        ArrayList<Team> teamStatistics = new ArrayList<>();
        
        
        collectSportData(teamStatistics, file);
        System.out.println("Team: ");
        
        String searchTeamName = scan.nextLine();
        Team searchTeam = new Team(searchTeamName, 0, 0, 0);
        calculateSportStatistics(teamStatistics, searchTeam);
        
        displayTeamStatistics(searchTeam);
        
        
    }

}
