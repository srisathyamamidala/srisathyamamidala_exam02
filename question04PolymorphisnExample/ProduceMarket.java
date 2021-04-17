/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question04PolymorphisnExample;

/**
 *
 * @author Sri Sathya Mamidala
 */
public class ProduceMarket extends DiningSection{
    
    private String subMade;

    public ProduceMarket(String subMade, String NameOfEmployee, int noOfPeople, int itemsMade, int leftovers) {
        super(NameOfEmployee, noOfPeople, itemsMade, leftovers);
        this.subMade = subMade;
    }
    

    public String getSubMade() {
        return subMade;
    }

    public void setSubMade(String subMade) {
        this.subMade = subMade;
    }

    
       
   
   public String sub(){
       
       System.out.print("In produce market: ");
        switch (subMade) {
            case "italian":
                return "with asiago bread";
            case "mexican":
                return "with alepano chatter bread";
            default:
                return "other bread";
        }
           
   }
   
}
