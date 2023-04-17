package Javaders.Javaders.day19passbyvaluemethodoverloading;

public class PassByValue02 {
    public static void main(String[] args) {
        String name ="Tom Hanks";
        System.out.println(name);


        String updateName =  updateName(name,"ali");

        System.out.println(updateName);
        System.out.println(name);

        name = updateName(name,"senior");
        System.out.println(name);


    }//main


    public static String updateName(String name, String add){
        name = name +" "+add;
        return name;
    }


}//Class
