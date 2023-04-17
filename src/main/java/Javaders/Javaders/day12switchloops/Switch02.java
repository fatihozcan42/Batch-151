package Javaders.Javaders.day12switchloops;

 import java.util.Scanner;
public class Switch02 {
    public static void main(String[] args) {


        //Example 1: Kullanicidan iki sayi ve yapilacak islemi alan ve +,-,*,/,% islemlerini yapan kodu yaziniz.
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz..");
        double a = input.nextDouble();
        double b = input.nextDouble();

        System.out.println("Yapilacak islemi giriniz. +,-,*,/,%  den birini seciniz..");
        char opr = input.next().charAt(0);

        switch (opr){
            case '+':
                System.out.println(a+" + "+b+ " = "+ (a+b));
                break;
            case '-':
                System.out.println(a+" - "+b+ " = "+ (a-b));
                break;
            case '*':
                System.out.println(a+" * "+b+ " = "+ (a*b));
                break;
            case '/':
                System.out.println(a+" / "+b+ " = "+ (a / b));
                break;
            case '%':
                System.out.println(a+" % "+b+ " = "+ (a*b/100));
                break;
            default:
                System.out.println("Bu islem tanimlanmamistir");

        }

    }//main
}//class