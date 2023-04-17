package Javaders.Javaders.day39lambdaNIGHT;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda01 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Tom");
        myList.add("Clara");
        myList.add("Angelina");

        printElement(myList);
        System.out.println();
        printEl(myList);
        System.out.println();
        printElExceptStartsWithT(myList);
        System.out.println();
        printElLengthLessThanFour(myList);
        System.out.println();
        printElLengthMoreThanFourWithUpper(myList);
        System.out.println();
        printElLengthMoreThanFourUniqueLowerCase(myList);
        System.out.println();
        printElUniqueToUpperCaseSorted(myList);
        System.out.println();
        printElUniqueLowerCaseSortWithLength(myList);

    }//main

    //Example 1: Bir List'teki elemanlari console'a yazdiran method'u olusturunuz.
    //1.Yol:
    public static void printElement(List<String> myList) {
        for (String w : myList) {
            System.out.print(w + " ");
        }
    }

    //2.Yol
    public static void printEl(List<String> myList) {
        myList.stream().forEach(t -> System.out.print(t + " "));
    }

    //Example 2: Bir List'teki T ile baslayanlar haric tum elemanlari console'a yazdiran method'u olusturunuz.
    public static void printElExceptStartsWithT(List<String> myList) {
        myList.stream().filter(t -> !t.startsWith("T")).forEach(t -> System.out.print(t + " "));
    }
    //Example 3: Bir List'te character sayisi 4 den az olan tum elemanlari console'a yazdiran method'u olusturunuz.

    public static void printElLengthLessThanFour(List<String> myList) {
        myList.stream().filter(t -> t.length() < 4).forEach(t -> System.out.print(t + " "));
    }

    //Example 4: Bir List'teki character sayisi 4 den cok olan tum elemanlari buyuk harflerle console'a yazdiran method'u olusturunuz.
    public static void printElLengthMoreThanFourWithUpper(List<String> myList) {
        myList.
                stream().
                filter(t -> t.length() > 4).
                map(t -> t.toUpperCase()).//yapisini degistirir.Burada kuck harf yapar
                forEach(t -> System.out.print(t + " "));
    }

    //Example 5: Bir List'teki character sayisi 4 den cok olan tum elemanlari tekrarsiz olarak kucuk harflerle console'a yazdiran method'u olusturunuz.
    public static void printElLengthMoreThanFourUniqueLowerCase(List<String> myList) {
        myList.
                stream().
                distinct().//distinct()tekrarli elemanlari bir kere gosterir. Tekrarsiz
                filter(t -> t.length() > 4).
                map(t -> t.toLowerCase()).
                forEach(t -> System.out.print(t + " "));
    }

    //Example 6: Bir List'teki elemanlari tekrarsiz olarak buyuk harflerle alfabetik sirada console'a yazdiran method'u olusturunuz.
    public static void printElUniqueToUpperCaseSorted(List<String> myList) {
        myList.
                stream().
                distinct().
                map(t -> t.toUpperCase()).
                sorted().//naturalOrder'a gore calisir. tersten siralama nethodu reverse order'dir.
                forEach(t -> System.out.print(t + " "));
    }

    //Example 7: Bir List'teki elemanlari tekrarsiz olarak kucuk harflerle uzunluklarina gore kucukten buyuge siralayarak console'a yazdiran method'u olusturunuz.
    public static void printElUniqueLowerCaseSortWithLength(List<String> myList){
        myList.
                stream().
                distinct().//tekrarsiz yapar.
                map(t->t.toLowerCase()).
                sorted(Comparator.comparing(t->t.length())).//Comparator.comparing() karsilastirma sartini biz yazacaksak kullanlir.
                forEach(t-> System.out.print(t+" "));

    }
}//class
