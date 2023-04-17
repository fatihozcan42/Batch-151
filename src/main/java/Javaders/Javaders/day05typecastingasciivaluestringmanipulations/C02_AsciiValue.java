package Javaders.Javaders.day05typecastingasciivaluestringmanipulations;

public class C02_AsciiValue {

    public static void main(String[] args) {
        /*
         Javada char data type'ini matematiksel islemlerde kullanirsaniz
        Ascii table'daki sayisakl degerleri alir.
        */

        // Numeric data tayplar byte-short-int-long-float-double
        //char karakterin hem sayısal deger barındırır+ hemde resim karakteri barındırır
        //boolean ıse ==>numeric olmayan data type'idir
        // Java'da char data type'ne int değerde atanabilir.sembol, harf vs. de atanabilir.
        // çünkü char data type'nin Ascii'den gelen bir sayisal == numeric değeri birde resim karakteri vardır.


        // 'A' harfinin Ascii değerini hesaplatan kodu yazınız.

        int asciiA = 'A';
        System.out.println("asciiA = " + asciiA);//65

        int asciia = 'a';
        System.out.println("asciia = " + asciia);//97

        int asciiUnlem = '!';
        System.out.println("asciiUnlem = " + asciiUnlem);

        int asciiSpace = ' ';
        System.out.println("asciiSpace = " + asciiSpace);

        int asciiSembol = '*';
        System.out.println("asciiSembol = " + asciiSembol);

        char ch ='Z';
        char sembol = '*';



        int deger = 20;
        char smbl = '$';
        System.out.println(deger+smbl);// 20 +36 = 56

        int asciiSmbl = '$';
        System.out.println("asciiSmbl = " + asciiSmbl);  //36

        int deger2 = 0;
        char smbl2=  '+';
        System.out.println("deger2+smbl2= " + deger2+smbl2);//   0+
        System.out.println("deger2+smbl2= " + (deger2+smbl2));// 43

        String name = "123";
        int number = 45;

        System.out.println(name+number);//12345 Concatination uc uca ekleme yan yana yazar.

        int asciiG = 'G';
        System.out.println("asciiG = " + asciiG); //ascii değer 71

        String str1 = "java";
        char ch3 = 'G';
        int sayi1 = 5;

        System.out.println(str1+ch3+sayi1);//JavaG5
        System.out.println(str1+(ch3+sayi1));// Java76

        System.out.println(ch3+sayi1+str1);//76java 'G'nin ascii degerini beşi ile toplar >> 71+5=76 76java


        String sayiStr ="123";
        String sayiStr2 = "45";
        System.out.println(sayiStr+sayiStr2);

        char rakam1 = '1';
        System.out.println("rakam1 = " + rakam1);

        char rakam2 = '2';
        System.out.println("rakam2 = " + rakam2);

        char rakam3 = '3';
        System.out.println("rakam3 = " + rakam3);

        char rakam4 = '4';
        System.out.println("rakam4 = " + rakam4);

        System.out.println("rakam1+rakam2+rakam3+rakam4="+rakam1+rakam2+rakam3+rakam4); //Burada concat yaptık.
        System.out.println("rakam1+rakam2+rakam3+rakam4="+(rakam1+rakam2+rakam3+rakam4)); // 202

        // 1==> Ascii 49 2 ==> 50 3 ==> 51 4 ==> 52 ==>


        System.out.println("rakam4 = " + (rakam4+25));
        System.out.println("rakam4 = " + rakam4);



       //       ******** Asccii değerlerinden faydalanarak neler yapılabilir.*****

        byte b = 5;
        char ch2 = 'h';



        int asciih = 'h';
        System.out.println("asciih = " + asciih);// 104
        int ascii5 = '5';
        System.out.println("ascii5 = " + ascii5);//53


        System.out.println("b>ch2=" + (b>ch2));//false 5 > 104 === False


        long l = 542168784578L;
        System.out.println((ch2>l)); //False

        float f = 2.456648F;
        double d = 2.19658;
        System.out.println("f>d="+ (f>d));//true

        System.out.println("b<f= "+ (b<f));//false

        byte sayi6 = 6;
        byte sayi7 = 7;
        System.out.println("sayi6<sayi7 = " + (sayi6<sayi7));//true


        int sayiInt = 200;
        long sayiLong = 100L;
        System.out.println("sayiInt==sayiLong = " + (sayiInt==sayiLong));//true

        int sayiInt2 = 200;
        System.out.println("sayiInt>=sayiLong= "+(sayiInt2>=sayiLong));//true

        int sayiInt3= 9 ;
        char sayiChar= '9';
        System.out.println("sayiInt3>=sayiChar= " + (sayiInt3>=sayiChar)); //False



    }
}
