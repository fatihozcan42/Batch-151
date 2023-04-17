package Javaders.Javaders.day04memorykullanimiwrapperclass;

public class C03_MantikOperatorleri {

    public static void main(String[] args) {

        /*
        Java'da işlem yaptıran
        == eşittir
        != eşit değildir.
        < küçüktür.
        > büyüktür.

       = atama operatoru

       1<4<5 ==> java üçlü kıyas yapamaz.

       1<4 && 4<5 ==> java bu şekilde ikili kıyas yapıp Mantık operatorleriyle birleştirme yapar.

       &&  == ve hem operatoru mukemmelliyetçi yapıdaır. True döndürmesi için her iki sartında sağlanması gerekir.
        &    && arasindak' fark/
        (3<5 && 3<9 && 11<2 && 4<8 && 2<3 )
        cift && oparetoru kodun tamamına bakmadan ilk false değerinde false döndürür.
        bu nedenle tek & operatoruna göre daha hızlı çalışır.

        Tek & opertoru tüm kodu tarar tek bir false varsa false döndürür ama bunun için tum kodun bitmesini bekler.
        bu nedenle && operatoruna göre daha yavas çalısır.

        (3<5 && 3<9 && 11<2 & 4<8 & 2<3 )


       çay    ve  Limon

       +    &&     +   >> true döndürür.
       +    &&     -    >> false döndürür.
       -    &&      +   >> false döndürür.
       -    &&      -   >> false döndürür.

            ||
        çay    veya   Limon
       +         ||     +    >> true döndürür.
       +         ||     -    >> true döndürür.
       -         ||     +    >> true döndürür.
       -         ||     -    >> false döndürür.

         */

        System.out.println(5+2==8);// False

        boolean sonuc1 = 5>4 && 7<9 && 6+3 == 9 && 5+2 != 8;
        System.out.println("sonuc1 = " + sonuc1);//true

        boolean sonuc2 = 5>4 && 7>9 && 6+3 == 9 && 5+2 != 7;
        System.out.println("sonuc2 = " + sonuc2);

        int sayi1 = 15 ;
        System.out.println(10<sayi1  ||  sayi1<20 );// true

        int sayi2 = 5;

        System.out.println(sayi2<10  ||   sayi2>20);//true


        short a = 1000;
        System.out.println(a<15000  ||   a>28000  ||   a <-23); // true

        System.out.println(a<=1000 && a==1000&& a<12);// False



    }//main

}//Class
