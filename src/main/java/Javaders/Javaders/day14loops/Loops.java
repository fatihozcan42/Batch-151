package Javaders.Javaders.day14loops;

public class Loops {
    public static void main(String[] args) {

        //Verilen bir String'de kucuk harfleri console'a yazmayiniz
        //"Pwd12?Ab" ==> P12?A

        String s = "Pwd12?Ab";

        for (int i = 0; i <s.length() ; i++) {//fori kisa yol dogrudan if yapisini verir.

            char ch = s.charAt(i);

             if (ch>='a' && ch<='z'){
                 continue;
             }else {
                 System.out.print(ch);
             }
        }
        /*
        break ile continue arasundaki fark nedir?
        1) break switch in disina cikmak icin loopu kirmak icin kullanilir
        2) continue ise loop calisirken bazi elemanlari isleme sokmamak icin kullanilir.
         */
        System.out.println();

        //Bir String'i ters ceviren kodu yaziniz
        //"Java" ==> "avaJ"

        //1.yol
        String t = "Java";
        String ters = "";

        for (int i = t.length()-1; i >=0; i--) {

        ters = ters + t.substring(i,i+1);

        }
        System.out.println(t);
        System.out.println(ters);

        //2.yol
        String u = "Java";
        String ters2 = "";

        for (int i = t.length()-1; i >=0; i--) {

            ters2 = ters2 + u.charAt(i);

        }
        System.out.println(u);
        System.out.println(ters2);

        //Bir tamsayinin rakamlarinin toplamini veren kodu yaziniz
        //578 ==> 5+7+8 = 20

        int num = -578;
        int sum = 0;
        num = Math.abs(num);

        for (int i = num ; i >0;  i=i/10) {

            sum = sum + i%10;

        }
        System.out.println(sum);

















    }//main
}//class
