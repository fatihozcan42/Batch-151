package Javaders.Javaders.day18constructorsstatickeyword;

public class Car {

    /*
        1) Constructor nasil olusturulur.
               Acces modifier + Class ismi + () + {}

        2) method ile constructor aarasindaki fark nedir?

        i) methodlarda return type olur, Constructor'da olmaz.
        ii) methodlar yaptiklari ise gore isimlendirilirler, Constructor ise her zaman class isimleriyle isimlendirilirler.
        iii) method'lar bir aksiyon yapmak icin olusturulur. "Constructor" object olusturmak icindir.
        iv) method isimleri kucuk harfle baslar, Constructor ise Class ismi ile ayni oldugu icin buyuk harfle baslar.
        3) parametreli Constructor'lar olusturularak, ayni class'tan farkli ozelliklere sahip object'ler olusturabiliriz.
     */


    String make = "Honda";
    String model = "Accord";
    int year = 2021;
    int price = 18000;

    //Default Constructor
    //Default Constructor'lar "parametre" kullanmazlar
    //Default Constructor'larin body'si bostur
    //Java kiskanc'dir. Siz "default constructor"i elle yazdiginizda
    //Java Object Class icindeki default constructor'i kullandirtmaz.
    public Car(){

    }

    //Custom Constructor

    public Car(String make, String model, int year, int price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    //Custom Constructor
    public Car(String make) {
        this.make = make;
    }
    //Custom Constructor
    public Car(String make, int price) {
        this.make = make;
        this.price = price;
    }


}//Class