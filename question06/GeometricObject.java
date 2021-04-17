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
public abstract class GeometricObject {
    
    private final String objectName;
    private final String color;

    public GeometricObject(String objectName, String color) {
        this.objectName = objectName;
        this.color = color;
    }
    
    

    public String getObjectName() {
        return objectName;
    }

    public String getColor() {
        return color;
    }
  public abstract boolean isFilled();
  public abstract double areaOfTriangle();
  public abstract double perimeterOfTriangle();

    @Override
    public String toString() {
        return "objectName: " + objectName + "\n    color: " + color ;
    }
    
    
}
