/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question04LateBindingExample;

/**
 *
 * @author S542298
 */
public class Dress {
    
    private String customer;
    private String location;
    private int dressesSold;

    public Dress(String customer, String location, int dressesSold) {
        this.customer = customer;
        this.location = location;
        this.dressesSold = dressesSold;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getDressesSold() {
        return dressesSold;
    }

    public void setDressesSold(int dressesSold) {
        this.dressesSold = dressesSold;
    }

    public String isGainingMoney(){
        if (dressesSold > 6){
            return "gaining more money";
        }
        else{
            return "not gaining money" ;
                 
        }
    } 
      public String dress(String dressName){
            return dressName.substring(0, 2);
        }
    
    @Override
    public String toString() {
        return "customer: " + customer + "\nlocation: " + location +"\ndressesSold: " + dressesSold;
    }

    
  
    
    
}
