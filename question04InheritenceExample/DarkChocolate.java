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
public class DarkChocolate extends Chocolate{
    private int quantity;
    private double costOfEachChoc;
    

    public DarkChocolate(int quantity, double costOfEachChoc, String customerName, String chocName) {
        super(customerName, chocName);
        this.quantity = quantity;
        this.costOfEachChoc = costOfEachChoc;
        
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getCostOfEachChoc() {
        return costOfEachChoc;
    }

    public void setCostOfEachChoc(double costOfEachChoc) {
        this.costOfEachChoc = costOfEachChoc;
    }
    
    public double totalCost(){
        double cost=quantity*costOfEachChoc;
        return cost;
        
    }
    
}
