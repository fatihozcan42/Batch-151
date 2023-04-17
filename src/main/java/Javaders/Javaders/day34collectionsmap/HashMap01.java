package Javaders.Javaders.day34collectionsmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap01 {

    /*
   Map'lerde sozluklerdeki gibi kelime ve manasi seklinde bir kullanim vardir
   "key" kismi tekrarsiz, "value" kismi tekrarli olabilir
   Map'lerdeki elemanlara "entry" denir
   Elemanlarin tamamina "EntrySet" denilir
   Entry'ler tekrarsiz oldugu icin EntrySet denilir
   "Key" ve "value"lar ayri ayri data tiplerinde olabilirler
   "Map"ler collection degildir
   HashMap'ler entry'leri rastgele sıralar, bu yüzden en hızlı map'tir
*/
    public static void main(String[] args) {

        HashMap<String, Integer> countryPopulation = new HashMap<>();
        countryPopulation.put("Germany", 83000000);
        countryPopulation.put("Albania", 30000000);
        countryPopulation.put("USA", 400000000);
        countryPopulation.put("Turkiye", 80000000);
        countryPopulation.put("Netherland", 18000000);

        // {Turkiye=80000000, Netherland=18000000, USA=400000000, Germany=83000000, Albania=30000000}
        System.out.println(countryPopulation);

        System.out.println(countryPopulation.get("USA"));//400000000

        Set<String> keys = countryPopulation.keySet();
        System.out.println(keys);//[Turkiye, Netherland, USA, Germany, Albania]

       Collection<Integer> values =  countryPopulation.values();
        System.out.println(values);//[Turkiye, Netherland, USA, Germany, Albania]

        //EX 1; CountryPopulation daki ulkelrin nufus ortalamasi haesaplayiniz?

        Collection<Integer> value =  countryPopulation.values();
        int sum = 0;
        for (int w : value) {
            sum+=w;

        }
        System.out.println(sum/value.size());//122200000

        //entrySet() methodu entr'leri kalıp halinde alıp bize Set olarak veriyor.
        //Loop'lar map'ler ile kullanılamaz, bunun için entrySet methodunu kullanırız

        Set<Map.Entry<String,Integer>> entries = countryPopulation.entrySet();

       // Example 2 : countryPopulation Map'indeki ulkelerin isimlerinin character sayisi ile nufuslarinin toplamini bulunuz.
                int toplam =0;
                for ( Map.Entry<String,Integer>  w : entries ) {
                    toplam = toplam +  w.getKey().length() + w.getValue();
                }
                System.out.println(toplam);//570800033

        



    }//main

}//class
