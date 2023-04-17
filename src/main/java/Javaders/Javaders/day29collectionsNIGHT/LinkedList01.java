package Javaders.Javaders.day29collectionsNIGHT;

import java.util.LinkedList;

public class LinkedList01 {

    //NOTE:ArrayList'ler eleman silme ve eklemede tekrar indexleme yapmak zorunda olduklarindan eleman ekleme ve silmede basarisizdirlar
//
//    ArrayListler eleman silme ve eklemede yavastirlar. Cunku tekrar indexlemeye ihtiyac duyarlar.
//    LinkedListler ise elaman silmede basarilidirlar. LinkedListlerde her eleman bir sonrakini gosteriyor
//    ve en sondakinin sonrasi olmasa da null gosterir. LinkedListeler index kullanmazlar.
//
//    LinkedListlerde en bastaki elemandan daha once Head eleman vardir. Son eleman'a Tail denir en sonda
//    oldugu icin. Elemanlarin yapisi farkli olup bunlara Node denir. Yapinin bir yuzune point, on yuzune
//    ornegimize gore harf olan kismina Data denir. Node, Data ve Point'den olusuyor.
//    Bir eleman sildigimizde eleman sildik demiyoruz, node sildigimizi soyluyoruz.
    //NOTE:LinkedList'ler "index" kullanmazlar
    /*
    1) LinkedList'ler node silme ve ekleme de cok basarili olduklari icin, silme ve ekleme islemlerini coklukla yapacaginiz zaman
  LinkedList kullaniniz.
    2)

     */

//NOTE:ArrayList'ler eleman bulmada cok basarilidir , LinkedList'ler ise node bulmada basarisizdir,
// ekleme ve cikarmada ise LinkedList'ler daha basarilidir.

    public static void main(String[] args) {

        LinkedList<String>  s = new LinkedList<>();

        s.add("Esra");
        s.add("Steve");
        s.add("Ajda");
        s.add("Muge");
        s.add("Cuneyt");
        s.add("Esra");

        System.out.println(s);//[Steve, Ajda, Muge, Cuneyt, Esra]

//
//        s.add(2,"Esen");
//        System.out.println(s);//[Steve, Ajda, Esen, Muge, Cuneyt, Esra]
//
//        s.addFirst("Kemal");
//        System.out.println(s);///[Kemal, Steve, Ajda, Esen, Muge, Cuneyt, Esra]
//
//        s.addLast("Ajdar");
//        System.out.println(s);//[Kemal, Steve, Ajda, Esen, Muge, Cuneyt, Esra, Ajdar]
//
//        s.remove(2);
//        System.out.println(s);//Ajda  siler
//
//        s.remove("Ajdar");
//        System.out.println(s);//[Kemal, Steve, Esen, Muge, Cuneyt, Esra]
//
//        s.remove();
//        System.out.println(s);// Kemal'i siler

//        s.removeFirstOccurrence("Esra");
//        System.out.println(s);

        //s.removeLastOccurrence("Esra");
        System.out.println(s);

        /*
        Retrieves, but does not remove, the head (first element) of this list.
        Returns: the head of this list, or null if this list is empty
         */
        String r1 = s.peek();//Ilk node silmeden size verir.(Copy-paste)
        System.out.println(r1);//Esra



        /*
        Retrieves and removes the head (first element) of this list.
        Returns: the head of this list, or null if this list is empty
         */

        String r2 = s.poll();//Ilk node verir ve list'ten siler (cut-paste)
        System.out.println(r2);//esra
        System.out.println(s);//[Steve, Ajda, Muge, Cuneyt, Esra]

        /*
        Retrieves, but does not remove, the head (first element) of this list.
        Throws: NoSuchElementException – if this list is empty
        NOTE: Peek () ile element () elemani silmeden size vewrir.
        ancak peek() list bos oldugunda size null verir; element() ise "hata" verir.
         */

        String r3 = s.element();//Ilk node silmeden size verir.(Copy-paste)
        System.out.println(r3);
        System.out.println(s);

        /*
        removes and returns the first element of this list.
        Throws: NoSuchElementException – if this list is empty
        NOTE: poll () ile pop () elemani silmeden size vewrir.
        ancak poll() list bos oldugunda size null verir; pop() ise "hata" verir.
         */
        String r4 = s.pop();
        System.out.println(r4);//Steve

        System.out.println(s);//[Ajda, Muge, Cuneyt, Esra]

        //hash set setlerin en hizlisidir hiz ihtiyaci, siralama yapmaz
        //link hash set elemanlari sizin girdiginiz siraya gore dizer
        //treeset elemanlari natural order'a gore dizer


    }//main

}//class

