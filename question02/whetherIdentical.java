/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question02;

import java.util.Scanner;

/**
 *
 * @author S542298
 */
public class whetherIdentical {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          final int rows=3;
          final int columns=3;
          Scanner myNum=new Scanner(System.in);
          
          int[][] m1 = new int[rows][columns];
          int[][] m2=new int[rows][columns];
          System.out.print("Enter list1: ");
           for(int i = 0; i < rows; i++){
              for (int j = 0; j < columns; j++){
                  m1[i][j] = myNum.nextInt();
              }
           }
    
          System.out.print("Enter list2: ");
           for(int i = 0; i < rows; i++){
              for (int j = 0; j < columns; j++){
                  m2[i][j] = myNum.nextInt();
              }
           }
    
            if (equals(m1, m2)) {
            System.out.println("The two arrays are strictly identical");
        } else {
            System.out.println("The two arrays are not strictly identical");
        }
    }

    private static boolean equals(int[][] m1, int[][] m2) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
		for (int i = 0; i < 3 ; i++) {
			for (int j = 0; j < 3; j++) {
				if (m1[i][j] != m2[i][j])
					return false;
			}
		}
		return true;
	}
}