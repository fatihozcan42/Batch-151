package Javaders.Javaders.day34exceptionsNIGHT;

public class E02 {
    public static void main(String[] args) {

        String a[] = {"A", "V", "A", "J"};
        System.out.println(getElement(a, 3));
        System.out.println(getElement(a, 1));
        System.out.println(getElement(a, 4));
        System.out.println(getElement(a, 2));
        System.out.println(getElement(a, 6));

    }//main

    //Bir String Array'den istenilen bir elemani eleman sirasiyla alan method olusturunuz.
    public static String getElement(String[] a, int numOfElement) {
        String result = "";
        try {
            result = a[numOfElement - 1];
        } catch (ArrayIndexOutOfBoundsException e) {////ArrayIndexOutOfBoundsException array islemlerinde olmayan index kullandiginizda atilir
            if (numOfElement - 1 < 0) {
                result = a[0];
            } else {
                result = a[a.length - 1];
            }

        }
        return result;
    }


}//class
