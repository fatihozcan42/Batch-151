package Javaders.Javaders.day07stringmanipulations;

import java.util.Scanner;

public class C02_StringManpulaions {
    public static void main(String[] args) {

       /* Asagıdaki kurallara göre kullanıcının password'u kontrol ediniz.
        i) 8 karakterli olsun
        ii) space içermesin
        iii) En az bir büyük karakter içersin
        iv) En az bir küçük harf olsun
        v) En az bir sombol olsun
        vi) en az bir rakam olsun
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen passwordunuzu giriniz:\n"+
         "       i) 8 karakterli olsun\n "+
         "       ii) space içermesin\n"+
         "       iii) En az bir büyük karakter içersin\n"+
         "       iv) En az bir küçük harf olsun\n"+
         "       v) En az bir sombol olsun\n"+
         "       vi) en az bir rakam olsun\n" );

        String pwd = input.nextLine();

        //i) 8 karakterli olsun

        boolean krktrSys = pwd.length() > 7;

        // boolean krktrSys2=pwd.length()>=8; makbul olani >7 dir.
        // Cunku javaya daha az is yaptirilir



        //ii) Pasword space içermesin

        boolean spaceOlmamali = ! pwd.contains(" ");

        // iii) en az 1 tane buyuk harf içersin.

        boolean bykHrfOlmali = pwd.replaceAll("[^A-Z]","").length()>0;

        //Methodlari ayni satirda yan yana yazabiliriz.Buna method chain(method zinciri) denir.

        // En az bir kücük farf olmalı

        boolean kckHrfOlmali = pwd.replaceAll("[^a-z]","").length()>0;

        // v) En az bir sombol olsun

       boolean sembolOlmali = pwd.replaceAll("[a-zA-z0-9]","").length()>0;

        //  en az bir rakam olsun

        boolean rakamOlmali = pwd.replaceAll("[^0-9]","").length()>0;

        System.out.println("Pasword Geçerli mi ?:"+(krktrSys && spaceOlmamali && bykHrfOlmali && kckHrfOlmali
        && sembolOlmali && rakamOlmali ));


    }//main
}//class
