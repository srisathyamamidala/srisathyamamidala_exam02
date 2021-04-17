/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question07Example01;



/**
 *
 * @author Sri Sathya Mamidala
 */
public class CircleDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Diameter length: "+PartsOfCircle.DIAMETER.getLength());
        
        for(PartsOfCircle cir : PartsOfCircle.values()){
            System.out.println(cir+"\nlength is: "+cir.getLength()+"\nShortcut is: "+cir.getShortcut());
            
        }
        
      
        
        
    }
    
}
