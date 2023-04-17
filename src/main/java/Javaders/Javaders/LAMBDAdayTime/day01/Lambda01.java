package Javaders.Javaders.LAMBDAdayTime.day01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda01 {

    public static void main(String[] args) {
        /*
    1)Lambda; method create etme degil mevcut method'lari library'den cagirip kullanmaktir
    2)Java 8 ile eklenmistir
    3)Functional Programming dir. Mimari yapiya onem vermez
    4)Hiz , Clean Code ve okunabilirlik acisindan onemlidir
*/
        List<String> iller = new ArrayList<>(Arrays.asList("vAN", "edirne", "ordu", "VAN", "izmir", "eskisehir", "safranbolu", "Izmir", "mUS"));
        printsElements(iller);
        System.out.println();
        printsEl(iller);
        System.out.println();
        EHaricElYazdir(iller);
        System.out.println();
        karakterSayisiDorttenAzYazdir(iller);
        System.out.println();
        karakterSayisiDorttenFazlaBuyukHarfleYazdir(iller);
        System.out.println();
        karakterSayisiDorttenFazlaKucukHarfleSortedYazdir(iller);
        System.out.println();
        tekrarsizBuyukHarfSortedYazdir(iller);
        System.out.println();
        tekrarsizKucukHarfzunlukKucuktenBuyugeSortedYazdir(iller);
        System.out.println();
        ilkHarfBuyuk(iller);
    }//main

    //Example 1: Bir List'teki elemanlari console'a yazdiran method'u olusturunuz.
    //1.Yol: structured Programing
    public static void printsElements(List<String> iller) {
        for (String w : iller) {
            System.out.print(w + " ");
        }
    }

    //2.Yol:LAMBDA

    public static void printsEl(List<String> iller) {

        iller.
                stream().
                forEach(t -> System.out.print(t + " "));//datalari akisa alir.

    }


    //Example 2: Bir List'teki E ile baslayanlar haric tum elemanlari console'a yazdiran method'u olusturunuz.
    public static void EHaricElYazdir(List<String> iller) {

        iller.
                stream().
                filter(t -> !t.startsWith("E")).
                forEach(t -> System.out.print(t + " "));

    }

    //Example 3: Bir List'te character sayisi 4 den az olan tum elemanlari console'a yazdiran method'u olusturunuz.
    public static void karakterSayisiDorttenAzYazdir(List<String> iller) {

        iller.
                stream().
                filter(t -> t.length() < 4).
                forEach(t -> System.out.print(t + " "));

    }

    //Example 4: Bir List'teki character sayisi 4 den cok olan tum elemanlari buyuk harflerle console'a yazdiran method'u olusturunuz.
    public static void karakterSayisiDorttenFazlaBuyukHarfleYazdir(List<String> iller) {
        iller.stream().filter(t -> t.length() > 4).map(t -> t.toUpperCase()).forEach(t -> System.out.print(t + " "));
    }

    //Example 5: Bir List'teki character sayisi 4 den cok olan tum elemanlari tekrarsiz olarak kucuk harflerle console'a yazdiran method'u olusturunuz.
    public static void karakterSayisiDorttenFazlaKucukHarfleSortedYazdir(List<String> iller) {
        iller.
                stream().
                filter(t -> t.length() > 4).
                distinct().
                map(t -> t.toLowerCase()).
                forEach(t -> System.out.print(t + " "));
    }

    //Example 6: Bir List'teki elemanlari tekrarsiz olarak buyuk harflerle alfabetik sirada console'a yazdiran method'u olusturunuz.
    public static void tekrarsizBuyukHarfSortedYazdir(List<String> iller) {
        iller.
                stream().
                distinct().
                sorted().
                map(t -> t.toUpperCase()).
                forEach(t -> System.out.print(t + " "));
    }
    //Example 7: Bir List'teki elemanlari tekrarsiz olarak kucuk harflerle uzunluklarina gore kucukten buyuge siralayarak console'a yazdiran method'u olusturunuz.

    public static void tekrarsizKucukHarfzunlukKucuktenBuyugeSortedYazdir(List<String> iller) {
        iller.
                stream().
                distinct().
                sorted(Comparator.comparing(t -> t.length())).
                map(t -> t.toLowerCase()).
                forEach(t -> System.out.print(t + " "));
    }

    // Example 8: Tum elemanlarin ilk harfini buyuk digerlerini kucuk yazdiran methodu olusturunuz

    public static void ilkHarfBuyuk(List<String> iller){
        iller.
                stream().
                distinct().
                map(t->t.substring(0,1).toUpperCase()+t.substring(1,t.length()).toLowerCase()).
                forEach(t-> System.out.print(t+" "));
    }

}//class