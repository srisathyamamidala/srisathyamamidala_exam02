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
public class SeriesGenerator extends Generator{
    
    private final double seriesResistance;
    private final  double armatureCurrent;
   

    public SeriesGenerator(double seriesResistance, double armatureCurrent, double emf, double armatureResistance) {
        super(emf, armatureResistance);
        this.seriesResistance = seriesResistance;
        this.armatureCurrent = armatureCurrent;
        
    }

    public double getSeriesResistance() {
        return seriesResistance;
    }

    public double getArmatureCurrent() {
        return armatureCurrent;
    }

   
     
    
    @Override
    public double voltageProduced() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       double voltage= super.getEmf()-(armatureCurrent*(super.getArmatureResistance()+seriesResistance));
       return voltage;
    }

    @Override
    public double torqueProduced() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       double torque= Math.pow(armatureCurrent, 2);
       return torque;
    }

    @Override
    public String toString() {
        return  "seriesResistance: " + seriesResistance + "\narmatureCurrent: " + armatureCurrent 
                +"\nVoltage produced in a series generator: "+voltageProduced()+
                "\nTorque produced in a series generator: "+torqueProduced();
    }
    
    
    
}
