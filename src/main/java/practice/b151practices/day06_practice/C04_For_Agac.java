package practice.b151practices.day06_practice;

import java.util.Scanner;

public class C04_For_Agac {

    public static void main(String[] args) {

        /*
         Agac sekli olusturmak icin, kullanicidan yaprak satir sayisini ve gövde satir sayisini ayrı ayrı
         sisteme girmesini isteyiniz.

         Asagıdaki agac seklini konsala yazdırınız
        ^
        ^^
        ^^^
        ^^^^
        ^^^^^
        |||
        |||
        |||
        |||
        |||
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Yaprak satir sayisini giriniz");
       int yaprakSayisi =  input.nextInt();
        System.out.println("govde satir sayisini giriniz");
        int govdeSayisi = input.nextInt();

        String yaprak = "";

        for (int i = 0; i <yaprakSayisi ; i++) {
           yaprak =  yaprak+"^";
            System.out.println(yaprak);
        }
        for (int i = 0; i < govdeSayisi; i++) {
            System.out.println("|||");
        }


    }//main
}//class
