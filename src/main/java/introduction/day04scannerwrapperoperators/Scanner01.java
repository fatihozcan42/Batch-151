package introduction.day04scannerwrapperoperators;

import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {
        //kullanıcıdan alacagınız beş basamaklı bir sayının ilk iki ve
        // son iki basamağındaki rakamlarının toplamını yazdıran kodu yazınız.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 5 basamaklı bir sayı giriniz: ");

        int number = input.nextInt();

       // bir sayının son rakamını alabilmek için o sayıyı 10 a böler kalanını alırız.
        //%===>modulus operator solunda bulunan sayının sağında bulunan sayıya bolümünde kalanı veriri.
        //dolasıyla %10 her zaman bize birler basamağındaki sayıyı verir.
        //bir tamsyıyı bir tam sayıya bölerseniz JAVA sonucu kesinlikle bir tam sayı yapar.
        //Java yuvarlama yapmaz, ondalıklı kısmı siler.
        //dolasıyla bir tam sayıyı ona bölersek birler basamığını silmiş oluruz.

        //Son rakamı al.
        int lastDigit = number%10;

        //sayi küçült
        number = number/10;

        // sondan ikinci rakamı al.
        int lastSecondDigit = number%10;

        //sayı küçült.
        number = number/10;

        //sondan üçüncü rakamı al.
       int lastThirdDigit = number%10;

       //sayı küçült
        number = number/10;

        //sondan dördüncü rakamı al.

        int lastFourthDigit = number%10;

        number = number/10;

        //sondan beşinci rakamı al.

        int lastFifthDigit = number%10;
        number = number/10;

        System.out.println(lastDigit+lastSecondDigit+lastFourthDigit+lastFifthDigit);

    }


}
