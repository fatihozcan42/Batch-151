package Javaders.Javaders.day11nestedifternaryswitch;

import java.util.Scanner;

public class Ternary04 {
    public static void main(String[] args) {

        /*
        Kullanicidan aldiginiz sayi cift ise yarisini ekrana yazdiriniz, tek ise "Bu sayi ikiye bolunmez" yazdiriniz
    */

    /*
        1)Ternary'de true ve false durumlari icin size verilen data type'lari farkli ise olusturdugunuz
          container'in data type'ini "Object" yapin
        2)"Object" Java'da bir class'dir.
          "Object" Java'daki butun class'larin "Parent"i dir. Yani babasidir, Hz. Adem gibi.
          "Object" Class'in "Parent"i yoktur.
          Java'da parent'i olmayan tek Class "Object Class" dir.
     */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");

        int number = input.nextInt();

        Object result = number%2==0 ? number/2 : "Bu sayi ikiye bolunmez";
        System.out.println(result);






    }//main
}//class
