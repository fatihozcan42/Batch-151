package Javaders.Javaders.day34collectionsmap;

import java.util.LinkedList;
import java.util.Queue;

public class Queues01 {
    public static void main(String[] args) {

        Queue<String> wareHouse = new LinkedList<>();
        wareHouse.add("Milk");
        wareHouse.add("Meat");
        wareHouse.add("Egg");
        wareHouse.add("Bread");
        wareHouse.add("Cheese");
        System.out.println(wareHouse);//[Milk, Meat, Egg, Bread, Cheese]

        wareHouse.remove();
        System.out.println(wareHouse);//[Meat, Egg, Bread, Cheese]

        System.out.println(wareHouse.peek());//Meat
        System.out.println(wareHouse);//[Meat, Egg, Bread, Cheese]

        System.out.println(wareHouse.element());//Meat
        System.out.println(wareHouse);//[Meat, Egg, Bread, Cheese]

        wareHouse.clear();
        //System.out.println(wareHouse.element());//exception verdi.
        System.out.println(wareHouse.peek());//null


    }//main


}//class

