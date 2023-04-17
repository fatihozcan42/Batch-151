package Javaders.Javaders.day34exceptionsNIGHT;

public class E01 {

     /*
        1)"Exception" beklenmedik problem demektir.
        2)"Exception" i halledebilmek icin iki temel yol vardir;
            i)"Exception" a uygun cozumler uretebilirsiniz. Buna "Exception Handling" denir.
            ii)"Exception" olustugunda bunu ilan eder ve geri cekilirisniz. Buna da "Throw Exception" denir.
        3)"Exception" a uygun cozumler uretmede "try-catch" kullanilir.
          "try block" da yapilmasi gereken islemi Java'dan yapmasi istenir.
          Java islemi problemsiz bir sekilde yaparsa "catch block" Java tarafindan okunmaz.
          "try block" da islem yapilirken "Exception" olusursa "catch block" devreye girer ve "catch block" icindeki kodlar calisir.
        4)"try block" da islem yapilirken "Exception" olusursa "try block" icindeki Exception'dan sonraki kodlar calistirilmaz
     */

    public static void main(String[] args) {

        System.out.println(divide1(100, 5));
        System.out.println(divide1(6, 0));

        System.out.println(divide2(100, 5));
        System.out.println(divide2(6, 0));


    }//main

    // 1.yol : exception'i handle etmede ilk yol;
    public static int divide1(int a, int b) {
        if (b == 0) {
            return 0;
        } else {
            return a / b;
        }
    }

    // ikinci yol :exceptions handle etmede mukammel yol
    public static int divide2(int a, int b) {
        int result = 0;
        try {
            result = a / b;
            System.out.println("I am here");
        } catch (ArithmeticException e) {
            System.out.println("Do divde any number by zero");
        }
        return result;
    }

}//Class
