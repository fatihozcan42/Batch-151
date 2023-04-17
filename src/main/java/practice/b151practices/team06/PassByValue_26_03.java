package practice.b151practices.team06;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PassByValue_26_03 {

    public static void main(String[] args) {

          /*
        Pass by value
        1) Java Pass by Value kullanir.
        2) yani; java method larin orjinal degeri degistirmesine musaade etmez
        3) java methodlara deger yollarken orjinal degerin kopyasini olusturur ve o kopyayi methoda a yollar
            Method kopya deger uzerinde degisiklik yapar, boylece orjinal deger korunmus olur
        4)Java esnek bir dildir, Istersek yazdigimiz kod ile   orjinal degerin degismesini temin edebiliriz.

        Pass By Reference :
        1) Pass by reference da methoda reference yollanir
        2) Reference adres demektir. Adres yollaninca method adresi kullanarak orjinal degere ulasir ve orjinal degeri degistirir
            Bu yüzden C# C++ gibi Pass by reference kullanan dillerde method variable orjinal degerini degisitirir

         */

//       1) Basitlik: Değere göre geçirme, bağımsız değişkenleri işlevlere geçirmenin basit bir yoludur.
//          Davranışın anlaşılması kolaydır ve tüm veri türlerinde tutarlı bir şekilde çalışır.
//       2) Öngörülebilirlik: Değere göre geçiş ile değişkenin orijinal değerinin işlev tarafından değiştirilmediğinden emin olabilirsiniz.
//          Bu, programın davranışı hakkında akıl yürütmeyi kolaylaştırır.
//       3) Verimlilik: Argümanları değere göre iletmek,
//         özellikle tamsayılar veya mantıksal değerler gibi küçük veri türleri için referansa göre iletmekten daha verimli olabilir.

//   Genel olarak, değere göre geçiş yaygın olarak kullanılan bir programlama tekniğidir çünkü basit, tahmin edilebilir,
//  verimlidir ve kapsülleme gibi iyi programlama uygulamalarını destekler.
//  Ancak, özellikle daha büyük veri türleri için veya bağımsız değişkenin orijinal değerini değiştirmeniz gerektiğinde,
//  başvuruya göre geçişin gerekli olabileceği durumlar vardır.

        //EX:1
        // Verilen bir fiyat icin %10, %20 ve %25 inidirim uygulayan uc method olustirin.
        // Method'ta indirim uygulayip fiyati main method icerisinde yazdirin.
        // methodlari arka arkaya cagirip kontrol edin.

//        int price = 100;
//        System.out.println(price);//100
//
//        System.out.println("indirim10(price) = " + indirim10(price));//90
//        System.out.println("indirim20(price) = " + indirim20(price));//80
//        System.out.println("indirim25(price) = " + indirim25(price));//75
//
//        System.out.println("price = " + price);
//
//        price = indirim10(price);
//        System.out.println(price);//90


        //EX:2
        // Bir list olusturalim, eleman olarak 10, 11, 12 ekleyelim, iki method olusturup list elemanlarini
        // arttirmayi deneyelim
        //1. method ta foreach lopp kullanin,
        // 2. method'ta set() method'u kullanrak artirin
        // methodlari arka arkaya cagirin.

//        List <Integer> list = new ArrayList<Integer>();
//        list.add(10);
//        list.add(11);
//        list.add(12);
//
//        (list);
//        System.out.println(list);
//        degistir2(list);
//        System.out.println(list);




        /*
        EX:3
        // Bir list ve array olusturalim, eleman olarak 10, 11, 12 ekleyelim, iki method olusturup list ve Array'i degistirmeye
        calisalim.
        1. method'ta Array'a yeni bir Array assign edelim ve yazdiralim.
        2. method'ta list'e yeni bir list assign edelim ve yazdiralim.
         */

//        int num [] = {10,11,12};
//        degisitrarray(num);//[0,0,0,0,0]
//        System.out.println(Arrays.toString(num));//{10,11,12}

//        List <Integer> list = new ArrayList<>();
//        list.add(10);
//        list.add(11);
//        list.add(12);
//
//        degistirList(list);//[40]
//        System.out.println("method'tan sonra list" + list);// [10,11,12]


        List <Integer> abc = new ArrayList<>();
            abc.add(5);
            abc.add(6);
            abc.add(7);

        System.out.println(abc);
        abc.set(1,4);
        System.out.println(abc);



        yeni(abc);
        System.out.println(abc);

        int x = 10;
        System.out.println(x);
        System.out.println(a(x));
        System.out.println(x);


    }//main

    public static int a(int w){
        w=w+15;
        return w;
    }



    public static void yeni(List<Integer> a){
        a.add(0,8);
        a.get(2);//6

        a.set(1,10);
        System.out.println(a);
    }
    public static void degistir(List<Integer> list) {
        for (int w : list) {
            w += 3;
            System.out.println("w = " + w);
        }
    }



//    public static void degisitrarray (int num []){
//        num = new int [5];
//        System.out.println("method'tan gelen "+Arrays.toString(num));
//    }
//
//    public static void degistirList (List<Integer> list){
//        list = new ArrayList<>();
//        list.add(40);
//        System.out.println("list method"+ list);
//    }
//    public static void degistir2(List<Integer> a) {
//        for (int i = 0; i < a.size(); i++) {
//            a.set(i, a.get(i)+5);
//            System.out.println(a.get(i)+ " ");
//        }
//        System.out.println();
//        System.out.println(a);
//  }





//        public static int indirim10(int price){
//        price = price - ((price*10)/100);
//        return price;
//        }
//    public static int indirim20(int a){
//        a = a - ((a*20)/100);
//        return a;
//    }
//    public static int indirim25(int price){
//        price = price - ((price*25)/100);
//        return price;
//    }
//    public static void degistir(List<Integer> list){
//        for (int w : list) {
//            w+=3;
//            System.out.println("w = " + w);
//        }
//        System.out.println();
//        System.out.println("list = " + list);
   // }

//    public static void degistir2(List<Integer> a) {
//        for (int i = 0; i < a.size(); i++) {
//            a.set(i, a.get(i)+5);
//            System.out.println(a.get(i)+ " ");
//        }
//        System.out.println();
//        System.out.println(a);
//  }




}//class
