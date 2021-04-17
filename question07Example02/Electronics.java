/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question07Example02;

/**
 *
 * @author S542298
 */
public enum Electronics {
    TELEVISION(50,700,15.5),
    LAPTOP(13.2,200,10.3),
    MOBILEPHONE(6.3,150,8.7);
    
    private final double inches;
    private final int price;
    private final double tax;

    private Electronics(double inches, int price, double tax) {
        this.inches = inches;
        this.price = price;
        this.tax = tax;
    }

    public double getInches() {
        return inches;
    }

    
    
    public int getPrice() {
        return price;
    }

    
    
    public double getTax() {
        return tax;
    }

    
    

    public double priceAfterTax(){
        double Cost= price+tax;
        return Cost;
    }
    
    
    
}
