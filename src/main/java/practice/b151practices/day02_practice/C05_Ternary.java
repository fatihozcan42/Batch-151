package practice.b151practices.day02_practice;

import java.util.Scanner;

public class C05_Ternary {
    public static void main(String[] args) {

        /*
            Kullanıcıdan bir tam sayı sisteme girmesini isteyin
            Ternary kullanarak;
            Girilen sayı çift ise konsola "Cift Sayi" yazdirin
            Girilen Sayi tek ise girilen sayıyı 3 artırarak konsola yazdırınız.
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int sayi = input.nextInt();

        Object a = sayi%2==0 ? ("Cift Sayi") : sayi+3;

        System.out.println(a);

        System.out.println(sayi%2==0 ? ("Cift Sayi") : sayi+3);// parantreze gerek yok




























    }//main
}//class
