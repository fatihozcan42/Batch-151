package Javaders.Javaders.day40lambdaNIGHT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda01 {
    public static void main(String[] args) {

        List<String> iller = new ArrayList<>(Arrays.asList("Van", "MUS", "Gumushane", "Kutahya", "Ankara", "MUS", "Ordu", "Gaziantep", "Hatay", "Edirne"));
        bykHarflenghtArtanDistinct(iller);
        System.out.println();
        bykHrfSonHarfArtanDistinct(iller);
        System.out.println();
        uzunTekrarsiz(iller);
        System.out.println();
        System.out.println(LenghtBestenFazlaysaSil(iller));
        System.out.println();
        System.out.println(hIleBaslayanOrUileBitenElemanlarSil(iller));
        System.out.println();

    }//main



// 1) Tum list elemanlarini buyuk harfle, uzunluklarina gore, artan sirada ,tekrarsiz olarak yazdiriniz.
    public static void bykHarflenghtArtanDistinct(List<String> iller){
        System.out.print("1) ");
        iller.stream().
                sorted(Comparator.comparing(t->t.length())).
                map(t->t.toUpperCase()).
                forEach(t-> System.out.print(t+" "));

    }

// 2) Tum list elemanlarini buyuk harfle, son harflerine gore, artan sirada ,tekrarsiz olarak yazdiriniz

    public static void bykHrfSonHarfArtanDistinct(List<String >iller) {
        System.out.print("2) ");
        iller.
                stream().
                distinct().
                map(t -> t.toUpperCase()).//Lambda expression
                sorted(Comparator.comparing(t -> t.charAt(t.length() - 1))).
                forEach(t -> System.out.print(t + " "));
    }


// 3) Tum list elemanlarini buyuk harfle, uzunluklarina gore artan sirada ,tekrarsiz olarak yazdiriniz
// Uzunluklari ayni olan elemanlar alfabetik sirada olsunlar

    public static void uzunTekrarsiz(List<String> iller){
        System.out.print("3) ");
        iller.
                stream().
                distinct().
                map(String :: toUpperCase).//method referance yontemi ile yazma yontemidir.
                sorted(Comparator.comparing(String :: length).
                thenComparing(Comparator.naturalOrder())).
                forEach(System.out::println);// Lambda expression'da ==> forEach(t -> System.out.print(t + " ")); seklinde yazilir.
                                            //forEach(System.out::print); method referance () ==> bu sekilde yazilir.

    }


// 4) Karakter sayisi 5 ten fazla olan elemanlari siliniz

    public static List<String> LenghtBestenFazlaysaSil(List<String> iller){
        System.out.print("4) ");
        iller.removeIf(t->t.length()>5);
        return iller;
    }

// 5)"H" ile baslayan veya "u" ile biten elemanlari siliniz
public static List<String> hIleBaslayanOrUileBitenElemanlarSil(List<String> iller){
    System.out.print("5) ");
    iller.removeIf(t->t.startsWith("H") || t.endsWith("u"));

    return iller;
}

// 6) List elemanlarini karakter sayilarinin karelerini aliniz Ve bir list olarak ekrana yazdirin


//  7) List elemanlarindan karakter sayisi cift sayi olanlari bir list icinde ekrana yazdiriniz.





}//class