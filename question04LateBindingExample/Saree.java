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
public class Saree extends TraditionalDress{
    
    private final int sareesSold;
    private final int costOfEachSaree;

    public Saree(int sareesSold, int costOfEachSaree, String typeOfDress, String customer, String location, int dressesSold) {
        super(typeOfDress, customer, location, dressesSold);
        this.sareesSold = sareesSold;
        this.costOfEachSaree = costOfEachSaree;
    }

    

    public int getSareesSold() {
        return sareesSold;
    }

    public int getCostOfEachSaree() {
        return costOfEachSaree;
    }
    
    public int totalCost(){
        return sareesSold*costOfEachSaree;
    }
    
    
    @Override
    public String isGainingMoney(){
        if(sareesSold>10){
            return "seller is gaining more money today";
            
        }
        else if(sareesSold<=5){
            return "seller is not gaining money today";
        }
        else
            return "Enter the number which is below 5 and above 10";
    }

    @Override
    public String toString() {
        return super.toString()+"\nnumber of sareesSold: " + sareesSold + "\ncostOfEachSaree: " + costOfEachSaree+
                "\ntotal money gained by sarees: "+totalCost()+
                "\nwhether gaining money: "+isGainingMoney();
                        
    }
    
    
    
}
