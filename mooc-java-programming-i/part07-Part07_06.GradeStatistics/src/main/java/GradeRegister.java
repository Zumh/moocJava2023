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

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> points;
    private int threshHoldPoints;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.points = new ArrayList<>();
        this.threshHoldPoints = 50;
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
        this.points.add(points);
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }
    
    private static int totalSum(ArrayList<Integer>  numbers){
        int sumOfNumber = 0;
        for(int number : numbers){
            sumOfNumber += number;
        }
        return sumOfNumber;
    }
    
    public double averageOfGrades(){
        if (this.grades.size() == 0){
            return -1;
        }
        
        return (totalSum(this.grades)*1.0)/this.grades.size();
        
    }
    
   
    public double passingPointsAverage(){
        if (this.points.size() == 0){
            return -1;
        }
        int sumOftotalPoints = 0;
        int countPassingPoints = 0;
        for(int point:this.points){
            if (point >= this.threshHoldPoints){
                sumOftotalPoints += point;
                countPassingPoints++;
            }
            
        }
        if (countPassingPoints <= 0){
            return -1;
        }
        return (sumOftotalPoints * 1.0)/countPassingPoints;
    }
    
    public double passPercentage(){
        if (this.points.size() == 0){
            return 0;
        }
        int countPassingPoints = 0;
       
        for(int point:this.points){
            
            if (point >= this.threshHoldPoints){
                countPassingPoints++;
                
            }
            
        }
        
        if (countPassingPoints <= 0){
            return 0;
        }
        return (countPassingPoints*100.0)/this.points.size();
    }
    
    
    public double averageOfPoints(){
        if (this.points.size() == 0){
            return -1;
        }
        
        return (totalSum(this.points)*1.0)/this.points.size();
        
    }
    
   
}

