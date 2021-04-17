/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question04InheritenceExample;

import java.util.Scanner;

/**
 *
 * @author Sri Sathya Mamidala
 */
public class ChocolateDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner nacs= new Scanner(System.in);
        System.out.print("Enter nuts: ");
        int isNuts =nacs.nextInt();
        System.out.print("Enter price:$ ");
        double price =nacs.nextDouble();
        System.out.print("Enter quantity: ");
        int quantity=nacs.nextInt();
        System.out.print("Enter cost of each chocolate:$ ");
        double costOfEachChoc=nacs.nextDouble();
        System.out.print("Enter customer name: ");
        String customerName=nacs.next();
        System.out.print("Enter the name of the chocolate of 2nd customer: ");
        String chocName=nacs.next();
        DarkChocolate choco=new DarkChocolate( quantity,costOfEachChoc,"Sathya",chocName);
        Hersheys hershey= new Hersheys(isNuts,price,quantity,costOfEachChoc,customerName,"Hersheys");   
        System.out.println(choco.toString());
        System.out.println("Second customer: "); 
        System.out.println(hershey.toString());
        
        
        
        
    }
    
}
