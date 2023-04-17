package practice.b151practices.ssg;

import java.util.Scanner;

public class C03_Do_While {
    public static void main(String[] args) {
        //Kullanicidan toplamak istedigi sayilari isteyin
        // o basinca sayilarin toplamini yazin.

        Scanner input = new Scanner(System.in);
        int toplam = 0;
        int sayi = 0;

        System.out.println("Toplama merkezinie hosgeldiniz, durdurmak icin 0 basin");

        do {
            System.out.println("toplamak istediginiz sayilari girin");
             sayi = input.nextInt();
            toplam+=sayi;

        }while (sayi!=0);
        System.out.println(toplam);


    }//main
}//Class
