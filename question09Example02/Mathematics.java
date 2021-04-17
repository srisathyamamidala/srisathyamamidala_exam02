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
public class Mathematics implements Trignometry,Geometry {

    private final double side;
    private final double breadth;
    private final double radius;
    private final double height;
    private final double angle;
    private final String object;

    public Mathematics(double side, double breadth, double radius, double height, double angle, String object) {
        this.side = side;
        this.breadth = breadth;
        this.radius = radius;
        this.height = height;
        this.angle = angle;
        this.object = object;
    }

    public double getSide() {
        return side;
    }

    public double getBreadth() {
        return breadth;
    }

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }

    public double getAngle() {
        return angle;
    }

    public String getObject() {
        return object;
    }
    
    
    @Override
    public double additionInTrig() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.print("cos(A+B) is: ");
        return Math.cos(side+radius);
    }

    @Override
    public double angle(double value) {
        //return Trignometry.super.angle(value); //To change body of generated methods, choose Tools | Templates.
        System.out.print("angle is: ");
        return Math.tan(value);
    }

    @Override
    public double missingSideInTriangle() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.print("Missing side in a triangle is: ");
       double missingSide= side*Math.sin(angle);
       return missingSide;
    }

    @Override
    public double perimeterFormulae() {
        System.out.print("Perimeter of an object is: ");
        double perimeter=0.0;
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       
       if(object.equals("square")){
           perimeter=4*side;    
       }
       if(object.equals("rectangle")){
           perimeter= 2*(side+breadth);
       }
       if(object.equals("circle")){
           perimeter=2*Math.PI*radius;
       }
       return perimeter;
    }

    @Override
    public double volume(double radius1, double height1) {
        System.out.print("Volume of Cylinder is: ");
       // return Geometry.super.volume(radius, height); //To change body of generated methods, choose Tools | Templates.
       double volumeOfCylinder=4/3*Math.PI*Math.pow(radius1, 2)*height1;
       return volumeOfCylinder;
    }
    
    
    
}
