package Javaders.Javaders.day20arraylistsdatetime;

public class MethodOverLoading {

    public static void main(String[] args) {

        String s = "SABIR";

        /*
        1) Method Overloading nedemek?
            Ayni isimde farkli isler yapabilen methodlar olusturmak demek
        2) Ne icin var?
            Daha derli toplu bir yapi olsun diye, her parametreye gore yeni method olusturmak adina var
            ORNEK substring methodu a) tek parametre b) iki parametre
         */

        add(3,5);

        /*
        1) Method Overloading yaparken method ismi degistirilmez
        2) Method Overloading yaparken parametreler degistirilir.
            a) Parametre degistirirken, parametrelerin data type lari degistirilebilir.
            b) Parametre degistirirken, parametrelerin data typelari farkli ise yerleri degistirilebilir
            c) Parametre degistirirken, parametrelerin sayisi degistirilebilir
        3) Java icin ismi ve parametreleri ayni olan iki method tamamiyla aynidir
            Bu yuzden ismi ve parametre==> "method signature" olarak adlandirilir
        4) Method Overloading olustururken return type'i degistirmenin hic bir etkisi yoktur
           Method Overloading olustururken access modifier'i degistirmenin hic bir etkisi yoktur
           Method Overloading olustururken methodu static veya non static hic bir etkisi yoktur
           Method Overloading olustururken method body'i degistirmenin hic bir etkisi yoktur
        5) "private" methodlar overload edilebilir. Cunku method overloading sadece bir class'in icinde olur
            "private" olmak ise baska classlara gidildiginde problem olusturur
        6) "static" methodlar overload edilebilirler
         */

        add(2,4.5,2);

    }//main


    public static void add (int a, int b) {
        System.out.println(a+b);
    }

    public static void add(int a, int b, double c){
        System.out.println((a+b+c));

    } public static void add(int a,  double b, int c){
        System.out.println((a+b+c));
    }

    public static void add(double a, int b){
        System.out.println(a+b);
    }
    public static void add(int a, int b, int c ){
        System.out.println(a+b);
    }


}//class
