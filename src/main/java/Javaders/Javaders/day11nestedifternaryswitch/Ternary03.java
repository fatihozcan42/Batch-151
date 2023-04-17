package Javaders.Javaders.day11nestedifternaryswitch;

import java.util.Scanner;

public class Ternary03 {
    public static void main(String[] args) {

    /*
        Verilen yilin "Artik Yil"(Leap Year) olup olmadigini kontrol eden kodu yaziniz.
        1)Yil 100'e bolunurse 400'e de bolunmelidir. 1600==>Leap    1800==>Leap degil
        2)Yil 100'e bolunmuyorsa 4'e bolunmelidir. 2004==>Leap    2005==>Leap degil
     */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a year...");
        int year = input.nextInt();

        //1.Way: Nested Ternary
        String a = year%100==0 ? year%400==0 ? "leap" : "Not leap" : year%4==0 ? "leap" : "not leap";
        System.out.println(a);

        //2.Way: use if else

        if (year%100==0){
            if (year%400==0){
                System.out.println("Leap");
            }else {
                System.out.println("Not leap");
            }

        } else{
            if (year%4==0){
                System.out.println("Leap");
            }else {
                System.out.println("Not leap");
            }
        }


    }//main
}//class
