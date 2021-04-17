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
public class KineticEnergy extends Energy{
    private final double velocity;

    public KineticEnergy(double velocity, double mass, double time) {
        super(mass, time);
        this.velocity = velocity;
    }

    public double getVelocity() {
        return velocity;
    }
    
    

    @Override
    public double calculateEnergy() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        double x= Math.pow(velocity, 2);
        double kineticEner= 0.5*super.getMass()*x;
        return kineticEner;
    }

    @Override
    public double calculatePower() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        double power= calculateEnergy()/super.getTime();
        return power;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString(){
        return "The mass of an object is: "+super.getMass()+"kgs"+
                "\nTime travelled by the object is: "+super.getTime()+"min"+
                "\n velocity at which the object is travelling is: "+velocity+"km/hr"+
                "\nKinetic energy of an object is: "+calculateEnergy()+"Joules"+
                "\nPower is: "+calculatePower()+"Watts";
    }    
    
    
    
}
