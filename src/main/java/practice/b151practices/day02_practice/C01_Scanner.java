package practice.b151practices.day02_practice;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {

        // Kullanıcından adını, ikinci adını ve soyadını arasında bosluk olacak sekilde tek bir String olarak sisteme girmesini isteyiniz.
        // adının ilk karakterini, ikinci adının ilk karakterini ve soyadının ilk karakterini BUYUK harfle yazdırınız.

        Scanner input = new Scanner(System.in);

        System.out.println("Adinizi, ikinci adinizi ve soyadinizi arasinda birer bosluk olacak sekilde giriniz");
        String str = input.nextLine().toUpperCase().trim();

       char adIlkKarakter = str.charAt(0);


        char ikinciAdIlkKarakter = str.charAt(str.indexOf(" ")+1);

        char soyadIlkKarakter = str.charAt(str.lastIndexOf(" ")+1);

        System.out.println(adIlkKarakter+ " " + ikinciAdIlkKarakter+ " "+ soyadIlkKarakter);







    }//main
}//class
