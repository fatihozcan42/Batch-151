package practice.b151practices.day06_practice;

import java.util.Scanner;

public class C06_While {
    public static void main(String[] args) {
        // Kullanıcından sisteme bir sayi girmesini isteyiniz,
        // kullanıcının girdigi sayıdan baslayarak, 10'un katına gelene kadar ardısık yazdırınız

        // Örn: Sayı: 41
        //      Çıktı: 41, 42, 43, 44, 45, 46, 47, 48, 49
        // While loop ile cozunuz

        Scanner input = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi = input.nextInt();

        while (sayi % 10 != 0) {
            System.out.print(sayi + " ");
            sayi++;
        }


    }//main
}//class