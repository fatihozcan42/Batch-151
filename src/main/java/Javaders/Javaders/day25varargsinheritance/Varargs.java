package Javaders.Javaders.day25varargsinheritance;

public class Varargs {
    public static void main(String[] args) {
        System.out.println(add(3, 6));
        System.out.println(add(5, 2, 7));

        getInitials("Ali Can", "Veli Han");

    }//main

    // Bir method parantezinde birden fazla varargs kullanilamaz.
    // Birden fazla parametre kullanilacaksa Varargs en sonda olmalidir.
    //
    public static int add(int... a) {
        int sum = 0;
        for (int w : a) {
            sum = sum + w;
        }
        return sum;
    }
//


    // toplama islemi yapan bir method olusturun.
    //Asagidaki gibi farkli mehodlari olusturarak dinamik cozum uretemeyiz.
    // cunku kullanici farkli sayidaki sayilari toplamak isteyebilir,
    // her ihtimal icin bir method olusturmak mumkun degildir.
    // Java farkli sayidaki parametrelerin hepsini kabul eden bir yapi olusturdu.
    //bu yapiya varargs denir.
    //Varargs arka planda Array yapisini kullanilir.
    /*
    public  static int add(int a,int b,int c){
        return a+b+c;
    }
    public  static int add(int a,int b,int c,int d){
        return a+b+c+d;
    }
*/
    // Example :   Verilen isimlerin ilk harflerini console'a yazdiran method'u olusturunuz.
    //            Ali Can ==> AC    Kemal Han ==> KH
    public static void getInitials(String... s) {

        String initials = "";
        for (String w : s) {
            initials = initials + w.charAt(0) + w.split(" ")[1].charAt(0);
            System.out.println(initials);
            initials = "";

        }
    }


}//Class
