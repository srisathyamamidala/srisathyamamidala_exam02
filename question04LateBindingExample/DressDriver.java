/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question04LateBindingExample;

import java.util.Scanner;

/**
 *
 * @author Sri Sathya Mamidala
 */
public class DressDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner nacs= new Scanner(System.in);
        System.out.print("Enter the number of sarees sold: ");
        int sareesSold=nacs.nextInt();
        System.out.print("Enter the cost of each saree is: ");
        int costOfEachSaree=nacs.nextInt();
        System.out.print("Enter the type of dress: ");
        String typeOfDress=nacs.next();
        
        System.out.print("Enter the name of customer: ");
        String customer=nacs.next();
        
        System.out.print("Enter the number of dresses sold: ");
        int dressesSold=nacs.nextInt();
        
        Dress dr =new Saree( sareesSold, costOfEachSaree,typeOfDress, customer,"1111N college drive", dressesSold);
        
        System.out.println(dr.toString());
        
        
    }
    
}
