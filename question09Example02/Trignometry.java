/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question09Example02;

/**
 *
 * @author Sri Sathya Mamidala
 */
public interface Trignometry {
    
   double additionInTrig();
   
   default double angle(double value){
       return Math.sin(value);   
    }
    
   double missingSideInTriangle();
}
