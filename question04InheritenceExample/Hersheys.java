/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question04InheritenceExample;

/**
 *
 * @author Sri Sathya Mamidala
 */
public class Hersheys extends DarkChocolate {
    private int isNuts;
    private double price;

    public Hersheys(int isNuts, double price, int quantity, double costOfEachChoc, String customerName, String chocName) {
        super(quantity, costOfEachChoc,customerName, chocName);
        this.isNuts = isNuts;
        this.price = price;
    }


    public int getIsNuts() {
        return isNuts;
    }

    public void setIsNuts(int isNuts) {
        this.isNuts = isNuts;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public boolean nuts(){
       if (isNuts != 0) {
           return true;
       }
           else {
                   return false;
                   }   
       }
      
    @Override
    public double totalCost(){    
    double cost=0.0;
       cost =super.getQuantity()*price;
        return cost; 
       }

    @Override
    public String toString() {
        return super.toString()+"\n"+
                "total cost of chocolate:$ "+ totalCost()+"\n"+
                "if nuts are present in Hersheys: "+nuts();
        
    }
      
    
       
}
          
