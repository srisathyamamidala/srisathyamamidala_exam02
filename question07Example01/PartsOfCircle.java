/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question07Example01;

/**
 *
 * @author Sri Sathya Mamidala
 * 
 */
public enum PartsOfCircle {
    TANGENT(4.5,"T"), 
    CHORD(6.2,"C"),
    RADIUS(3.7,"R"),
    DIAMETER(7.4,"D"),;
    private final double length;
    public final String shortcut;

    private PartsOfCircle(double length, String shortcut) {
        this.length = length;
        this.shortcut = shortcut;
    }

    public double getLength() {
        return length;
    }
      

    public String getShortcut() {
        return shortcut;
    }

    
    

}
    
    
    

