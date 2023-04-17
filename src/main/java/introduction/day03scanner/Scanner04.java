package introduction.day03scanner;

import java.util.Scanner;

public class Scanner04 {

    public static void main(String[] args) {

        //Kullanıcıdan iki sayı alıp dört işilem yapan ve sonuclarını yazdıran kodu yazın.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz...");
        double firstNumber = input.nextDouble();
        double secondNumber = input.nextDouble();
        System.out.println(firstNumber + secondNumber);
        System.out.println(firstNumber - secondNumber);
        System.out.println(firstNumber * secondNumber);
        System.out.println(firstNumber / secondNumber);



    }

}








