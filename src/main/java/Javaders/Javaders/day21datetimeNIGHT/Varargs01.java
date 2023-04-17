package Javaders.Javaders.day21datetimeNIGHT;

public class Varargs01 {
    public static void main(String[] args) {
        //EX1: toplama islemini yaptiran method olustur?

        //add methodu cagiralim
        System.out.println(add(5, 3, 6));//14
        System.out.println(add(5, 3));//8
        System.out.println(add());//0

        getInitials("Ali Can" , "Kemal Han" , "Tuncay Cinar" , "Ibrahim Catal");

    }//main
    //asagidaki gibi farkli methodlar olusturarak is yapamayiz.
    //cunku kullanici farkli sayidaki sayilari toplamak istiyebilir.

   // public int add(int a, int b){
   //    return a+b;
  //  }
  //  public int add (int a,int b, int c){
  //      return a+b+c;
   // }
    //Farkli sayidaki paramaetrelerin hepsini kabul eden bir api olusturdu,
    // buna "Varargs" denir.
    // Varargsarkada "Array" yapisini kullanir./
    /*
    Note1: Bir method parantezinde borden fazla "Varargs"kullanilamaz.
    Note2: Bir method parantezinde birden fazla parametre kullanilcaksa "Varargs" en sonda olmalidir.
    NOTE3:
     */


    public static int add(int... a){
        int sum=0;
        for (int w : a) {
            sum = sum+w;
        }
        return sum;
    }

    // EX2:verilen isimlerinin ilk harflerini methodu yazdiran methodu olusturunuz?

    public static void getInitials(String... s){
        String initials = "";
        for (String w: s) {
            initials = initials+w.charAt(0)+w.split("")[1].charAt(0);
            System.out.println(initials);
            initials = "";
        }

    }

}//Class
