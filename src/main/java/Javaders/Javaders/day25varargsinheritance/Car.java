package Javaders.Javaders.day25varargsinheritance;

public class Car extends Vehicle {
    public Car (){
        this("make");
        System.out.println("Car1");
    }
    public Car (String make){
        super();
        System.out.println("Car string parametreli");
    }

    public  String model = "car model";
    public  int km = 20000;

}//Class
