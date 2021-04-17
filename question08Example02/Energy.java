/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question08Example02;

/**
 *
 * @author Sri Sathya Mamidala
 */
public abstract class Energy {
    private final double mass;
    private final double time;

    public Energy(double mass, double time) {
        this.mass = mass;
        this.time = time;
    }

    public double getMass() {
        return mass;
    }

    
    

    public double getTime() {
        return time;
    }

   
    
    public abstract double calculateEnergy();
    public abstract double calculatePower();
    

    @Override
    public String toString() {
        return  "mass: " + mass + "time: " + time ;
    }
    
    
}
