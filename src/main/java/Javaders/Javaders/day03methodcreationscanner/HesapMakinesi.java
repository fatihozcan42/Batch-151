package Javaders.Javaders.day03methodcreationscanner;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        System.out.println("Hesap Makinesine Hosgeldiniz");
        /*
        toplama
        cıkarma
        bolme
        carpma
        */
        // System.out.println(toplama());
        // System.out.println(cikarma());
        // System.out.println(bolme());
        // carpma();
        tumIslemler();
        //  kapanisMesaji();

    }public static double toplama() {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen toplamak istediginiz iki sayiyi giriniz");
        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();
        //System.out.println(sayi1 + sayi2);
        return sayi1 + sayi2;
    }
    public static double cikarma(){
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen cikarma istediginiz iki sayiyi giriniz");
        double sayi1= scan.nextDouble();
        double sayi2=scan.nextDouble();
        //System.out.println(sayi1-sayi2);
        return sayi1-sayi2;

    }public static double bolme(){
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bolmek istediginiz iki sayiyi giriniz");
        double sayi1= scan.nextDouble();
        double sayi2=scan.nextDouble();
        //System.out.println(sayi1/sayi2);
        return sayi1/sayi2;

    }public static double carpma(){
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen carpmak istediginiz iki sayiyi giriniz");
        double sayi1= scan.nextDouble();
        double sayi2=scan.nextDouble();
        System.out.println(sayi1*sayi2);
        return sayi1*sayi2;

    }public static void tumIslemler(){
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen tum islemleri yapmak istediginiz 2 sayiyi giriniz");
        double sayi1=scan.nextDouble();
        double sayi2=scan.nextDouble();
        System.out.println("iki sayinin carpimi : "+(sayi1*sayi2));
        System.out.println("iki sayinin bolumu : "+(sayi1/sayi2));
        System.out.println("iki sayinin farki : "+(sayi1-sayi2));
        System.out.println("iki sayinin toplami : "+(sayi1+sayi2));

    }public static void kapanisMesaji(){
        System.out.println("işleminiz tamamlanmistir tekrar bekleriz");

    }




}