package Javaders.Javaders.day36exceptions;

public class E04 {
    public static void main(String[] args) {
/*
        * throw keyword bir method bodysi icinde istedigimiz yerde, istedigimiz kosullar icin,
        istedigimiz kadar Exception atmamizi saglar
        * throw keywordu yazildiktan sonra bir Exception Class Objecti olusturulur.
        * Exception class constructor inin parantez icine istedigimiz Exception mesajini yazabiliriz.
        * * * throw ile throws keywordleri arasindaki fark nedir? * * *
        1)"throw" method bodysi icinde, "throws" ise method parantezinden hemen sonra kullanilir.
        2) "throw" method bodysi icinde istenilen yerde istenildigi kadar kullanilabilir
            "throws" ise method parantezinden hemen sonra ve sadece 1 kere kullanilabilir.
        3) "throw" dan sonra "new" keyword ve constructor kullanilarak object olusuturulur
        *   "throws" dan sonra sadece Exception Class ismi yazilir
        4) "throw" belli sartlar icin Exception atmada kullanilir
            "throws" ise applicationu Exception attiktan sonra durdurur.
 */

        printAge(443);

    }//main
    public static void printAge(int age){
        if (age<0){
            throw new IllegalArgumentException("Age cannot be negative");
        } else if (age>150) {
            throw new IllegalArgumentException("Age cannot be more than 150");
        } else {
            System.out.println(age);
        }
    }

}//class
