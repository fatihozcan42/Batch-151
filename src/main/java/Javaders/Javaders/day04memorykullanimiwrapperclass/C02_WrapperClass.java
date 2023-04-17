package Javaders.Javaders.day04memorykullanimiwrapperclass;

public class C02_WrapperClass {

    /*
    Javasonucta bir urunsur.
    Developerlar sadece data barındıran primitive data typelarının non-rimitive data type'ları
    gibi method da barındırmasını istemişlerdir.
    Bunun üzerine java primitive data type'larına method eklereyerek özel bir Class oluşturmuştur.
    buna da Wrapper Class denir.


        Primitive               Non-Primitive
        byte                        Byte
        short                       Short
        int                         Integer
        long                        Long
        float                       Float
        double                      Double
        boolean                     Boolean
        char                        Character

     */

    public static void main(String[] args) {

        byte primitiveByte = 12;
        Byte wrapper =12;


        // Byte en büyük ve en küçük değerini yazdırınız.

        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);

        // int data type max ve byte data type nin min degerinin toplamını hesaplayan methotu yazınız.

        int intMax = Integer.MAX_VALUE;
        byte byteMin = Byte.MIN_VALUE;

        System.out.println(intMax+byteMin);

        //  Primitive Data type'larını Wrapper data type'larına nasıl çeviririz.

        float primitiveFloat = 12.33F;
        Float wrapperFloat   = primitiveFloat;// buna otoboxing denir. Java bunu otomatik olarak yapar.

        // Wrappar Clasları Primitive Data type'larına nasıl çeviriz

         Character wrapperChar = 'A';
         char primitiveChar = wrapperChar;// unboxing bbüyük kutudan küçük kutuyu çıkarma işlemine unboxing denir.


        // Verilen iki String data'nın toplamini veren kodu yazınız.
        String str1 = "12345";
        String str2 = "678";

        System.out.println(str1+str2);//12345678
        System.out.println(Integer.valueOf(str1)+Integer.valueOf(str2));//valueof() method'u String bir datayı Integer donuşturu.

        /*
        Javada "+" sembolu iki int için matematik gibi toplama işlemi yapar.
        iki String data arasında ya da bir String bir int arasında ise yanyana yazdırır.
        Buna "Concatination" denir.
        Java matematik bilir işlem önceliğine göre çalisir.
        i) üslü sayılar
        ii)paranteez içi
        İİ) çarpma/bölme
        iii)toplama/çıkarma
         */
        String harf = "A";
        int sayi = 7;

        // harf+sayi ==> A7
        /*
        8+3"K" ==> 11K
        "K"+3*5/2==>
         */

        String  a = "K";
        int b =3, c=5, d=2;
        System.out.println(a+b*c/d);//K7

    }//main

}//Class
