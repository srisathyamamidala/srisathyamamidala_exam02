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
public interface Geometry {
    
 double perimeterFormulae();
 
 default double volume(double radius1,double height1){
     
     double volume= (4/3)*Math.PI*Math.pow(radius1, 3);
     return volume;
 }
    
}
