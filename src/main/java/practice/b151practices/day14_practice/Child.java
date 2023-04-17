package practice.b151practices.day14_practice;

public class Child extends Parent {
    public static void main(String[] args) {

         /*
        static variable'lari ve static methodlari farkli bir class'dan
        cagırabilmek icin class ismi kullanılır.
        Fakat bu iki class arasında parent child iliskisi varsa direk kullanılabilir
         */

        System.out.println(Parent.isim);//ali
        System.out.println(isim);       //ali
        isim="veli";
        System.out.println(isim);//veli

        System.out.println(soyisim);//can
        soyisim="Tan";
        System.out.println(soyisim);//tan

        method1();//parent static method1
        method2();//parent static method2


        Child obj1 = new Child();
        System.out.println(obj1.yas);//30

        obj1.method3();
        obj1.method4();


    }//main
}//class
