package Javaders.Javaders.day03methodcreationscanner;

import java.util.Scanner;

public class School {
    public static int tarih;
    public static String okulIsmi;
    public static void main(String[] args) {
        //bir okul ismi donduren method olusturun
        okulIsmiYazdir();
        //o okulun o yil aktif olup olmadigini dondurun

        //hangi yil oldugunu dondurun
        tarihGir();
        isActiveMi();


    }
    public static void okulIsmiYazdir(){
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir okul ismi giriniz");
        okulIsmi=scan.nextLine();
        System.out.println(okulIsmi);

    }public static void isActiveMi(){
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen "+okulIsmi+tarih+" tarihinde aktif ise true giriniz degil ise false giriniz");
        boolean isActive=scan.nextBoolean();
        System.out.println(isActive);


    }public static void tarihGir(){
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen o tarihi giriniz");
        tarih=scan.nextInt();
        System.out.println(tarih);
    }



}