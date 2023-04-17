package Javaders.Javaders.day22stringbuilder;

public class Sb02 {

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Java is easy");

        System.out.println(sb1);

        sb1.reverse();//String cevrilmesi loop'lar da yapilir.
        System.out.println("sb1.reverse() = " + sb1);//ysae si avaJ

        sb1.deleteCharAt(6);
        System.out.println(sb1);//ysae s avaJ

        sb1.delete(4, 7);//baslangic indexínden (dahil) bitis indexíne kadar (haric) kadar olan characterleri siler.
        System.out.println(sb1);//ysaeavaJ

        sb1.replace(2, 5, "X");//2 dahil 5 haric ==> index 2, 3, 4, deki characterlerin yerine 'X' yazar.
        System.out.println(sb1);//ysXvaJ

        sb1.insert(3, "2023");
        System.out.println(sb1);//ysX2023vaJ


        StringBuilder sb2 = new StringBuilder("Java");
        StringBuilder sb3 = new StringBuilder("Lava");

        int r1 = sb2.compareTo(sb3);
        System.out.println(r1); //0 ==> alfabetik olarak ayni siradalar demektir.
                                //Sonuc mesela -3 ise sb2, sb3 den alfabetik olarak 3 onde demektir.
                                //Sonuc mesela 3 ise sb2, sb3 den alfabetik olarak 3 sonra demektir.

        //StringBuilder nasil String'e cevrilir.
        String str = sb2.toString().toUpperCase();
        System.out.println(str);//JAVA

        //String nasil StringBuilder'a cevrilir.
        StringBuilder newSb1 = new StringBuilder(str);
        System.out.println("newSb1 = " + newSb1);

    }//Main

}//Class
