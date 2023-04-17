package Javaders.Javaders.day03methodcreationscanner;



public class C03_MethodCreation {
    public static void main(String[] args) {
    //Dikdörtgenin alanını hesaplatan bir method oluşturunuz.
        dikdortgenAlani(10,20);

        //karenin alanını hesaplatan methodu yazınız.
        System.out.println(karenAlani(6)+2);

    }//main

    private static int karenAlani(int x) {
        return x*x;
    }

    private static void dikdortgenAlani(int a, int b) {
        System.out.println(a*b);

    }


}//class
