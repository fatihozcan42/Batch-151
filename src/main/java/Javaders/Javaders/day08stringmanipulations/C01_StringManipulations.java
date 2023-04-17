package Javaders.Javaders.day08stringmanipulations;

import java.util.Scanner;

public class C01_StringManipulations {
    public static void main(String[] args) {

       /*
    Kullanicidan email adresini girmesini isteyin,
    Asagidaki kurallara gore kullanicinin
    girdigi email adresini kontrol ediniz.
           i)mail adresi "@gmail" icermeli
           ii)Space characteri mail'de olmamali
           iii)mail adresinde buyuk harf olmamali
           iv)En az bir tane noktalama isareti bulunmali
     */
        Scanner input = new Scanner(System.in);
        System.out.println(" Lutfen mail adresinizi veriniz: ");

        String mail = input.nextLine();

        // mail adresi "@gmail" icermeli

        boolean first = mail.contains("@gmail");
        System.out.println("@gmail = " + first);

        //ii)Space characteri mail'de olmamali

        boolean second = !mail.contains(" ");
        System.out.println("space = " + second);

        //iii)mail adresinde buyuk harf olmamali

        // boolean thirdd = mail.replaceAll("[^A-Z]", " ").length() == 0;
        // System.out.println("upperCaseNot = " + thirdd);

        boolean third = mail.replaceAll("[a-z0-9]","").replaceAll("[\\P{Punct}]","").
                replace(" "," ").length()==0;

        System.out.println("BuyukHarfOlmamalı=" + third);

        //iv)En az bir tane noktalama isareti bulunmali

        boolean fourth = mail.replaceAll("[a-zA-Z0-9]","").replace("[ ]","")
                .length()>0;
        System.out.println("noktalama isaret = " + fourth);

        boolean fourth2 =  mail.replaceAll("[^\\p{Punct}]", "").
               length()>0;
        System.out.println("noktalama isareti olsun = " + fourth2);

        System.out.println(first && second && third && fourth);

        String str = "burada bir gariplik var.?-!@";
        System.out.println(str.replaceAll("[^\\p{Punct}]",""));

    }//main
}//class
