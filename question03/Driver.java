/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question03;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author S542298
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner nacs= new Scanner(System.in);
        System.out.print("Enter the principle amount: ");
        double principleAmount=nacs.nextDouble();
        System.out.print("Enter the rate of interest: ");
        double rateOfInterest=nacs.nextDouble();
        System.out.print("Enter the repayment period: ");
        int repaymentPeriod=nacs.nextInt();
        ArrayList<Object> myOwn = new ArrayList<Object>();
        myOwn.add(new Loan(principleAmount,rateOfInterest,repaymentPeriod));
        myOwn.add(new Date());
        myOwn.add(new String("I am sri sathya"));
        myOwn.add(new Circle(5.4,3.2,4.3));
        for (int i = 0; i < myOwn.size(); i++) {
            System.out.println((myOwn.get(i)).toString());
    }
    
}
}