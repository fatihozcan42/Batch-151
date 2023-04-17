package introduction.day03scanner;

import java.util.Scanner;

public class Scanner05 {

    public static void main(String[] args) {
        //kullanıcıdan bir dikdörtgenin iki kenar uzunluğunu alınız ve
        //1 alanını hessaplayınız
        // 2 çevrsini hesapalayınız.
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Kisa Kenar uzunluğu Giriniz");
        double kisaKenar = input.nextDouble();
        System.out.println("Lutfen Uzun Kenar Giriniz");
        double uzunKenar = input.nextDouble();
        System.out.println("Uzun Kenar= " + uzunKenar);
        System.out.println("Kısa Kenar= " + kisaKenar);

        System.out.println("Çevre= " + 2 * (kisaKenar + uzunKenar));

        double alan = (uzunKenar * kisaKenar); // Tavsiye edilen. alan etiketine atatık.
        System.out.println("alan = " + alan);




    }


}
