/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question09Example01;

/**
 *
 * @author Sri Sathya Mamidala
 */
public interface Circle {
    
    double perimeterOfCircle();
    
    default int getAngle(int angle){
        int angleInSemi=angle/2;
        return angleInSemi;
        
    }
    
}
