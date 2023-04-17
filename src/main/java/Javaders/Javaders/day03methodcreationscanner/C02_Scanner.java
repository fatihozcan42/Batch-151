package Javaders.Javaders.day03methodcreationscanner;

import java.util.Scanner;

public class C02_Scanner {
    public static void main(String[] args) {
        /*
        Kullanıcıdan data almak için Scanner class'ından Scan/input/scanner objesi oluştururuz.
        Bu şekilde kullanıyı yönlendirerek gerekli datatları elde ederiz.

         */
        //1.ADIM: obje oluşturma.

        Scanner input = new Scanner(System.in);


        //2.ADIM: kullanıcıya ne yapacağını söylüyoruz.

        System.out.println("Lutfen cinsiyetinizi giriniz K/E şeklinde");
        //Kullanıcıdan alınan datayapısına/büyüklüğüne uygun bir variable'in içine yerleştirilir.
        char cinsiyet = input.next().charAt(0);

        //4.ADIM: Ekranda görebilmek için ve kullanıcının da verdiği bilgileri teyit edebilmesi için yazdırıyoruz.

        System.out.println("cinsiyet 1= " + cinsiyet);


        // Kullaniciya cinsiyetini, adini, memleketini , yasini,boyunu,
        // ulkesini sevip sevmedigini , maasini soran bir program yaziniz
        Scanner input2 = new Scanner(System.in);//input2 Gonul hanim
        System.out.println("Lutfen cinsiyetinizi girinizi Kadin ise K erkek ise E harfi giriniz");// Gonul hanim yonlendirmeyi gordu
        char gender = input2.next().charAt(0);//gender == cinsiyet


        System.out.println("Lutfen adinizi giriniz");
        String isim = input2.next();

        System.out.println("Lutfen nereli oldugunuzu giriniz");
        String memleket = input2.next();

        System.out.println("Lutfen yasinizi giriniz");
        byte yas = input2.nextByte();

        System.out.println("Lutfen boyunuzu giriniz");
        short boy = input2.nextShort();

        System.out.println("Lutfen yasadiginizi ulkeyi sevip sevmediginizi yaziniz True / False olarak");
        boolean seviyorMu = input2.nextBoolean();

        System.out.println("Lutfen maasinizi giriniz");
        long maas = input2.nextLong();

        System.out.println("***************** Gonul Hanim ***********************");
        System.out.println("gender : " + gender + "\nisim : " + isim + "\nmemleket : "
                + memleket + "\nyas : " + yas + "\nboy : " + boy + "\nseviyorMu : " + seviyorMu + "\nmaas : " + maas);


    }//main


}//Class
