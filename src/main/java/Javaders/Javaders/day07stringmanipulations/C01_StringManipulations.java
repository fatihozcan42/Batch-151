package Javaders.Javaders.day07stringmanipulations;

public class C01_StringManipulations {

    public static void main(String[] args) {

        String s = "learn Java earn money";


        // EX: s String'inin "Money" ile bitip bitmediğini kontrol edin.

        boolean isEndMoney = s.endsWith("money");
        System.out.println("Money ile Bitiyor mu?= " + isEndMoney);

        // Ex : s String'indeki "money" kelimesini "dolar" kelimesi ile yer degistiriniz.


        String s1 = s.replace("money", "DOLAR");
        System.out.println("s1 = " + s1);

        //EXs String'indeki earn kelimesini win kelimesine çeviriniz.
        System.out.println("s.replace(\"earn\",\"win\") = " + s.replace("earn", "win"));

        // s String'indeki a harflerini * ile değiştiriniz.

        String s2 = s.replace("a", "*");
        System.out.println("s2 = " + s2);

        String s3 = s.replace('a', '*');// char seçmek eğer bir karakter seçiyoarsak hafızada
        // daha az yer kapladığı için tercih edilir.
        System.out.println("s3 = " + s3);

        // s String'İndeki "n" harflerini *** ile değiştiriniz.

        String s4 = s.replace("n", "***");
        System.out.println("s4 = " + s4);

        // S String'indeki tüm e harflerini siliniz.

        String s5 = s.replace("e", "");
        System.out.println("s5 = " + s5);

        String s6 = s.replace('e', ' ');// char data type2 içerisine mutlaka bir karakter yerleştirilmeidir.
        // space bir karakter char'ın içerisine yerlaştirebilr. ancan hiçlik ''
        // java'da char için kullanılamaz.Bu nedenle silme işlemini mutlaka String ile kullanmalıyız.

        System.out.println("s6 = " + s6);

        String t = "Yucel 25 ya$indadir sandık ama 30'mus!.";

        // t String'indeki tüm rakamları * çeviriniz.

        String t1 = t.replaceAll("[0-9]", "*");
        System.out.println("t1 = " + t1);
        /*
        en çok kullanılan regex'ler.
        1) Tüm rakamlar ==>[0-9]
        2) Tüm küçük harfler ==> [a-z]
        3) Tüm büyük harfler ==>[A-Z]
        4) Tüm harfler ==>[a-zA-Z]
        5) Tüm harfler ve tüm rakamlar ==>[a-zA-Z0-9]
        6) Tüm noktalama işaretleri  ==>\\p{Punct}
        7) Tüm sesli harfler ==> [aeiouAEIOU]


        ^ ==> den farklı, haricinde

        1) Tüm rakamlar Haric==>[^0-9]
        2) Tüm küçük harfler Haric ==> [^a-z]
        3) Tüm büyük harfler Haric ==>[^A-Z]
        4) Tüm harfler Haric     ==>[^a-zA-Z]
        5) Tüm harfler ve tüm rakamlar Haric ==>[^a-zA-Z0-9]
        6) Tüm noktalama işaretleri Haric ==>\\p{Punct}
        7) Tüm sesli harfler  Haric    ==> [^aeiouAEIOU]

        */

        // EX: t String'in deki tüm harfleri ve tüm rakamları ünleme çeviriniz.

        String t2 = t.replaceAll("[a-zA-Z0-9]", "!");
        System.out.println("t2 = " + t2);

        // t String'indeki tüm space ler dışındaki karakterleri + ya dönüştürnünz.

        String t3 = t.replaceAll("[^ ]", "+");
        System.out.println("t3 = " + t3);

        //EX: t String'indeki tüm küçük harflar dısındaki karakterleri ? dönüştürnüz.

        String t4 = t.replaceAll("[^a-z]", "?");
        System.out.println("t4 = " + t4);

        // EX: t String'indeki tüm sesli harfler dısındakı karajterleri & ile değiştiriniz.

       String t5 = t.replaceAll("[^aeiouAEIOU]","&");
        System.out.println("t5 = " + t5);


    }//main
}//main
