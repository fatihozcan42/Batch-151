package Javaders.Javaders.day03methodcreationscanner;

import java.util.Scanner;

public class C01_kullanicidanDataAlma {
    public static void main(String[] args) {

        //Kullanicidan aldiginiz
    // character ile asagidaki gibi bir gorunum olusturunuz
    /*
          A
         A A
        A A A
    */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz.");

       char ch =  input.next().charAt(0);//talip
        System.out.println("  "+ch+"  ");//bes karakter
        System.out.println(" "+ch+" "+ch+" ");//bes karakter
        System.out.println(ch+" "+ch+" "+ch);//beş karaekter

        // sadece char data tipi icin nextChar() adinda bir method olmadigi icin
        // kullanicidan bir data alip ch konteynerine yerlestirmak icin next().charAt(0) methodunu kullanibilir.

        // Aralarında bir tab boşluk bırakarak tek sout ile aynı şekli yazalım.
        System.out.println("\t\t"+ch+"\t\t\n\t"+ch+"\t\t"+ch+"\t\n"+ch+"\t\t"+ch+"\t\t"+ch);



    }//mmain

}//Class
