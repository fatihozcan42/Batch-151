package introduction.day03scanner;

import java.util.Scanner;

public class Scanner03 {

    //Kullanıcaıdan adresini alınız ve ekrana yazdırınız.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen adresinizi giriniz...");
        //next() methodu kullanıcaıdan tek kelimeli String ialmak için kullanılır.
        //nextline method u ise çok kelimelli Stringi almak için kullanılır.

       String address = input.nextLine();

        System.out.println(address);
    }


}
