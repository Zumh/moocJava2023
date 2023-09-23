/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
public class Literacy implements Comparable<Literacy>{
    // gender, country, year, literacy percent
    private String gender;
    private String country;
    private int year;
    private Double literacyPercent;
    
    public Literacy(String gender, String country, int year, double literacyPercent){
        this.gender = gender;
        this.country = country;
        this.year = year;
        this.literacyPercent = literacyPercent;
    }
    
    public double getLitreacyPercent(){
        return this.literacyPercent;
    }
    
    
    public String getGender(){
        return this.gender;
    }
    
    public int getYear(){
        return this.year;
    }
    
    public String getCountry(){
        return this.country;
    }
    
    @Override
    public int compareTo(Literacy literacy){
        // compare each percent.
        int status = -1;
        if (this.literacyPercent == literacy.getLitreacyPercent()){
            status = 0;
        } else if (this.literacyPercent > literacy.getLitreacyPercent()){
            status = 1;
        }
        return status;
        
    }
    
    @Override
    public String toString(){
        return this.country + " ("+this.year+"), " + this.gender + ", " + this.literacyPercent;
    }
}
