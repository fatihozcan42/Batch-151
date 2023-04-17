package Javaders.Javaders.day15loopsarrays;

import java.util.Scanner;

public class NestedLoop01 {
    public static void main(String[] args) {

        /*
         /*
        1.Example:Type code to get the output like
            Week: 1
              Day: 1
              Day: 2
              Day: 3
              .....
            Week: 2
              Day: 1
              Day: 2
              Day: 3
              ....
            Week: 3
              Day: 1
              Day: 2
              Day: 3
              ....
         */

        // nestedloop genellikle for ile kullanilir.

        for (int i = 1; i <5 ; i++) {
            System.out.println("Week: "+i);
            for (int j = 1; j <8 ; j++) {
                System.out.println(" Day: "+j);
            }
        }

        //Nested while-loop
        int i=1;
        while(i<3){
            System.out.println("Week: " + i);
            int k=1;
            while(k<4){
                System.out.println("   Day: " + k);
                k++;
            }
            i++;
        }

       /*
        2.Example: Write a Java Program to Print Rectangle Star Pattern using For Loop

        (Asagidaki sekli olusturmak bir Java programi yaziniz)
                        ****
                        ****
                        ****
        Note: Get the number of the rows and the columns from user
        */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number of rows");
        int rows = input.nextInt();

        System.out.println("Please enter number of columns");
        int columns = input.nextInt();

        for (int r =1 ; r <=rows ; r++) {

            for (int j = 1; j <=columns ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

       /*
        3.Example: Type code to get the output like
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
*/
        System.out.println("Please enter row number");
        int row = input.nextInt();

        for (int j = 1; j <=row ; j++) {

            for (int k = 1; k<=j ; k++) {
                System.out.print(k+" ");
            }
            System.out.println();
        }












    }//main
}//class
