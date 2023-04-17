package Javaders.Javaders.day24inheritancepolymorphismNIGHT;

public class Toyota extends Car{

    public void hybrid(){
        System.out.println("Toyota uses hybrid engine...");
    }
     public Toyota (){
        this("perius");
         System.out.println("Toyota constructor 1");
     }
    public Toyota (String s){
        super(7);
        System.out.println("Toyota constructor 2");
    }



}//class
