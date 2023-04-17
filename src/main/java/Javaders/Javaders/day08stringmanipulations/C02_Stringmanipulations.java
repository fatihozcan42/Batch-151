package Javaders.Javaders.day08stringmanipulations;

public class C02_Stringmanipulations {
    public static void main(String[] args) {

           /* ********** replaceFirst ********
           replace () ayni isi yapıyor ancak ilk gordugu datayi degistiriyor.

            */

            String str = "            Hayirli olsunda          ";

            String str1 = str.replaceFirst("a", "e");
            System.out.println("str1 = " + str1);

            /*  ******* trim () ********

            trim () bir String'in basinda ve sonundaki boşluklari siler, aradaki spacelere dokunmaz.

             */

            String str2 = "       Ali CAn     ";

            String strTrim = str2.trim();
            System.out.println("strTrim" + str2);

            // EX: asağıda fiyati verilen urunlerin toplam fiyatini bulunuz.
            // String tv: 599.99$ String laptop: 299.99$

            String tv = "599.99$";
            String laptop = "299.99$";

            String tv2 = tv.replace("$", ""); // hala String bir datadir.
            System.out.println("tv2 = " + tv2);

            String laptop2 = laptop.replace("$", ""); // hala String bir datadir.
            System.out.println("laptop2 = " + laptop2);

            System.out.println(tv2 + laptop2);// String data olduğu için + isareti 599.99299.99'u concatination yaptı.

            Double totalPrice = Double.valueOf(tv2) + Double.valueOf(laptop2);
            System.out.println("Total Price = " + totalPrice);

        /*
        valueof metodu String olan datayı bize sayi haline getirir.
         */
            //EX: Verilen ismin ilk isminin ilk harfini ve soyisminin ilk harfini yazdiriniz.

            String tamIsim = "  mehmet fatih  "; //==> MF
            char first = tamIsim.trim().toUpperCase().charAt(0);//M

            char second = tamIsim.trim().toUpperCase().split(" ")[1].charAt(0);//F
            System.out.println("first+second = " + first + second);

            String str3="  mehmet fatih yildirim";

            char first2 = tamIsim.trim().toUpperCase().charAt(0);

            char second2 = tamIsim.trim().toUpperCase().split(" ")[1].charAt(0);

            char third = str3.trim().toUpperCase().split(" ")[2].charAt(0);

            System.out.println(" Ilk harf son harf: "+first2+second2+third);//MFY



    }//main
}//class
