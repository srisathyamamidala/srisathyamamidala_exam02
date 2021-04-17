/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question06;

import java.util.Scanner;

/**
 *
 * @author S542298
 */
public class TriangleDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner nacs= new Scanner(System.in);
        System.out.print("Enter the first side of triangle: ");
        double tr1=nacs.nextDouble();
        System.out.print("Enter the second side of triangle: ");
        double tr2=nacs.nextDouble();
        System.out.print("Enter the third side of triangle: ");
        double tr3=nacs.nextDouble();
        System.out.print("Enter whether filled or not: ");
        String filling=nacs.next();
        
        GeometricObject geoOb=new Triangle(tr1,  tr2,  tr3,filling,"Triangle",  "Black");
        System.out.println(geoOb.toString());
        
    }
    
}
