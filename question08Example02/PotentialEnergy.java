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
public class PotentialEnergy extends Energy {
    private static final double gravity=9.8;
    private final double height;

    public PotentialEnergy(double height, double mass, double time) {
        super(mass, time);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
    
    /**
     *
     * @return
     */
    @Override
    public double calculateEnergy() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        double potentialEner=super.getMass()*gravity*height;
        return potentialEner;
        
    }

    @Override
    public double calculatePower() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        double power=calculateEnergy()/super.getTime();
        return power;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return  "height travelled by the object is: " + height +"metres"+
                "\nPotential energy of the object is: "+calculateEnergy()+"Joules"+
                "\nPower is: "+calculatePower()+"Watts";
                
    }

    
    
    
    
}
