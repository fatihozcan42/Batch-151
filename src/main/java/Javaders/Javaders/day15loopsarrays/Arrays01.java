package Javaders.Javaders.day15loopsarrays;

import java.util.Arrays;

public class  Arrays01 {
    public static void main(String[] args) {

         /*
        1)Array, Java'nin "ayni data tipi"nde "coklu data" depolamak icin olusturdugu bir yapidir.
        2)Array'ler "primitive data type" leri veya "reference"lar ile calisir.
        3)Array'ler "super fast" dir ve "memory'de cok az yer" kaplarlar.
         */

        //Array nasil olusturulur?
        String stdNames [] = new String[5];//[null, null, null, null, null]

        //Array nasil olusturulur?
        System.out.println(Arrays.toString(stdNames));

        //Array'e nasil eleman eklenir?

        stdNames[0] = "Ajda";
        stdNames[3] = "Cuneyt";
        stdNames[2] = "Kemal";
        stdNames[1] = "Ayhan";
        stdNames[4] = "Filiz";

        System.out.println(Arrays.toString(stdNames));

        //Array'deki specific bir elemani nasil alabiliriz?
        System.out.println(stdNames[3]);// Cuneyt

        //Example 1: stdNames array'indeki her ismin sonuna yildiz koyarak console'a yazdiriniz
        //1.Way:
        System.out.println("============");

        for (int i = 0; i < stdNames.length; i++) {// length String'lerde parantezli(method), Array'lerde parantezsiz(method degil) kullanilir
            System.out.println(stdNames[i] + "*");
        }
        
        //2.Way: for-each loop ==> Enhanced(Zenginlestirilmis) Loop - Mumkunse hep for-each loop kullanin
        //[Ajda, Ayhan, Kemal, Cuneyt, Filiz]
        System.out.println("============");


        for (String  w : stdNames){
            System.out.println(w+"*");
        }

        //Example 2: Bir Integer Array olusturunuz, 5 eleman ekleyiniz, elemanlarin toplamini bulup console'a yazdiriniz.

        int ages [] = new int[5];

        ages[0]= 12;
        ages[1]= 23;
        ages[2]= 9;
        ages[3]= 38;
        ages[4]= 27;

        int sum = 0;

        for (int w : ages){
            sum = sum+w;
        }
        System.out.println(sum);

        //Example 3: Bir char Array olusturunuz, 3 eleman ekleyiniz, elemanlarin carpmini bulup console'a yazdiriniz

        char initials [] = new char[3];

        initials[0] = 'J';
        initials[1] = 'P';
        initials[2] = 'A';

        int carpim = 1;

        for (char w : initials){
            carpim = carpim * w;

        }
        System.out.println(carpim);






    }//main
}//class
