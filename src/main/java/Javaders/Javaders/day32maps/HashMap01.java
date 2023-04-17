package Javaders.Javaders.day32maps;

import java.util.HashMap;

public class HashMap01 {
    public static void main(String[] args) {

        HashMap<String, Integer> stdAges = new HashMap<>();
        stdAges.put("Ajda", 77);
        stdAges.put("Ezel", 38);
        stdAges.put("Tom", 76);
        stdAges.put("Brad", 58);
        stdAges.put("Angelina", 58);
        //Key tekrarli kulanmak hata vermez, en son verilen entry'nin degerini kabul eder.
        // Bu yontem value guncellemede kullanilir. Buna "Overwrite" denir.
        stdAges.put("Tom", 83);

        //HashMap'ler entry'leri rasgele siralaar, bu yuzden cok hizli calisir,
        // Map'ler entry'leri siralarken key'lere bakarak siralama yapar
        System.out.println(stdAges);//{Tom=83, Angelina=58, Ajda=77, Brad=58, Ezel=38}

        //replace method'u "value"lari keyleri kullanarak update etmeye yarar.
        stdAges.replace("Ezel", 39);
        System.out.println(stdAges);//{Tom=83, Angelina=58, Ajda=77, Brad=58, Ezel=39}

        // Bu method Map icinde "Angelina" '58' varsa 61'e donusturur,
        stdAges.replace("Angelina", 58, 61);
        System.out.println(stdAges);//{Tom=83, Angelina=61, Ajda=77, Brad=58, Ezel=39}

        //stdAges.replace("Angelina",45,56);
        //System.out.println(stdAges);//{Tom=83, Angelina=61, Ajda=77, Brad=58, Ezel=39}

        //putIfAbsent() method'u Map'te "Ali" key olarak yoksa "Ali 60" i ekler;
        // varsa eklemez.
        stdAges.putIfAbsent("Ali", 60);
        System.out.println(stdAges);//{Tom=83, Angelina=61, Ajda=77, Brad=58, Ezel=39, Ali=60}

        //getOrDefault("Ayse", 0); methodu Map'de varolan "key"ler icin "get() methodu" ile ayni ciktiyi verir.
        //getOrDefault("Ayse", 0); methodu Map'de olmayan "key"ler icin ikinci parametreye koydugunuz degeri
        // "get() methodu" ise null verir.
        System.out.println(stdAges.get("Tom"));//83
        System.out.println(stdAges.getOrDefault("Tom", 0));//83

        System.out.println(stdAges.get("Ayse"));//null
        System.out.println(stdAges.getOrDefault("Ayse", 0));//0

        //containsValue(77); methodu value'lari icerisinde olup olmadigini kontrol eder.
        System.out.println(stdAges.containsValue(77));//true

        //containsKey("Ali"); methodu key'lerin icerisinde Ali olup olmadigini kontrol eder.
        System.out.println(stdAges.containsKey("Ali"));//true

        //remove("Ali"); methodu "key"kullanarak entry'i silmeye yarar.
        stdAges.remove("Ali");
        System.out.println(stdAges);//{Tom=83, Angelina=61, Ajda=77, Brad=58, Ezel=39}

        //containsKey() methodu, Map icinde ilgili key var mi diye bakar.
        //Method icine ornegin "Ali" yazdik ve Map icinde keyler arasinda Ali oldugu icin, sonucta true goruruz.
        //remove() methodlarindan birincisi, key'e bakarak entry'i siliyor. Ornek "Ali" yazdik, ve map icindeki "Ali" cikarildi.
        //Ikinci remove methodu ise hem key'e ham value'ye bakar ve ona gore siler. Ornegin method icine "Tom", 81 yazdik.
        //Tom'u silmez cunku Map'de Tom, 83 idi, 81 olmadigi icin silmez.
        stdAges.remove("Tom", 81);
        System.out.println(stdAges);//{Tom=83, Angelina=61, Ajda=77, Brad=58, Ezel=39}

        System.out.println(stdAges.size());//5

        HashMap<String, Integer> kidsAge = new HashMap<>();
        kidsAge.put("John", 12);
        kidsAge.put("Jim", 22);
        kidsAge.put("Jack", 32);


        //putAll(kidsAge); method"u stdAges Map'ine kidsAge Map'ini ekler. Dolayisiyla stdAges Map'i degismis olur.
        //Ama kidsAge Map'i degismez
        stdAges.putAll(kidsAge);
        System.out.println(stdAges);//{Tom=83, Angelina=61, John=12, Ajda=77, Brad=58, Jack=32, Ezel=39, Jim=22}
        System.out.println(kidsAge);//{John=12, Jack=32, Jim=22}


    }//main
}//class
