/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question09Example02;

import java.util.Scanner;

/**
 *
 * @author Sri Sathya Mamidala
 */
public class MathematicsDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner nacs= new Scanner(System.in);
        System.out.print("Enter the side: ");
        double side= nacs.nextDouble();
        System.out.print("Enter the breadth: ");
        double breadth=nacs.nextDouble();
        System.out.print("Enter the radius: ");
        double radius=nacs.nextDouble();
        System.out.print("Enter the height: ");
        double height=nacs.nextDouble();
        System.out.print("Enter the angle: ");
        double angle=nacs.nextDouble();
        System.out.print("Enter the object name: ");
        String object=nacs.next();
       Mathematics maths= new  Mathematics( side,  breadth,  radius, height,  angle,  object);
       
        System.out.println(maths.additionInTrig());
        System.out.println(maths.angle(15));
        System.out.println(maths.missingSideInTriangle());
        System.out.println(maths.perimeterFormulae());
        System.out.println(maths.volume(10.2,9.5));
       
       
    }
    
}
