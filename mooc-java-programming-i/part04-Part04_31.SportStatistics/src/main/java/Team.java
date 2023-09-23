/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
public class Team {
    private String name;
    private int game;
    private int win;
    private int lost;
    
    public Team(String name, int game, int win, int lost){
        this.name = name;
        this.game = game;
        this.win = win;
        this.lost = lost;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getGame(){
        return this.game;
    }
    
    public int getWin(){
        return this.win;
    }
    
    public int getLost(){
        return this.lost;
    }
    
    
    public void setGame(int game){
        this.game = game;
    }
    
    public void setWin(int win){
        this.win = win;
    }
    
    public void setLost(int lost){
        this.lost = lost;
    }
    
}
