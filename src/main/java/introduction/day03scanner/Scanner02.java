package introduction.day03scanner;


import java.util.Scanner;

public class Scanner02 {
    //Kullanicidan ilk ismini ve soy ismini alip ikisini ayni satirda ekrana yazdiriniz.

    public static void main(String[] args) {

        //1.ADIM: Scanner Class'tan object oluştur.

        Scanner input = new Scanner(System.in);
        System.out.println("Adinizi Giriniz...");
        String firstName = input.next();

        System.out.println("Soyadinizi Giriniz...");
        String lastName = input.next();

        System.out.println(firstName+" "+ lastName);

    }

}