/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mooc.logic;

import mooc.ui.UserInterface;


/**
 *
 * @author student
 */
public class ApplicationLogic {
    private UserInterface ui;
    public ApplicationLogic(UserInterface ui){
        this.ui = ui;
    }
    
    public void execute(int times){
        for(int number = 0; number < times; number++){
            System.out.println("Application logic is working");
            this.ui.update();
        }
    }
}