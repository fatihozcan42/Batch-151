package practice.b151practices.day14_practice;

public class C02_Overloading {

    public static void main(String[] args) {
        // ayni class'ta ayni ismda method olusturunuz.
        /* ayni class'ta ayni isimde method olusturmak icin;
             1) parametrelerin data turleri degistiilebilir
             2) parametrelerin sayisi  degistiilebilir
             3) parametrelerin data turleri fakli oldugunda parametrelerin yeri degistiilebilir
         */

        toplama(55,60);
        toplama(3.5,4.5);

        carpma(1,2,3);
        carpma(1,2,3,4);

        cikartma(4.5,2.5f);
        cikartma(6.3f,4.5);

    }//main

    private static void toplama(int a, int b){
        System.out.println("Iki int deger toplandi:"+(a+b));
    }
    private static void toplama(double a, double b){
        System.out.println("Iki double deger toplandi:"+(a+b));
    }
    private static void carpma(int a, int b, int c){
        System.out.println("uc int deger carpildi :"+(a*b*c));
    }
    private static void carpma(int a, int b, int c, int d){
        System.out.println("Dort  int deger carpildi :"+(a*b*c*d));
    }

    private static void cikartma(double a, float b){
        System.out.println("ilki double, ikincisi float cikartma islemi yapildi"+ (a-b));
    }
    private static void cikartma(float a, double b){
        System.out.println("ilki float, ikincisi double cikartma islemi yapildi"+ (a-b));
    }

}//class
