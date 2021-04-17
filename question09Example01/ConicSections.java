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
public class ConicSections implements Parabola,Circle{
    
    private int focus;
    private double radius;
    private double side;

    public ConicSections(int focus, double radius, double side) {
        this.focus = focus;
        this.radius = radius;
        this.side = side;
    }

    public int getFocus() {
        return focus;
    }

    

    public double getRadius() {
        return radius;
    }

    
    public double getSide() {
        return side;
    }

    

    @Override
    public double area() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return Math.PI*radius*side;
    }

    @Override
    public double directrix(int a) {
        return Math.pow(a, 2)/focus; //To change body of generated methods, choose Tools | Templates.
        
    }

    @Override
    public double perimeterOfCircle() {
    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return 2*Math.PI*radius;
        
    }

    @Override
    public int getAngle(int angle) {
        return angle/3; //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
}
