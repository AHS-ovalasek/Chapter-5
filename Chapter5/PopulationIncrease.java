/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Owen Valasek
 * PC 6 - Population Class
 * 11/28/18
 */
public class PopulationIncrease {
    private double population;
    private double increase;
    private int days;
    public int count;
    
    public PopulationIncrease(double p, double i, int d){
            population = p;
            increase = i;
            days = d;
    }
    public void setPopulation(int p){
            population = p;
    }
    public void setIncrease(double i){
        increase = i;
    }
    public void setDays(int d){
        days = d;
    }
    public double dailyPopulation(){
        for(count = 1; count <= days; count++){
            population = population * increase;
        }
        return population;
    }
}
