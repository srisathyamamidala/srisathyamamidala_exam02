/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question09Example01;

import java.util.Scanner;

/**
 *
 * @author Sri Sathya Mamidala
 */
public class ConicDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner nacs= new Scanner(System.in);
        System.out.print("Enter the focus: ");
        int focus= nacs.nextInt();
        System.out.print("Enter the radius: ");
        double radius=nacs.nextDouble();
        System.out.print("Enter the side: ");
        double side=nacs.nextDouble();
        
        ConicSections conic = new ConicSections (focus,  radius,  side);
        System.out.print("The directrix is: ");
        System.out.println(conic.directrix(10));
        System.out.print("The area is: ");
        System.out.println(conic.area());
        System.out.print("The perimeter of circle is: ");
        System.out.println(conic.perimeterOfCircle());
        System.out.print("The angle is: ");
        System.out.println(conic.getAngle(60));
        
        
        
    }

    
    
}
