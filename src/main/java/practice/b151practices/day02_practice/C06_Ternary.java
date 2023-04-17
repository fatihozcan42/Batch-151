package practice.b151practices.day02_practice;

import java.util.Scanner;

public class C06_Ternary {
    public static void main(String[] args) {
        /*
        Kullanıcıdan ayri ayri iki tamsayı sisteme girmesini isteyin.
        Ternary kullanarak;
        Sayılar bir birine esit ise konsolda "Sayılar Birbirine Esit" yazdırın
        Sayılar birbirine esit degilse, buyuk olan sayısı ekrana yazdırın.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz.");
        int first = input.nextInt();

        System.out.println("Lutfen ikinciyi sayi giriniz");
        int second = input.nextInt();

        System.out.println(first==second ? "Sayılar Birbirine Esit" : first<second ? ("Buyuk sayi: "+ second) : (" Buyuk sayi: " + first));




















    }//main
}//class
