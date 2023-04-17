package introduction.day02datatypesmethodcreation;

import java.sql.SQLOutput;

public class Variables01 {
    /*
    java da temelde iki tip data vardır.
    1)primitive data type :
    char, boolean, byte, short, int, long, float, double

    2)non-primitive data type:
      String
     */

    /*
     NOTE1: Primitive data typeları Java oluşturmuştur. biz oluşturamayız.
     NOTE2: primitive data type ların isimlerinde sadece küçük harf kullanılır.
     NOTE3: primitive datalar data type'larına göre memory'de farklı farklı yer kaplar.
     NOTE4: primitive datalar içlerinde sadece sizin atatdığınız değeri barındırırlar.
     */
    /*
    non-primitive data types:
     1) Örneğin String non-primitive data type örneğidir.
     2) Üretilen her class aynı zamanda bir non-primitive data type dir. Bu yüzden non-primitive data type sınırsız sayıdadır.
     3) Non-primitive data type'ların isimleri büyük harfle başlar.
     4) Non-primitive data type'ların tamamı için Java memory'de aynı miktarda yer ayırır.
     */
    public static void main(String[] args) {
        //Örnek1: Şehir ismi için bir variable oluşturun ve ekrana yazdırın.
        String cityName = "Ankara";
        System.out.println(cityName);

        int a = 13;
        System.out.println("a = " + a);

        /*
        interview sorusu: "primitive" ve "non-primitive" data type'ler arasındaki fark nedir?
        1) "primitive'ler sadece bizim atadığımız değerleri içerir.;
            "non-primitive ler bizim atadığımız değer ve methodlar içerir.
        2) "pirimitive" ler küçük harfle başlar ve non-primitive ler büyük harfle başlar.
        3) "non-primitive ler java ve developer üretebilir ve sınırsız sayıda dır.
            primitive leri java üretmiştir ve 8 adettir.
        4) "primitive ler memory de data type lerine göre yer kaplar.
            "non-primitive" ler için java memory de hep aynı büyüklükte yer ayırır.
         */


    }


}



