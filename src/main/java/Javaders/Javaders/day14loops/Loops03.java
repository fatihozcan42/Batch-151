package Javaders.Javaders.day14loops;

import java.util.Scanner;

public class Loops03 {
    public static void main(String[] args) {
        //while loop
        int i = 1;

        while (i<1){//While loop da loop body'sinin hic calismamasi mimkundur.(Zero execution is possible)
            System.out.println("While loop");

            i++;
        }
        //do-while-loop en az b'r kez calistirir.
        int k=1;

        do {
            System.out.println("do-while loop");
            k++;
        }while (k<1);

        //Kullanici bir sayi girsin, sayi 100 den kucuk ise kullanici "Kazandiniz" mesaji alsin
        //diger durumlarda "Kaybettiniz" mesaji alsin


        Scanner input = new Scanner(System.in);


        do {// do-while loop'da loop body'si en az bir kere calisir.
            System.out.println("Please enter an integer");
            int number = input.nextInt();
            if (number<100){
                System.out.println("Won!");

            }else{
                System.out.println("Lost");
                break;
            }

        }while (true);

        //Kullanicidan alinan bir cumlenin buyuk harfle baslayip nokta ile bittigini kontrol eden kodu yaziniz.

        do {
            System.out.println("Please enter a word");
            String s = input.next();

            if (s.endsWith(".")&&(s.charAt(0)>='A'&& s.charAt(0)<='Z')){
                System.out.println("Your sentence is correct gramatically");

            }else{
                System.out.println("Your sentence has gramatical mistake");
                break;
            }

        }while (true);
















    }//main
}//class
