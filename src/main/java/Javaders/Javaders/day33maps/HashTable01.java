package Javaders.Javaders.day33maps;

import java.util.Hashtable;

public class HashTable01 {

   /*
        "HashMap" ile "HashTable" arasindaki fark nedir?
        *i)"HashMap" "thread-safe" degildir "HashTable" "thread-safe" dir.
           "HashMap" "synchronized" degildir "HashTable" "synchronized" dir.
        ii)"HashMap" bir tane "null" key'e ve istediginiz kadar "null" value'a musaade eder.
           "HashTable" key'lerde de value'larda da "null" kullanilmasina musaade etmez.
        iii)"HashMap" hizlidir, "HashTable" "HashMap"e gore yavastir.
        Note: "HashMap" ve "HashTable" ikisi de entry'leri rastgele siralar.

     */

    public static void main(String[] args) {

        Hashtable<String, Integer> stAges = new Hashtable<>();
        stAges.put("Tom", 42);
        stAges.put("Jim", 52);
        stAges.put("Jack", 21);
        stAges.put("Henry", 43);
        stAges.put("Walker", 85);

        //stdAges.put(null,85); ==> HashTable'larin key'lerin null konulamaz
        //stdAges.put("Chris",null); ==> HashTable'larin value'larina null konulamaz
        System.out.println(stAges);//{Jim=52, Henry=43, Tom=42, Walker=85, Jack=21}




    }//main
}//class
