package Javaders.Javaders.day11nestedifternaryswitch;

import java.util.Scanner;

public class NestedIf01 {
    public static void main(String[] args) {
        /*
        1)"If" icinde "if" kullanirsaniz, "nested if" olusturmussunuz demektir.
        2)"nested if" Java'yi yavaslatir bu yuzden mecbur kalmadikca kullanmayiz.
        3)"nested if" gibi Java'yi yavaslatan kodlar "Time Consuming" olarak adlandirilir.
         */



        /*
       Kullanicidan 0'dan kucuk 120'den buyuk deger giremiyecek sekilde datalari aldiktan sonra
       Eger calisan kadinsa 60 yasindan buyukse "Emekli Olabilir "yazdirin
       Eger calisan erkek ise 65 yasindan buyukse "Emekli Olabilir" yazdiran.

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age...");
        int age = input.nextInt();

        System.out.println("Please enter your gender ... ");
        String gender = input.next();

        if (age<0 || age>120 ){
            System.out.println("Negative ages or ages grater than are invalid");
        }

        else if (gender.equalsIgnoreCase("male")) {//equalsIgnoreCase() icin male = Male = MALE = mAlE dir
                if (age > 65) {
                    System.out.println("Can be retired");
                } else {
                    System.out.println("Should Work");
                }
            }
        else if (gender.equalsIgnoreCase("female")) {
                if (age > 60) {
                    System.out.println("Can be retired");
                } else {
                    System.out.println("Should Work");
                }

            }
        else {
                System.out.println("Undefined gender");
            }


    }//main
}//class
