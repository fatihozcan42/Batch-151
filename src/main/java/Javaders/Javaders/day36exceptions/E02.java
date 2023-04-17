package Javaders.Javaders.day36exceptions;

public class E02 {
    public static void main(String[] args) {

        String s = "Java";
        getNumberOfChars(s);

        String t = "";
        getNumberOfChars(t);

        String u = null;
        getNumberOfChars(u);




    }//main

    public static void getNumberOfChars(String s){
        // String'in degeri null oldugunda String Class'taki bazi methodlari kullanmaya calisirsaniz java
        // "NullPointerException" atar.

        try{
            int numOfChars = s.length();
            System.out.println(numOfChars);
        }catch (NullPointerException e){
            System.out.println("null degeri icin bazi methodlar kullanilamaz");
        }


    }
}//class
