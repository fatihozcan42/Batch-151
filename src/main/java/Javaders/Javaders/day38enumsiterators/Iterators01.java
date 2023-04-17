package Javaders.Javaders.day38enumsiterators;

import java.util.*;

public class Iterators01 {
    public static void main(String[] args) {

        /*
    1) Iterator'lar loop'larin yaptigi ayni isi yapar.
    2) Iterator'larda sonsuz loop olusma ihtimali yoktur.
    3) Iterator'lar ile loop'lar arasinda performans farki yoktur.
    4) Iterator'lar bir collection'dan eleman silme ve bir collection'daki elemani degistirme konusunda daha basarilidir.
    5) Iki tip iteraror var; i)Iterator: Bu sadece eleman silmede kullanilir,
                                            eleman eklemek veya elemani degistirmek mumkun degildir.
                                ii)ListIterator: Bu eleman silebilir, ekleyebilir veya degistirebilir.
                                Note:"Iterator" sadece soldan saga (ilk elemandan son elemana) calisir.
                                     "ListIterator" ise iki yonlu calisabilir.
        */


        List<String> myList = new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Angie");
        myList.add("Mark");
        System.out.println(myList);//[Tom, Jim, Clara, Angie, Mark]

        // Iterator kullanalim

        Iterator<String> myItr = myList.iterator();
        while (myItr.hasNext()) {//hasNext(); pointer'a "Senden sonra eleman var mi?" diye sorar.
            //Eleman varsa "true" yoksa "false" return eder.
            myItr.next();        //next() pointer'i bir sonraki elemanin onune tasir ve ustunden atladigi elemani return eder.
            myItr.remove();     //next() methodunun retrn ettigi elemani siler.
        }
        System.out.println(myList);//[ ]

        // ListIterator kullanalim
        List<String> yourList = new ArrayList<>();
        yourList.add("Tom");
        yourList.add("Jim");
        yourList.add("Clara");
        System.out.println(yourList);//[Tom, Jim, Clara, Angie, Mark]

        ListIterator<String> yourListIterator = yourList.listIterator();
        while (yourListIterator.hasNext()) {
            String el = yourListIterator.next();
            yourListIterator.set(el + "!");
        }
        System.out.println(yourList);
        //hasPrevious ve previous() nasil kullanilir? pointer en sonda olmali
        while (yourListIterator.hasPrevious()) {//hasPrevious() senden once eleman var mi? true ya da false dondurur
            String el = yourListIterator.previous();
            System.out.println(el);
            yourListIterator.set("?" + el);
        }
        System.out.println(yourListIterator);// [ ?Tom!,   ?Jim!,   ?Clara! ]
        /*
        hasPrevious() senden once eleman var mi? true ya da false dondurur.Mutlaka imlec listenin sonunda olmalidir.
        */

        LinkedList<String> ourList = new LinkedList<>();
        ourList.add("van");
        ourList.add("Mus");
        ourList.add("Kayseri");
        ourList.add("Izmir");
        ourList.add("Samsun");
        System.out.println(ourList);//[van, Mus, Kayseri, Izmir, Samsun]
        Iterator<String> ourItr = ourList.descendingIterator();
        while (ourItr.hasNext()) {
            String eleman = ourItr.next();
            System.out.print(eleman+", ");//Samsun, Izmir, Kayseri, Mus, van,
        }

        System.out.println();
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(9);
        list.add(2);
        list.add(1);
        list.add(17);
        list.add(3);
        System.out.println(list);//[5, 9, 2, 1, 17, 3]

        Iterator itr = list.iterator();

        System.out.println(itr.hasNext());//true
        System.out.println(itr.next());//5  [5,(itr) 9, 2, 1, 17, 3]
        System.out.println(itr.next());//9 //[5, 9, (itr)2, 1, 17, 3]
        itr.remove();
        System.out.println(list);//[5, 2, 1, 17, 3]
        //itr.remove();
        //System.out.println(itr);
        /*
        remove() methodu uzerinden atladigi elemani siler, ancak uzerinden atlaidgi eleman yoksa hata verir.
        remove() methodu ust uste kullanilamz.remove dan once mutlaka next() veya previous kullanmak zorundayiz,
        */


    }//main
}//class
/*
Main method icinde bir List olusturduk ve import ettik. Burada loop yerine Iterator kullandik.
Once List'i Iterator'a donusturmeliyiz ki Iterator icindeki methodlari kullanabilelim.
Listimizin ismini yazip nokta koyunca orada sirali methdolar icinde Iterator methodunu goruruz ve onu seceriz.
Bu method bize String Iterator verir. Oyle olunce String Iterator conteynarina ihtiyacimiz olur.
Biz de Iterator<String> myItr=myList.iterator() olarak conteynerimizi olusturduk. While loop kullandik.
While icine myItr.hasNext() yazarak iteratordaki sonraki eleman var mi diye soracagiz, varsa onu silmesini
isteyecegiz. Su sekilde devam ettik:
myItr.next();
myItr.remove();
Sonda sout icine myList yazarak elemanlari bir list icinde ekranda gorebildik. Iterator sayesinde sonsuz loop
tehlikesi ile karsilasmadik.
Biz bu kodu yazinca Java ayni elemanlari iterator yapisi icine koydu. Biz liste bakinca bir de iteratora bakinca
ayni seyi gorsek de yapi olarak farklidirlar. Fark: Ilk elemanin oncesine iterator bir pointer koyuyor.
Biz has.Next methodu kullaninca bu methodla ilk pointer'a gelip kendisinden sonra bir eleman var mi diye
sormus olduk. Pointer kendisinden sonra Tom olduguna isaret ediyor yani true oluyor. Daha sonra bir sonraki
elemanin onune java tarafindan konulan pointer'a gelip senden sonra eleman var mi diye methodumuz sormaya devam eder.
While loop condition'i true oldugu surece bir sonraki elemanin olup olmadigina bakilir.
Remove methodu ise gelip oldugu anlasilan ilk eleman silinir ve sonraki kisma gelir. Once has.Next sonra
remove methodu her eleman icin calisacak.
 */