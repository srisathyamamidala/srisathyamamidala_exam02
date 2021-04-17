/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question07Example02;

/**
 *
 * @author Sri Sathya Mamidala
 */
public class ElectronicsDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("The telivision is of "+Electronics.TELEVISION.getInches()+" inches");
        System.out.println("The cost of Laptop is "+Electronics.LAPTOP.getPrice()+"$");
        System.out.println("The tax applied to mobile phone is: "+Electronics.MOBILEPHONE.getTax()+"$");
        for(Electronics elec : Electronics.values()){
            
        
        System.out.println(elec+ "The price of the three mentioned electronics after tax is: "+elec.priceAfterTax()+"$");
        }
    }
    
}
