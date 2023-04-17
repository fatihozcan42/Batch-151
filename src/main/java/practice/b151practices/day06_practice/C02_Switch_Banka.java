package practice.b151practices.day06_practice;

import java.util.Scanner;

public class C02_Switch_Banka {

    public static void main(String[] args) {
        /*
     Bir ATM'de aşağıdaki banka işlemlerini yapmak için, kullanicidan 1-4 arası işlem numarasını sisteme girmesini isteyiniz.

     işlem 1: Bakiye Sorgulama
     işlem 2: Para Cekme
     işlem 3: Para Yatırma
     işlem 4: İşlemi Sonlandırın

     Ve bu islemleri Switch case kullanarak yaptırınız.
     */
        Scanner input = new Scanner(System.in);
        System.out.println("1-4 arası işlem numarasını giriniz ==>\n" +
                "     işlem 1: Bakiye Sorgulama\n" +
                "     işlem 2: Para Cekme\n" +
                "     işlem 3: Para Yatırma\n" +
                "     işlem 4: İşlemi Sonlandırın");

        int islem  = input.nextInt();

        int bakiye = 1000;


       switch (islem) {
            case 1:
                System.out.println("Bakiyeniz "+bakiye + " TL" );
                break;
            case 2:
                System.out.println("Cekeceginiz miktari giriniz");
                int cekilecekMiktar = input.nextInt();
                    if (cekilecekMiktar<=bakiye){
                        bakiye-=cekilecekMiktar;
                        System.out.println("Kalan bakiyeniz "+bakiye +" TL");
                    }else{
                        System.out.println(bakiye + "TL'den fazla cekemezsiniz, Yetersiz bakiye");
                    }
                break;
            case 3:
                System.out.println(" Yatiracaginiz miktari giriniz");
                int yatirilanpara = input.nextInt();

                if (yatirilanpara<=2000){
                bakiye+=yatirilanpara;
                System.out.println("toplam bakiyeniz "+ bakiye+" TL");
                } else {
                    System.out.println("2000 TL'den fazla para yatiramazsiniz");
                }
                break;
            case 4:
                System.out.println("TechproBank'i kullandiginiz icin tesekkur ederiz.");
                break;
            default:
                System.out.println("Gecerli bir islem giriniz");
        }

    }//main
}//Class
