package introduction.day03scanner;


import java.util.Scanner;

public class ScannerTest01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("kisa kenar giriniz: ");
        double kisaKenar = input.nextDouble();
        System.out.println("Uzun kenarı giriniz: ");
        double uzunKenar = input.nextDouble();
        double alan = kisaKenar*uzunKenar;
        System.out.println("alan = " + alan); //tavsiye edilen.


        System.out.println("Çevre= " +2*(kisaKenar+uzunKenar));

    }

}



