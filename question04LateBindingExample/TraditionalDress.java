/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question04LateBindingExample;

/**
 *
 * @author S542298
 */
public class TraditionalDress extends Dress{
    
    private String typeOfDress;

    public TraditionalDress(String typeOfDress, String customer, String location, int dressesSold) {
        super(customer, location, dressesSold);
        this.typeOfDress = typeOfDress;
    }

    public String getTypeOfDress() {
        return typeOfDress;
    }
    
    
    
    @Override
    public String dress(String dressName){
        return dressName.toLowerCase().trim();      
     }
    
    public String myDress(){
        String MyString=" ";
        if(typeOfDress.equals("saree")){
             MyString="Too traditional";
        }
         if(typeOfDress.equals("kurthi")){
             MyString= "Little bit tradional";
         }
         if(typeOfDress.equals("Jeans")){
             MyString= "Not traditional";
            
        } 
        return MyString;
    }

    @Override
    public String toString() {
        return  super.toString()+"\ntypeOfDress: " + typeOfDress+
                "\n kind of person: "+myDress();
    }
    
    
}


