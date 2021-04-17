/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question06;

/**
 *
 * @author S542298
 */
public class Triangle extends GeometricObject{
    private final double tr1;
    private final double tr2;
    private final double tr3;
    private String filling;

    public Triangle(double tr1, double tr2, double tr3, String filling, String objectName, String color) {
        super(objectName, color);
        this.tr1 = tr1;
        this.tr2 = tr2;
        this.tr3 = tr3;
        this.filling = filling;
    }

    public double getTr1() {
        return tr1;
    }

    public double getTr2() {
        return tr2;
    }

    public double getTr3() {
        return tr3;
    }

    public String getFilling() {
        return filling;
    }

   
    
    @Override
    public boolean isFilled() {
       
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(filling.equals("filled")){
            return true;
        }
        else
            return false;
    }

    

    @Override
    public double perimeterOfTriangle() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        double perimeter=tr1+tr2+tr3;
        return perimeter;
    }
    @Override
    public double areaOfTriangle() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        double x= perimeterOfTriangle()*((perimeterOfTriangle()-tr1)*(perimeterOfTriangle()-tr2)*(perimeterOfTriangle()-tr3));
        double area=Math.sqrt(x);
        return area;
    }

    @Override
    public String toString() {
        return super.toString() + "\n    first side of a triangle is: " + tr1 + "\n    second side of a triangle is: " + tr2 
                + "\n    third side of a triangle is: " + tr3 + 
                "\n    whether the triangle is filled: "+isFilled()+
                "\n    Area of a triangle: "+areaOfTriangle()+
                "\n    Perimeter of the triangle: "+perimeterOfTriangle();
    }
    
    
    
    
}
