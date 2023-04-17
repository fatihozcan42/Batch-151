package Javaders.Javaders.day23inheritance;

public class Animal {

    /*
    1) eat() methodu gibi bircok classín kullamasi gereken methodlari her class'a ayri ayri yazarsak ;
        - Tekrar yapmis oluruz, tekrar, ideal code'ta olmamali.
        - ayni methodú tekrar tekrar yazmak zaman kaybidir.
        - tekrar tekrar yazilan methodún tamiri cok zaman alir.
        - tekrar tekrar yazilan methodún gelistirilmasi cok zaman alir.
        - Tekrar tekrar yazmak "atomic yapiya" terstir.
    2) Private Class memberler child class'lar tarafindan kullanilamazlar.
        public class memeberler child class'lar taarafindan kullanilabilrler.
        default class memberler ayni PACKAGE te child class'lar tarafindan kullnilirlar.
        Protected Class memberlar farkli package'ta da olsalar child class tarafindan kullanilirlar.
    3) Java'da bir classín sadece bir tane parent'i olabilir.
        Coklu parent'i "Multiple Inheritance" denir, tekli parent'e "Single Inheritance" denir.
        Java "Multiple Inheritance" i desteklemez. ama java "Single Inheritance" kullamir.
    4) Apartman seklindeki inhertance yapisina "Multilevel Inheritance" denir
        Java "Multilevel Inheritance"i destekler
     */

    public void eat() {
        System.out.println("Animals eat...");

    }

    public void drink() {
        System.out.println("Animals drink...");
    }




}//class
