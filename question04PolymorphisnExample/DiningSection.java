/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question04PolymorphisnExample;

/**
 *
 * @author S542298
 */
public class DiningSection {
    private String NameOfEmployee;
    private int noOfPeople;
    private int itemsMade;
    private int leftovers;

    public DiningSection(String NameOfEmployee, int noOfPeople, int itemsMade, int leftovers) {
        this.NameOfEmployee = NameOfEmployee;
        this.noOfPeople = noOfPeople;
        this.itemsMade = itemsMade;
        this.leftovers = leftovers;
    }

    public String getNameOfEmployee() {
        return NameOfEmployee;
    }

    public void setNameOfEmployee(String NameOfEmployee) {
        this.NameOfEmployee = NameOfEmployee;
    }

    public int getNoOfPeople() {
        return noOfPeople;
    }

    public void setNoOfPeople(int noOfPeople) {
        this.noOfPeople = noOfPeople;
    }

    public int getItemsMade() {
        return itemsMade;
    }

    public void setItemsMade(int itemsMade) {
        this.itemsMade = itemsMade;
    }

    public int getLeftovers() {
        return leftovers;
    }

    public void setLeftovers(int leftovers) {
        this.leftovers = leftovers;
    }

   
    public int itemsSold(){
        int sold= itemsMade-leftovers;
        return sold;
    }

    @Override
    public String toString() {
        return "Name of the employee working there: " + NameOfEmployee +"\n"+
                "no of people present in a station: " + noOfPeople;
    }

    /**
     *
     * @return
     */
    public double totalSalary(){
        System.out.print("In dining section: ");
        return 415.4;
        
    }
    public String sub(){
        System.out.print("In dining section: ");
      return "kind of bread";
           
       }
    }
    
    

