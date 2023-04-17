package Javaders.Javaders.day11nestedifternaryswitch;

import java.util.Scanner;

public class Ternary02 {
    public static void main(String[] args) {
        /*
        Kullanicidan bir sayi aliniz, o sayi pozitif ise ekrana "Pozitif" yazdirin, degilse ekrana "Pozitif degil" yazdirin
     */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer");
        int num = input.nextInt();

        String result = num>0 ? "Pozitif" : "Pozitif Degil";
        System.out.println(result);







    }//main
}//class
