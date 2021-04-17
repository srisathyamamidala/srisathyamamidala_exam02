/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question08Example02;

import java.util.Scanner;

/**
 *
 * @author Sri Sathya Mamidala
 */
public class EnergyDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner nacs= new Scanner(System.in);
        System.out.print("Enter the velocity of the object: ");
        double velocity=nacs.nextDouble();
        System.out.print("Enter the mass of the object: ");
        double mass=nacs.nextDouble();
        System.out.print("Enter the time travelled for the object: ");
        double time=nacs.nextDouble();    
        System.out.print("Enter the height travelled by the object: ");
        double height=nacs.nextDouble();
        Energy ener=new KineticEnergy( velocity,  mass,  time);
        System.out.println(ener.toString());
        
        Energy potEner=new PotentialEnergy(height, mass, time);
        System.out.println(potEner.toString());
        
    }
    
}
