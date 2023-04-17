package practice.b151practices.day14_practice;

public class C01_Varargs {
    public static void main(String[] args) {

        /*
        Parametre olarak bir int ve istediginiz kadar String alan bir method olusturunuz.
        en uzun string'in harf sayisi ile int parametre degerini carpip sonucu yazdiriniz.
         */

        int sayi = 5;
        String str1 = "Zulal";
        String str2 = "Zeynep";
        String str3 = "Ali";

        carpim(sayi, str1, str2, str3);

    }//main

    private static void carpim(int sayi, String... str) {
        String enUzunKelime = "";

        for (String w : str) {
            if (w.length() > enUzunKelime.length()) {
                enUzunKelime = w;
            }//if

        }//for each
        System.out.println(enUzunKelime.length() * sayi);
    }//carpim()


}//class
