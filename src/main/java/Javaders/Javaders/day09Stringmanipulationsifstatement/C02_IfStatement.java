package Javaders.Javaders.day09Stringmanipulationsifstatement;

public class C02_IfStatement {

    public static void main(String[] args) {


        /*
        if statement () yapisi bazen kodların çalışması belirli kodlara bağlıdır.
        mesela çok çalırsam Java öğreneceğim.Java öğrenme eylemi çok çalışma eylemine bağlanmıştır.
        1. eylem gerçekleşmeden ikinci eylem geçekleşmez.
        if(){}
        () parantez içerisine şart yazilir  eger true döndürürse {} body arasındaki kod çalısır.
        aksi halde if body dışına çıkar class'ta sonraki kodları okumaya devam eder.
         */

        // intrewiew Questions USA QA
        // string str = "abbccdc" tekrarsız karakterleri ekrana yazdırınız.

        String str = "aac";

        char ch = str.charAt(0);
        if (str.indexOf(ch) == str.lastIndexOf(ch)) {

            System.out.println(ch);
        }//if body

        char ch1 = str.charAt(1);
        if (str.indexOf(ch1) == str.lastIndexOf(ch1)) {
            System.out.println(ch1);
        }//if body

        char ch2 = str.charAt(2);
        if (str.indexOf(ch2) == str.lastIndexOf(ch2)) {
            System.out.println(ch2);
        }//if

// EX:Sayi pozitif ise ekrana "pozitif sayi" yazdıran kodu yazınız.

        int num = 20;

        if (num > 0) {
            System.out.println("Pozitif sayi.");
        }

        //sayi -1 ile 10 arasında ise ekrana rakam yazdırın.

        int number = 2;

        if (-1 < number && number < 10) {

            System.out.println("Rakam");

        }

        //EX: sayi üç bas. ise "Sayi üc Basamaklı'dir. yazdırınız.

        int number1 = -234;

        /*
        Math class'ı önemli bir class'tır. icerisinde bircok method barındırır.
        abs() method'u da verilen sayıın mutlak değerini alır.

         */
        number1 = Math.abs(number1);


        if (number1 > 99 && number1 < 1000) {
            System.out.println("Sayi üc Basamaklidir.");
        }


    }//main

}//class
