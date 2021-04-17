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
public class ShuntGenerator extends Generator{
    private final double fieldCurrent;
    private final double loadCurrent;

   
    
    private final static double x=2.5;

    public ShuntGenerator(double fieldCurrent, double loadCurrent, double emf, double armatureResistance) {
        super(emf, armatureResistance);
       
        this.fieldCurrent = fieldCurrent;
        this.loadCurrent = loadCurrent;
        
    }

   
    
    public double getFieldCurrent() {
        return fieldCurrent;
    }

    
    public double getLoadCurrent() {
        return loadCurrent;
    }

  
    
    @Override
    public double voltageProduced() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        double armatureCurrent= fieldCurrent+loadCurrent;
        double voltage= super.getEmf()-(armatureCurrent*super.getArmatureResistance());
        return voltage;
        
    }

    @Override
    public double torqueProduced() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        double armatureCurrent= fieldCurrent+loadCurrent;
        double torque=x*armatureCurrent;
        return torque;
    }

    @Override
    public String toString() {
        return  "fieldCurrent: " + fieldCurrent + "\nloadCurrent: " + loadCurrent + 
                "\nVoltage produced in a shunt generator: "+voltageProduced()+
                "\nTorque produced in a shunt generator: "+torqueProduced();
    }
    
    

    
    
    
}
