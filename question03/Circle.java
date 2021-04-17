/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question03;

/**
 *
 * @author S542298
 */
public class Circle {
    
    private final double radius;
    private final double perpendicularDistance;
    
    private final double angle;

    public Circle(double radius, double perpendicularDistance, double angle) {
        this.radius = radius;
        this.perpendicularDistance = perpendicularDistance;
        this.angle = angle;
    }

    public double getRadius() {
        return radius;
    }

    public double getPerpendicularDistance() {
        return perpendicularDistance;
    }

    public double getAngle() {
        return angle;
    }
    
    public double lengthOfArc(){
        return  2*Math.PI*radius*(angle/360);
    }
    public double lengthOfChord(){
        double x=Math.pow(radius, 2)-Math.pow(perpendicularDistance, 2);
        return 2*Math.sqrt(x);
    }

    @Override
    public String toString() {
        return  "radius of a circle is: " + radius + "\nperpendicular Distance in a circle is: " + perpendicularDistance + "\nangle in a circle is: " + angle +
                "\nlength of an arc is: "+lengthOfArc()+"\nlength of a chord is: "+lengthOfChord();
    }
    
    
}
