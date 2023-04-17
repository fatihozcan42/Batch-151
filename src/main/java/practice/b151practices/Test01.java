package practice.b151practices;

import java.util.*;

public class Test01 {
    public static void main(String[] args) {
        //Kullanıcıdan aldığınız  Adı, Soyadı ve kredi kartı numaralarını aşağıdaki gibi özel forma dönüştürün
        //Kredi kartı numarasını kontrol edin, yoksa 16 haneden küçük olursa   "Geçersiz kredi kartı numarası" yazdırın.
        //      input : John White 1234234534561478
        //output: Ad : J*** Soyad :W**** kartNo:***********1478 (Adın baş harfleri ve soyadı büyük olmalıdır)

      /*  Scanner input = new Scanner(System.in);
        System.out.println("Adiniz-soyadiniz");
        String str = input.nextLine();
        System.out.println("Kart no giriniz");
        String kartNo = input.next();
        String kartno1="";
        String kartno2="";


        if (kartNo.length()<16){
            System.out.println("Gecersiz kredi karti");
        }else {

            kartno2 = kartno2.substring(12,16);

            for (int i = 0; i < kartNo.length()-4; i++) {
                 kartno1="*";
            }
            System.out.println(kartno1+kartno2);



               Scanner input = new Scanner(System.in);

        System.out.print("Adınızı girin: ");
        String ad = input.nextLine().trim();
        ad = ad.substring(0, 1).toUpperCase() + ad.substring(1);

        System.out.print("Soyadınızı girin: ");
        String soyad = input.nextLine().trim();
        soyad = soyad.substring(0, 1).toUpperCase() + soyad.substring(1);

        System.out.print("Kredi kartı numaranızı girin: ");
        String kartNo = input.nextLine().trim();

        if (kartNo.length() == 16) {
            String adYildiz = ad.substring(0, 1) + ad.substring(1).replaceAll("\\S", "*");
            String soyadYildiz = soyad.substring(0, 1) + soyad.substring(1).replaceAll("\\S", "*");
            String sonDortHane = kartNo.substring(12);
            String kartNoYildiz = kartNo.substring(0,12).replaceAll("\\S","*") + sonDortHane;

            System.out.println("Ad: " + adYildiz);
            System.out.println("Soyad: " + soyadYildiz);
            System.out.println("Kredi kartı numarası: " + kartNoYildiz);
        } else {
            System.out.println("Hata: Geçersiz kredi kartı numarası");
        }

        }
//
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Adınızı girin: ");
//        String ad = input.nextLine().trim();
//        ad = ad.substring(0, 1).toUpperCase() + ad.substring(1);
//
//        System.out.print("Soyadınızı girin: ");
//        String soyad = input.nextLine().trim();
//        soyad = soyad.substring(0, 1).toUpperCase() + soyad.substring(1);
//
//        System.out.print("Kredi kartı numaranızı girin: ");
//        String kartNo = input.nextLine().trim();
//
//        if (kartNo.length() == 16) {
//            String adYildiz = ad.substring(0, 1) + ad.substring(1).replaceAll("\\S", "*");
//            String soyadYildiz = soyad.substring(0, 1) + soyad.substring(1).replaceAll("\\S", "*");
//            String sonDortHane = kartNo.substring(12);
//            String kartNoYildiz = kartNo.substring(0, 12).replaceAll("\\S", "*") + sonDortHane;
//
//            System.out.println("Ad: " + adYildiz);
//            System.out.println("Soyad: " + soyadYildiz);
//            System.out.println("Kredi kartı numarası: " + kartNoYildiz);
//        } else {
//            System.out.println("Hata: Geçersiz kredi kartı numarası");
//        }

 Soru-12: Kullanicidan email girmesini isteyin
        @ isareti icermiyorsa "gecerli bir email girin" yazdirin
        @ isaretinden sonra sadece "gmail.com" yaziyorsa "email onaylandi" yazdirin
        @ isaretinden sonra "gmail.com" disinda birsey yaziyorsa "Lutfen gmail hesabinizi girin" yazdirin
        ORNEK:
        INPUT : techproed.com OUTPUT : "gecerli bir email girin "
        INPUT : techproed@gmail.com OUTPUT :  "email onaylandi "
        INPUT : techproed@hotmail.com OUTPUT : "Lutfen gmail hesabinizi girin"*/



//    *
//   ***
//  *****
// *******
//*********
// *******
//  *****
//   ***
//    *

        for (int i = 0; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // aşağıdaki kısmı çiz
        for (int i = 5 - 1; i >= 1; i--) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }




    }//main



}//CLASS
