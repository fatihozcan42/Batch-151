package Javaders.Javaders.day36exceptions;

public class E01 {
    public static void main(String[] args) {
        /*
        *try kisminda birden fazla exception olusturma ihtimali varsa coklu catch kullanabilirisiniz.
        *coklu catch kullandiginizda exception classlar arasinda parent-child iliskisi yoksa catch'lerin sirasi
        *onemli degildir. Ama code'taki siralamaya uymak tavsiye edilir.
        * coklu catch kullandiginizda exception classlar arasinda parent-child iliskisi varsa catch'lerin sirasina dikkat
         etmeliyiz child class uste olmalidir.
         Exception classlar arasinda parent-child iliskisi varsa
                   =>ya child classi uste yazarak child ve parent icin ozellestirilmis codelar yazarsiniz
                   =>yada child i hic kullanmaz sadece parent ile exceptionlari handle etmeye calisirsiniz.
         */

        int a = 12;
        int b = 0;
        String s = "My Java";
        getCharFromString(s,a,b);
    }//main

    public static void getCharFromString (String s, int a, int b) {

        try {
            int idx = a / b;
            char ch = s.charAt(idx);
            System.out.println(ch);
        } catch (ArithmeticException e) {
            System.out.println("DO not divide by zero");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Olmayan index kullandiniz");
        }
    }


}//class
