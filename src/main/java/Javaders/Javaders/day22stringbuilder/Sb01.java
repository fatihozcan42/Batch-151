package Javaders.Javaders.day22stringbuilder;

public class Sb01 {

    /*
    1) "StringBuilder" String ureten bir Class'tir.
    2) "String" Class kullanarak String uretiriz. Java nicin "StringBuilder" Classi da olusturdu.
        "String" Class "immutable" (deistirilemez) String verir. "StringBuilder" Class "mutable" degistirilebilir String uretir.
    3) "Inmutable" olmak demek orjinal degerin korunmasi, degistirelemez olmasi demektir.
        "Mutable"demek ise degistirilebilir olmasi demektir.
    4) Capacity javanin size verdigi data depolama yer sayisidir.
        lenght ise size verilen data depolama yerinin kullanilan kismidir.
    5) Java baslangic olarak size capacity i 16 olarak verir. siz verilen capacity i asarsaniz
        java yeni capacity i varolanin 2 katinin 2 fazlasi olacak sekilde degistirir.

     */


    public static void main(String[] args) {

        String s = "Java";
        s= s+"!";

        String u = "Apex";
        String v = "Apex";
        String y = "C++";

        // "StringBuilder" nasil olusturulur.
        StringBuilder t = new StringBuilder("Python");
        System.out.println(t);

        //"StringBuilder" nasil ekleme yapilir?
        t.append("!").append("...");
        System.out.println(t);//Python!...

        // 2.way

        StringBuilder r = new StringBuilder();
        System.out.println(r);
        System.out.println("r.capacity() = " + r.capacity());//16

        r.append('c');
        System.out.println(r);

        //"Capacity" ve "lenght" arasindaki fark nedir?
        StringBuilder sb1 = new StringBuilder("Money");

        int lenght = sb1.length();
        System.out.println("Lenght = "+ lenght);//Money = 5

        int capacity = sb1.capacity();
        System.out.println("Capacity = "+ capacity);//21 ==> 16+5 ilk basta 16 tane capacity belirler.

        sb1.append("!").append(".................");//17 nokta ekledik
        int c = sb1.capacity();
        System.out.println("capacity = " + c);//21*2+2 = 44

        int ln = sb1.length();
        System.out.println("Lenght = "+ ln);//23

        // Default capacity i degistirebilir miyiz?
        StringBuilder sb2 = new StringBuilder(2);

        System.out.println("sb2 capacity = "+sb2.capacity());//2

        sb2.append("...");
        System.out.println("sb2.capacity() = " + sb2.capacity());//2*2+2 ==>6


    }//main
}//class
