package practice.b151practices.day11_practice;


public class C01_Instance {
    int sayi;
    String isim;
    boolean ogrenciMi;


    public static void main(String[] args) {
        /*
    sayi, isim, ogrenciMi seklinde dort tane instance variable olusturalım.
    Bu instance variable'lerin default degerlerini main icerisinde yazdıralım
        */
        C01_Instance obj1 = new C01_Instance();
        System.out.println(obj1.sayi);//o
        System.out.println(obj1.isim);//null
        System.out.println(obj1.ogrenciMi);//false


        C01_Instance obj2 = new C01_Instance();

        obj1.isim="Hasan";
        obj2.isim="Huseyin";
        System.out.println(obj1.isim);
        System.out.println(obj2.isim);


        //Instance'lar variable'lar objeye baglidir.
        //Hangi obje uzerinden degisiklik yapildiysa yapilan degisiklik sadece o objeyi baglar.



    }//main
}//Class
