/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question01;

import java.util.ArrayList;
import java.util.Objects;

import java.util.Scanner;

/**
 *
 * @author S542298
 */
public class distinctIntegers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.print("Enter 10 integers: ");
        Scanner nacs = new Scanner(System.in);
        ArrayList<Integer> values = new ArrayList<>();
        
        int size=10;
        for (int i = 0; i < size; i++)
        {
          
            values.add(nacs.nextInt());
        }
        
        removeDuplicate(values);
        System.out.print("The distinct integers are ");
        
        for(int i=0;i<values.size();i++){
           System.out.print(values.get(i)+" ");
        }
            
        
    }

    public static void removeDuplicate(ArrayList<Integer> list) {

       
        for (int i = 0; i < list.size(); i++) {
             for (int j = i + 1; j < list.size(); j++) {
                if (Objects.equals(list.get(i), list.get(j))) {
                   list.remove(j);
                }
            }
            
        }
    }
}
    

        