package practice.b151practices.day05_loopandarrays;

import java.util.Scanner;

public class C01_cdenOncekia {

/*
      Kullanıcıdan aldığınız 'c' ve 'a' iceren bir String değer içerisindeki
     'c' karakterinden önceki 'a' karakterlerinin sayısını bulan bir kod yazınız.
   */
public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Lutfen c ve a harflerini iceren bir kelime giriniz...");

    String str = input.nextLine().toLowerCase();

   int  counter = 0 ;
    for (int i = 0; i < str.indexOf("c"); i++) {
        if (str.charAt(i)=='a'){
            counter++;
        }
    }
    System.out.println("c'den once "+counter+ " a vardir.");

    // ikinci yol
int sayac = 0;
    if (str.contains("c") && str.contains("a")){

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='a'){
                sayac++;

            }else if (str.charAt(i)=='c'){
                break;
            }
        }
        System.out.println("c'den once a " +sayac+ " adet vardir");

    }else {
        System.out.println("Lutfen a ve c harflerini iceren kelime giriniz");

    }


    }//main

}//Class
