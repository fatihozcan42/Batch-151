package Javaders.Javaders.day25varargsinheritance;

public class Honda extends Car {

        public Honda (){
            super("make");
            System.out.println("Honda 1");
            System.out.println(this.model);
            System.out.println(super.km);

        }

        public  String model = "civic";
        public  int km = 10000;

    }

