package Javaders.Javaders.day12switchloops;

public class Loops01 {
    public static void main(String[] args) {
        //Example 1 : Ekrana 5 kere "Hi" yazdiriniz

        //1.Yol Tavsiye edilmez

        System.out.println("Hi..");
        System.out.println("Hi..");
        System.out.println("Hi..");
        System.out.println("Hi..");
        System.out.println("Hi..");

        /*
        Code Standarts
        1) Tekrar (Repetition) olmamalidir
        2) Dynamic olmalidir
        3) Tamir(Fix) ve update kolay yapilabilmelidir
         */

        //2. Yol
        //Ayni adimlar tekrar tekrar yapilmasi gerektiginde "Loop" lar kullanilir
        //4 tane loop var; 1) for-loop 2) while-loop 3) do-while loop 4) for-each loop

        //1) for loop
        /*
        for (Baslangic Degeri  ; Loop Calisma sarti   ; Artirma / Eksiltme  ){
            //calisacak kodlar
        }
        */
        // Baslangic deger     Loop Calisma sarti   ; Artirma / Eksiltme

        for (int i = 1;              i <6 ;                  i++) {
            System.out.print("Hi"+ " ");
        }

        //Example 2: 11 den 14'e kadar tum sayilari ekrana yazidiriniz

        for (int i = 10; i <15 ; i++) {
            System.out.println(i);
        }
        //Example 3 : 40 dan 23 e kadar tum cift sayilari ekrana yazdiriniz
        for (int i = 40; i>23 ; i--) {
            if (i % 2 == 0) {
                System.out.print(" " + i);
            }
        }
        System.out.println("");

            //Example 4: 18 den 56 ya kadar tum tek sayilari ekrana yazidiriniz
            for (int j = 18; j <57 ; j++) {
                if (j%2 !=1){
                    System.out.print(" " +j);

                }

            }











    }//main
}//class
