package Javaders.Javaders.day06typecastingstringmanipulation;

public class C01_StringManipulation {

    public static void main(String[] args) {

        String a = "Benim Tek Rakibim Dunku Ben.";

        // ******** toUpperCase() *********\\
        String aUpper = a.toUpperCase();
        System.out.println("aUpper = " + aUpper);

        // ******** toLowerCase() *********\\
        String aLower = a.toLowerCase();
        System.out.println("aLower = " + aLower);

        // ******** charAt() *********\\
        System.out.println("ilk karakter= " + a.charAt(0));
        System.out.println("onbirinci karakter= " + a.charAt(10)); //Tek ==>m

        //a String'indeki baştan ikinci ve sondan ikinci karakteri alınız ve yanyana yazdırınız.
        char firstChar = a.charAt(1);
        char lastSecondChar = a.charAt(20);
        System.out.println(" " + firstChar + lastSecondChar);// eğer String koymazsak başa Ascii değerini alır.

        // *************** lenght() ***********

        //a String'inde bulunan karakter sayyısını bulunuz.

        System.out.println("Karakter uzunluğu= " + a.length());// 22

        //**************** substring() ******
        //a karakterindeki ilk dört karakteri alınız.

        System.out.println("a.substring(1) = " + a.substring(0, 4));//0 index dahil, 4. index hariç

        // a stringîndeki 4. index dahil 7.indez hariç yazdırınız.
        System.out.println("a.substring(4,7) = " + a.substring(4, 7));

        // "Benim Tek Rakibim Dunku Ben.

        // A Stringindeki 'Rakib' kelimesini alınız.
        System.out.println("a.substring(10,15) = " + a.substring(10, 15));

        System.out.println("a.substring(10) = " + a.substring(10));

        //*****  contains()  *********
        // a string'inde 'bim' kelimesinin olup olmadığını kontrol ediniz.

        System.out.println("bimVarMı? ="+ a.contains("bim"));

        //******* startsWith *********
        // a String'nin "T" harfiyle başlayıp başlamadığını kontrol ediniz.

        System.out.println("= " + a.startsWith("T")); //False

        System.out.println(a.startsWith("Tek", 6));// ilk 6 karakteri at sonrası
                                                                // 'Tek' kelimesiyle başlıyor mu? True
                                                                // prefix = başlangıc, toffset = at gitsin
        // universite numaraları yıl+fakulteKodu+girisSirasi bir okulda öğrenci umran 'nın
        // hukuk fakültesinde okuyup okumadığını göseren kodu yazınız.

        /*
        sınıf öğretmenlği 22 hukuk 22 bilgisayar 44 eczacılık 55 maliye 66
         */

        String str = "20105501";
        System.out.println(str.startsWith("33", 4));

        //************ isEmpty ******
        // a String değereinde
        // a.isEmpty()




    }//main

}//Class
