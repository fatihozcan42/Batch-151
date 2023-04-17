package practice.b151practices.day11_practice;

public class C04_Constructor {
    String marka;
    String model;
    int yil;
    String yakit;

    public C04_Constructor(String marka, String model, int yil, String ykt) {
        this.marka =marka;
        this.model =model;
        this.yil=yil; // Constructor degiskeni ile name ayni oldugu icin this.yil yaparak Java'ya bu instance diyoruz.
        yakit = ykt; // ykt name farkli oldugu icin this.yakit kullanmadik

}//main

    // marka, model, yil, yakit  seklinde dort tane instance variable olusturalım.
    // Bu variable'lara parametreli constructor kullanarak, farli bir class'dan deger ataması yapınız ve yazdırınız

}//class
