/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
    private ArrayList<String> jokes;
    
    public JokeManager(){
        this.jokes = new ArrayList<>();
       
    }
    
    
    public void addJoke(String joke){
        this.jokes.add(joke);
    }
    
    public String drawJoke(){
        String drawJoke = "Jokes are in short supply.";
        int jokeIndex = 0;
        Random random = new Random();
        if(jokes.size() > 0){
            // randomize index between 0 and the size of jokes
            jokeIndex = random.nextInt(this.jokes.size());
            drawJoke = this.jokes.get(jokeIndex);
        }
        return drawJoke;
    }
    
    public void printJokes(){
        for(String joke:this.jokes){
            System.out.println(joke);
        }
    }
    
}