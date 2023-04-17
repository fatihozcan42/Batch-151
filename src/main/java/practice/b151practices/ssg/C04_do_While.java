package practice.b151practices.ssg;

import java.util.Random;
import java.util.Scanner;

public class C04_do_While {
    public static void main(String[] args) {

        /*
        bilgisayara bir ile yuz arasinda bir sayi tutturun
        kullanicidan bu sayiyi tahmin etmesini isteyin
        girilen her tahminde kullaniciya sayiyi buyult veya kucult diye mesaj verin
        sayyi buldugunda kac tahminde buldugunu yaziniz.
        Random rnd = new Random();
        int sayi = rnd.nextInt(100); // bu size yuzden kucuk rastgele bir sayi olusturur.
         */
        Random rnd = new Random();
        int sayi = rnd.nextInt(100);
       int  sayac=0;
        Scanner input = new Scanner(System.in);

        System.out.println("lutfen bir ile yuz arasinda sayi giriniz");

        do {
            int num = input.nextInt();

        if(sayi>num){
            System.out.println("Sayinizi buyultunuz");
            sayac++;
        }else if(sayi<num){
            System.out.println("Sayinizi kucultunuz");
            sayac++;
        } else if (sayi==num) {
            System.out.println(sayac+ ". tahminde buldunuz");
            break;
        }

        }while(true);


    }//main
}//class
