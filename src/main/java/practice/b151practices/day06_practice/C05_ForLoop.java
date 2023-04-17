package practice.b151practices.day06_practice;

import java.util.Scanner;

public class C05_ForLoop {
    public static void main(String[] args) {
         /*
         Kullanıcıdan sisteme 5 adet sayi girmesini isteyiniz
         Bu sayilardan 5 ile 10 arasındakiler haric, digerlerinin toplamını bulunuz
      */
        Scanner scan =new Scanner(System.in);

        int toplam = 0;

        for (int i = 0; i <5 ; i++) { // 0'dan 5'e kadar donguye aldık ve kullanıcıdan 5 adet sayi girmesini istedik

            System.out.println("Bir Sayi Giriniz");
            int sayi = scan.nextInt();

            if(sayi>=5 && sayi<=10){ // 5 ile 10 arasında olan sayıları isleme almadık
                System.out.println("Girdiginiz Sayi 5 ile 10 Arsinda Oldugundan Isleme Alinmayacaktir");
            }else{
                toplam = toplam + sayi; // degilse sayıları topladık
            }


        }

        System.out.println(toplam);

/*


        for (int i = 0; i < 5; i++) {
            System.out.println("Lutfen bir sayi giriniz");
            int sayi = input.nextInt();

            if (sayi >= 5 && sayi <= 10) ;{
                System.out.println("5 ile 10 arasindaki sayilaar isleme alinmayacaktir.");
            }

        }
        System.out.println("Girdiginiz sayilarin toplami = "+ toplam);
*/
    }//main
}//class
