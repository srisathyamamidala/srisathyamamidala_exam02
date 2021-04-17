/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question05;

import java.util.Scanner;

/**
 *
 * @author S542298
 */
public class DriverClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner nacs =new Scanner(System.in);
        System.out.print("Enter the address: ");
        String address=nacs.next();
        System.out.print("Enter the phone number: ");
        String phoneNumber=nacs.next();
        System.out.print("Enter the email address: ");
        String emailAddress=nacs.next();
        System.out.print("Enter the grade: ");
        String grade=nacs.next();
        System.out.print("Enter the salary: ");
        double salary=nacs.nextDouble();
        
       Person person =new Person( "sathya",  address,  phoneNumber, emailAddress);
       Person student=new Student(grade, "akanksha",  address, "660-215-0989", "akanksha@gmail.com");
       Person employee=new Employee("ISU",  salary, "8/27/2020", "shabnam", address, phoneNumber, "shabnam@gmail.com");
       Person staff=new Staff("Professor",  "CSU", salary,  "8/29/2020", "swarupa",  address, "660-215-0987", "swarupa@gmail.com");
       Person faculty=new Faculty(10, 5,"NWMSU",  salary, "9/30/2019", "Prasanna", address, phoneNumber,"Pra@gmail.com");
        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(staff.toString());
        System.out.println(faculty.toString());
        
       
        
    }
    
}
