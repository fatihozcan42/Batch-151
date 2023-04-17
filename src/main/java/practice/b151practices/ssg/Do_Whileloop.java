package practice.b151practices.ssg;

import java.util.Scanner;

public class Do_Whileloop {

    // Kullanicidan istedigi kadar sayi girmasini isteyin,
    // girilen sayilarin toplami 500 gecerse
    // artik yeter "COk syi girdin, toplam  .... oldu"yazsin

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi = 0;

        int toplam = 0;

        do {
            System.out.println("Toplamak istediginiz sayilari giriniz");
             sayi = input.nextInt();
            toplam+=sayi;

        }while (toplam<500);
        System.out.println("Toplam sayi "+ toplam+"  oldu");


    }


}
