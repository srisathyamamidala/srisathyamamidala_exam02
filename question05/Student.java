/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question05;

/**
 *
 * @author S542298
 */
public class Student extends Person{
    
    private String grade;
    private static final String classStatus="Graduate";

    public Student(String grade, String name, String address, String phoneNumber, String emailAddress) {
        super(name, address, phoneNumber, emailAddress);
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    /**
     *
     * @return
     */
    @Override
    public String getFirstLetter(){
        return super.getName().substring(0,1);
    }


    @Override
    public String toString() {
        return "Student: "+"\nPerson name: "+super.getName()+ "\ngrade:" + grade+
                "\nclass status: "+classStatus+
                "\nfirst letter: "+getFirstLetter();
    }
    
    
    
}
