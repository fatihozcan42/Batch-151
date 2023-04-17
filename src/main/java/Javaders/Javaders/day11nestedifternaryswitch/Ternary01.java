package Javaders.Javaders.day11nestedifternaryswitch;

import java.util.Scanner;

public class Ternary01 {
    public static void main(String[] args) {
         /*
        Kullanicidan alinan iki sayidan kucuk olanini ekrana yazdiriniz
     */
        //1.yol use if else
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two integer");
        int first = input.nextInt();
        int second = input.nextInt();

        if (first<second){
            System.out.println(first);
        }else {
            System.out.println(second);
        }

        //2.way use if ternary

        int result = first<second ? first :second;
        System.out.println(result);






    }//main
}//class
