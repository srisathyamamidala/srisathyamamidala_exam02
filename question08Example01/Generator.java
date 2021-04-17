/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question08Example01;

/**
 *
 * @author Sri Sathya Mamidala
 */
public abstract class Generator {
    private final double emf;
    private final double armatureResistance;
    
    public Generator(double emf, double armatureResistance) {
        this.emf = emf;
        this.armatureResistance = armatureResistance;
       
    }

    public double getEmf() {
        return emf;
    }

    
    public double getArmatureResistance() {
        return armatureResistance;
    }
  
    
    public abstract double voltageProduced();
    public abstract double torqueProduced();

    @Override
    public String toString() {
        return  "emf of the generator: " + emf + 
                "\narmature Resistance of the generator: " + armatureResistance;
                
        
                }
}
    
    
    
    
    
    

