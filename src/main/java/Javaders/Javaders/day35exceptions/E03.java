package Javaders.Javaders.day35exceptions;

public class E03 {
    public static void main(String[] args) {

        String s = "Java";
        getCharFromString(s,2);//v
        getCharFromString(s,4);//StringIndexOutOfBoundsException


    }//main

    public static void getCharFromString(String s, int idx){
        try {
          char  ch = s.charAt(idx);
            System.out.println(ch);

        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Index asimi ==> "+e.getMessage());
            System.out.println(e.getCause());//null
            e.printStackTrace();
        }
        System.out.println("try catch methd gorev tamamlandi");
    }

}//class
