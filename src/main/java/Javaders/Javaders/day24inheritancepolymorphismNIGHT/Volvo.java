package Javaders.Javaders.day24inheritancepolymorphismNIGHT;

public class Volvo extends Car{

    public void secure(){
        System.out.println("Volvo is the most secure car in the world...");
    }

    @Override //Bu bir "annotation" dir. @Override annotation'i Override kurallarini kontrol eder
    public void move() {
        System.out.println("Volvo moves...");
    }





}//Class

