package Javaders.Javaders.day20arraylistsdatetime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList01 {
    /*
    1) Strring class kullanmak tercih edilir cunku String class method acisindan cok zengingir
    2) List.of() kullanarak kisa yoldan olusturukur ama
        i; bu listler degistirilemez.
        ii: bu listlerin eleman ekleyemeyiz
        iii: bu listlerden eleman silinmez.
     */



    /*
Example 1: Kullanicinin girdigi harf List'te var ise o harfi "Buldum!" a cevirin yoksa o harfi list'e ekleyin
 */

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("A");
        myList.add("H");
        myList.add("J");
        myList.add("K");
        myList.add("M");
        int size = myList.size();

        Scanner input = new Scanner(System.in);
        int counter = 0;

        do {
            if(counter == size){
                System.out.println(myList);
                break;
            }
            System.out.println("Please enter a letter...");
            String letter = input.next().toUpperCase().substring(0, 1);

            if (myList.contains(letter)) {
                myList.set(myList.indexOf(letter), "Buldum!");
            } else {
                myList.add(letter);
            }
            counter++;

        }while(true);



    }//main

    public static class MethodOverLoading01 {
        public static void main(String[] args) {

            String s = "Java";
            // 1) Method Overloading ne demek ?
            // Ayni isimde farkli isler yapabilen methodlar olusturmak demek
            // 2) ne icin var?
            //Daha derli toplu olsun diye, her parametreye gore yeni method olusturmamak adina var.
            //ORNEK: substring methodu  a) tek parametreyle ve b) iki parametre

            Scanner scan = new Scanner(System.in);
            System.out.println("Lutfen passwordunuzu      " +
                    "                i) En az 8 karakterden olussun\n" +
                    "                ii)Password space icermesin\n" +
                    "                iii)Buyuk harf ile başlasın\n" +
                    "                iv) Kucuk harf ile bitsin\n" +
                    "giriniz....");




        }//main




    }//Class
}//class
