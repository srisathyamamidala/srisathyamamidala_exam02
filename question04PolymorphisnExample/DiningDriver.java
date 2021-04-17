/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question04PolymorphisnExample;

import java.util.Scanner;

/**
 *
 * @author Sri Sathya Mamidala
 */
public class DiningDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner nacs= new Scanner(System.in);
        System.out.print("Enter the name of the employee: ");
        String NameOfEmployee=nacs.next();
        System.out.print("Enter the number of people: ");
        int noOfPeople=nacs.nextInt();
        System.out.print("Enter the number of items made: ");
        int itemsMade=nacs.nextInt();
        System.out.print("Enter leftovers: ");
        int leftovers=nacs.nextInt();
        System.out.print("Enter the sub: ");
        String subMade=nacs.next();
        DiningSection din=new ProduceMarket(subMade, "sathya",2, itemsMade, leftovers);
        System.out.print("Enter the salary of employee: ");
        
        double salary=nacs.nextDouble();
        System.out.print("Enter number of hours: ");
        int noOfHours=nacs.nextInt();
        System.out.print("Enter left quantity: ");
        int leftover=nacs.nextInt();
        Mongolian dine= new Mongolian(salary, noOfHours, leftover, NameOfEmployee,noOfPeople, itemsMade,leftovers);
        System.out.println("with respect to dining section"+"\n"+din.toString());
        System.out.println("In mongolian section: ");
        System.out.print("Name of the employee: ");
        System.out.println(dine.getNameOfEmployee());
        System.out.print("The number of people working there: ");
        System.out.println(dine.getNoOfPeople());
        System.out.print("The total salary for week: ");
        System.out.println(dine.totalSalary());
        System.out.print("The items sold: ");
        System.out.println(dine.itemsSold());
        System.out.print("The sub is made with: ");
        System.out.println(din.sub());
        
        
    }
    
}
