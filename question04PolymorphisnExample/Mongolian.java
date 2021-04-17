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
public class Mongolian extends DiningSection {
    private double salary;
    private int noOfHours;
    private int leftover;

    public Mongolian(double salary, int noOfHours, int leftover, String NameOfEmployee, int noOfPeople, int itemsMade, int leftovers) {
        super(NameOfEmployee, noOfPeople, itemsMade, leftovers);
        this.salary = salary;
        this.noOfHours = noOfHours;
        this.leftover = leftover;
    }

    
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getNoOfHours() {
        return noOfHours;
    }

    public void setNoOfHours(int noOfHours) {
        this.noOfHours = noOfHours;
    }

    public int getLeftover() {
        return leftover;
    }

    public void setLeftover(int leftover) {
        this.leftover = leftover;
    }
    
    /**
     *
     * @return
     */
    
    public double totalSalary(){
        System.out.print("In mongolian: ");
        double total=0.0;
        total=salary*noOfHours;
        return total;
    }
    
    
     public int itemsSold(){
         System.out.print("In mongolian: ");
        int sold= super.getItemsMade()-leftover;
        return sold;
    }
    
    
     public String toString(){
         System.out.print("In mongolian: ");
         return super.toString()+ "\ntotal salary of employee: "+totalSalary()+
                 "\nitems sold: "+itemsSold();
                 
     }
     
}
