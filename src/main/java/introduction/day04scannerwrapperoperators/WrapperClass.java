package introduction.day04scannerwrapperoperators;

public class WrapperClass {

    public static void main(String[] args) {
        //primitive      : char     -  boolean   - byte-   short-     int     -long   -float   -double
        // Wrapper Class : Character-  Boolean-   Byte -   Short -    Integer  Long   -Float  - Double
        //Wrapper Class'lar non-primitive'dir. o yüzden memory'de çok yer kaplar.
        //Şart değilse wrapper kullanmayı tercih etmeyiz.

        int n = 12;  //"n" yazip "nokta" koyarsaniz hic method goremezsiniz, çünkü Primitive'ler method içrmez.

        Integer m = 12; //"m" yazip "nokta" koyarsaniz bircok method gorebilirsiniz, cunku wrapper class lar method icerir.

        byte p = 13;

        Byte r = 13;
        // ÖRNEK 1: short data type'nin min ve max değerlerini kod yazarak bulun.
       short maxShort =  Short.MAX_VALUE;
        System.out.println("maxShort = " + maxShort);
        short minShort = Short.MIN_VALUE;
        System.out.println("minShort = " + minShort);

       // ÖRNEK2: int data type min ile byte data type max değerleri topla.

       int minInt = Integer.MIN_VALUE;
       byte maxByte = Byte.MAX_VALUE;
        System.out.println(minInt+maxByte);

        // ÖRNEK: 3) i: Primitive int'i wrapper Integer'a çeviriniz.

        int num = 13;
        Integer wrapperNum = num ; // Bu işleme AUTOBOXING denir.

                 // ii) Wrapper Bye ı primitive byte çeviriniz.

        Byte k = 33 ;
        byte primitiveK = k ; // Bu işlemede UNBOXING denir.


        // ÖRNEK4: i) primitive char'ı Wrapper Character'e çeviriniz. (Autoboxing)

        char initial =  'T';
        Character initialWrapper = initial ;

        // ii) Wrapper boolean'ı primitive boolean'a çeviriniz. (Unboxing)
         Boolean isOld = true ;
         boolean isOldPr = isOld;


    }

}
