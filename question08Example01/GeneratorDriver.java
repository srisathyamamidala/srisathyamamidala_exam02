/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question08Example01;

import java.util.Scanner;

/**
 *
 * @author Sri Sathya Mamidala
 */
public class GeneratorDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner nacs= new Scanner(System.in);
        System.out.print("Enter the emf of the generator: ");       
        double emf=nacs.nextDouble();
        System.out.print("Enter the armature resistance of the generator: ");
        double armatureResistance=nacs.nextDouble();
        System.out.print("Enter the field current of the shunt generator: ");
        double fieldCurrent = nacs.nextDouble();
        System.out.print("Enter the load current of the shunt generator: ");
        double loadCurrent=nacs.nextDouble();   
        System.out.print("Enter the series resistance of the series generator: ");
        double seriesResistance=nacs.nextDouble();
        System.out.print("Enter the armature current of the series generator: ");
        double armatureCurrent=nacs.nextDouble();
        
        Generator shuntgen=new ShuntGenerator( fieldCurrent, loadCurrent,emf,  armatureResistance);
        System.out.println(shuntgen.toString());
        
        Generator seriesgen =new SeriesGenerator(seriesResistance,  armatureCurrent,  emf,  armatureResistance);
           System.out.println(seriesgen.toString());
    }
    
}
