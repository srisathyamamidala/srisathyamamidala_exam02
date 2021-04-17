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
public class Chocolate {
    private String customerName;
    private String chocName;

    public Chocolate(String customerName, String chocName) {
        this.customerName = customerName;
        this.chocName = chocName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getChocName() {
        return chocName;
    }

    public void setChocName(String chocName) {
        this.chocName = chocName;
    }

    @Override
    public String toString() {
        return  "customerName: " + customerName +"\n "+"chocName: " + chocName;
    }
    
    
    
    
    
}
