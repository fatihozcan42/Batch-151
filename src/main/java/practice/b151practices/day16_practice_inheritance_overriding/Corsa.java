package practice.b151practices.day16_practice_inheritance_overriding;

public class Corsa extends Opel {

    protected String hiz = "Corsa max 200 km hiz yapar";
    protected String yakit = "Corsa benzinli veya elektriklidir";
    protected String model = "Corsa";

    protected void motor() {
        System.out.println("CORSA ARABALAR CEVRECİ MOTOR KULLANIR");
    }

    protected void yakitTuketimi() {
        System.out.println("CORSA 5.6 LT YAKİT TUKETİR");
    }

    protected void vitesSayisi() {
        System.out.println("CORSA 5 VİTESLİDİR");
    }

    public static void main(String[] args) {

         /*
        inheritance variable;
         Olusturdugumuz objenin data turu hangi class'a aitse oradan baslayarak bakar.
         Yoksa parent'ına gider.
         ilk buldugu yerden alır
         */
        /*
        inheritance method;
        Olusturdugumuz objenin data turu hangi class'a aitse oradan baslayarak bakar.
        Yoksa parent'ına gider.
        Buldugu yerden hemen almaz. Override edilmismi diye kontrol eder.
        (Constructor class'ına kadar aynı isimde method var mı diye kontrol eder)
        Override edileni alır.
*/
        Corsa arb1 = new Corsa();
        System.out.println(arb1.hareket);//Arabalar teker ile hareket eder
        System.out.println(arb1.hiz);//"Corsa max 200 km hiz yapar";
        System.out.println(arb1.yakit);//"Corsa benzinli veya elektriklidir";
        System.out.println(arb1.marka);//opel
        System.out.println(arb1.sirketmerkezi);//Almanya
        System.out.println(arb1.model);//corsa

        arb1.motor();//"CORSA ARABALAR CEVRECİ MOTOR KULLANIR"

        Opel arb2 = new Corsa();
        System.out.println(arb2.hareket);//Arabalar teker ile hareket eder
        System.out.println(arb2.hiz);//"Opel arabalar max 220 km hiz yapar" Opel class'indan getirdi.
        System.out.println(arb2.yakit);//Arabalar farkli yakitlar kullanabilir"==>Araba class'indan getirdi.
        System.out.println(arb2.marka);//Opel
        System.out.println(arb2.sirketmerkezi);//almanya
        //System.out.println(arb2.model);//CTE

        arb2.motor();//CORSA ARABALAR CEVRECİ MOTOR KULLANIR ==> Corsa class'indaki motor() methodu calisti.
                    // once override edilmis olan method calisir.instance variable'den farkli olarak new Corsa()
                    // constructor calisti. override edileni alir.

        arb2.garanti();         //"OPEL ARABLAR IKI YIL GARANTILIDIR. ==> override edilmedigi icin Opel Class'indan getirdi
        arb2.yakitTuketimi();   //"CORSA 5.6 LT YAKİT TUKETİR" ==> override edildigi icin Corsa Class'indan getirdi.
       //arb2.vitesSayisi();CTE

        Araba arb3 = new Corsa();
        System.out.println(arb3.hareket);//Arabalar teker ile hareket eder
        System.out.println(arb3.hiz);//Arabalar motor gucune gore hiz yapar
        System.out.println(arb3.yakit);//Arabalar farkli yakitlar kullanabilir
        System.out.println(arb3.marka);//Arabalar uretildikleri markaya sahiptir
        //System.out.println(arb3.sirketMerkezi); CTE
        //System.out.println(arb3.model); CTE

        arb3.yakitTuketimi();//CORSA 5.6 LT YAKİT TUKETİR
        arb3.motor();       //CORSA ARABALAR CEVRECİ MOTOR KULLANIR

        //arb3.garanti(); CTE
        //arb3.vitesSayisi(); CTE






    }//main


}//CLASS
