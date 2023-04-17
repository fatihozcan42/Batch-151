package Javaders.Javaders.day09Stringmanipulationsifstatement;

public class C01_StringManipulations {
    public static void main(String[] args) {

        //EX: Bir String'in hiç karakter içerip içermediğini kontrol eden kodu yazınız.

        String str = "";//hiclik
        boolean result1 = str.length() == 0;// Burda JAVA iki islem yapti.1:length methodı 2: ==0
        System.out.println("String Bos Mu? = " + result1);//True

        //2.YOL
        // ********* isEmpty *********
        /*
        isEmpty Methodu String datanin icersinde hiç bir sey yoksa true döndürür.
        Java'da space de bir karakter olduğu için space varsa false döndürür.
         */

        boolean result2 = str.isEmpty();
        System.out.println("String BosMu? = " + result2);// Burda JAVA tek işlem yaptı.

        // Bir String'in datanin space hariç hiçbir karakter icerip icermediğini gösteren
        // kodu yaziniz.

        String t = "  ";

        boolean result3 = t.replace(" ", "").length() == 0;
        System.out.println("result3 t = " + result3);

        // 2.YOL

        boolean result4 = t.replace(" ", "").isEmpty();
        System.out.println("result4 = " + result4);

        //3. YOL
        //*************** isBlank () **************
        /*
        isBlank() methodu space+hiclik ise true döndürür.
        String bir data'nin bos mu dolu mu olduğuna bakar.
        isEmptty'den farkı space varsa true döndürür.
         */
        boolean result5 = t.isBlank();
        System.out.println("result5 = " + result5);

        // *********** indexOf() ********
        /*
        verilen karakter veya karakterlerin ilk görünümünün indexleri toplamını verir.
        int bir değer döndürür.
        coklu data icin kullanıldığında ilk gördüğü data'nin ilk karakterinin index'ini verir.
         */

        //EX: Bir String'te a,i,e karakterlerinin ilk görünümünün index'ler toplamının ekranı yazdırınız.

        String s = "Java is easy to learn";
        int aIdx = s.indexOf('a');
        System.out.println("aIdx = " + aIdx);

        int pIdx = s.indexOf('p');
        System.out.println("pIdx = " + pIdx); // olmayan bir karakterin inde'ini -1 döndürür.

        int iIdx = s.indexOf('i');
        System.out.println("iIdx = " + iIdx);

        int eIdx = s.indexOf('e');
        System.out.println("eIdx = " + eIdx);

        System.out.println("Toplam Index ="+(aIdx+eIdx+iIdx));


        String s2 = "Java is easy to learn to easy to";
        int idx = s2.indexOf("to");
        System.out.println("idxto = " + idx);

        // EX: Bir String'de Java kelimesinin ilk olarak kacıncı index'de olduğunu gösteren
        // kodu yazınız.
        String cumle = "Ah java vah java sen ne güzel seysin java";
        int indexJava = cumle.indexOf("java");
        System.out.println("indexJava = " + indexJava);

        int indexQYX = cumle.indexOf("QTX");
        System.out.println("indexQYX = " + indexQYX);

        // ************** lastIndexOf () *********
        /*
        lastIndexOf () verilen String bir data'da istenilen degerin
        son gorunumun index'ini verir. olmayan index'i -1 döndürür.
         */

        //EX: Bir String'te a,i,e karakterlerinin son görünümünün index'ler toplamının ekranı yazdırınız.

        String c = "Java is easy to learn";

        int aLast = c.lastIndexOf('a');
        System.out.println("aLast = " + aLast);

        int eLast = c.lastIndexOf('e');
        System.out.println("eLast = " + eLast);

        int iLast = c.lastIndexOf('i');
        System.out.println("iLast = " + iLast);

        System.out.println("Toplam a e i : " + (aLast+eLast+iLast));

    }//main

}//class
