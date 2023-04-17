package Javaders.Javaders.day34collectionsmap;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue02 {
    public static void main(String[] args) {


        Queue<String> line = new PriorityQueue<>();
        line.add("Milk");
        line.add("Meat");
        line.add("Egg");
        line.add("Orange");
        line.add("Tomatoes");

        System.out.println(line);//[Egg, Milk, Meat, Orange, Tomatoes]

     /*
            1)Queue bir interface dir ,  bu yuzden constructor ' yoktur, dolayisiyla object olustururken new keywordunden sonra kullanilamaz
            2)Datatype "Queue" olan bir object olusturmak icin new keywordden sonra
                i)LinkedList veya
               ii)PriorityQueue class'lari kullanilabilir
            3)Queue olustururken constructor olarak PriorityQueue kullanirsaniz eleman kendi belirleyeceginiz kurala gore siralama hakkiniz olur
    */

        //Deque ==> Double ended  queue ==> iki uclu kuyruk
        ////Deque'daki add() , get() , peek() , poll() , remove() methodlari first-last seklinde iki uclu olarak bulunur
        Deque<String> d = new LinkedList<>();
        d.add("Milk");
        d.add("Meat");
        d.add("Egg");
        d.add("Orange");
        d.add("Tomatoes");
        System.out.println(d);//[Milk, Meat, Egg, Orange, Tomatoes]


    }//main
}//class
