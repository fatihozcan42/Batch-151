package practice.b151practices.day10practice;

public class C03_Instance {

    int sayi ;           // 0
    String bransIsmi="Java";
    boolean isOkul ;     //false

    public static void main(String[] args) {

            /*
    sayi, bransIsmi, okuldaMi seklinde uc tane instance variable olusturalım.
    Bu instance variable'leri main icerisinde yazdıralım
        */
        // Instance variable'lara, satatic method'tan ulasabilmek icin obje olusturmamiz gerekir.

        C03_Instance obj1 = new C03_Instance();
        System.out.println(obj1.sayi);
        System.out.println(obj1.bransIsmi);
        System.out.println(obj1.isOkul);

        //Instance variable'lar objeye baglidir,
        //hangi obje uzerinden variable'da degisiklik yapildiysa yapilan bu degisiklik sadece o objeyi baglar.

        obj1.sayi= 10;

        System.out.println(obj1.sayi);


    }//main
}//Class
