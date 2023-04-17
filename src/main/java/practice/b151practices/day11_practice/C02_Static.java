package practice.b151practices.day11_practice;

public class C02_Static {

    static String okulIsmi="Yildiz Koleji";
    static int okulNo;
    static boolean okulAcikMi;


    public static void main(String[] args) {
        // Static Variable'lara class icerisindeki tum methodlardan direkt ulasabiliriz.
        //Static Variable'lara Farkli class'lardan ulasmak icin ise class ismiyle cagiririz.
        // Static Variable'larin degeri degistirilirse her yerde degisir.

        /*
    okulIsmi, okulNo, okulAcikMi seklinde uc tane static variable olusturalım.
    Bu static variable'leri main icerisinde yazdıralım
*/

        System.out.println(okulIsmi);// Yildiz Koleji
        System.out.println(okulNo);// 0
        System.out.println(okulAcikMi);// false

        okulNo=102;
        System.out.println(okulNo);


        staticMethod();

        System.out.println(okulNo);//200


    }//main

    public static void staticMethod() {
        okulNo=200;
        System.out.println(okulNo);//200
    }


}//class
