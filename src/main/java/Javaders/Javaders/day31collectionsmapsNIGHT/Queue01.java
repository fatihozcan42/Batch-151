package Javaders.Javaders.day31collectionsmapsNIGHT;

import java.util.LinkedList;
import java.util.Queue;

public class Queue01 {

    public static void main(String[] args) {

        Queue<String> wareHouse = new LinkedList<>();

        wareHouse.add("Milk");
        wareHouse.add("Meat");
        wareHouse.add("Bread");
        wareHouse.add("Egg");
        wareHouse.add("Cheese");
        System.out.println(wareHouse);//[Milk, Meat, Bread, Egg, Cheese]

        wareHouse.remove();
        System.out.println(wareHouse);//[Meat, Bread, Egg, Cheese]

        System.out.println(wareHouse.peek());//Meat
        System.out.println(wareHouse);//[Meat, Bread, Egg, Cheese]

        System.out.println(wareHouse.element());//Meat
        System.out.println(wareHouse);//[Meat, Bread, Egg, Cheese]

        System.out.println(wareHouse.poll());//Meat
        System.out.println(wareHouse);//[Bread, Egg, Cheese]

        wareHouse.clear();
        System.out.println(wareHouse.poll()); //null
        System.out.println(wareHouse.remove());// Exception
        //System.out.println(wareHouse.element()); //Exception



    }//main
}//Class
