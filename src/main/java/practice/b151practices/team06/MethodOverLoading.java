package practice.b151practices.team06;

public class MethodOverLoading {
    public static void main(String[] args) {


               /*
        1) Method Overloading nedemek?
            Ayni isimde farkli isler yapabilen methodlar olusturmak demek
        2) Ne icin var?
            Daha derli toplu bir yapi olsun diye, her parametreye gore yeni method olusturmak adina var
            ORNEK substring methodu a) tek parametre b) iki parametre
         */


        /*
        1) Method Overloading yaparken method ismi degistirilmez
        2) Method Overloading yaparken parametreler degistirilir.
            a) Parametre degistirirken, parametrelerin data type lari degistirilebilir
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

        String str = "Java";




    }//main



}//class
