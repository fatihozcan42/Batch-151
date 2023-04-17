package Javaders.Javaders.day06typecastingstringmanipulation;

public class TypeCasting {

    public static void main(String[] args) {

        //******* exlicitNarrowing*****
       /*
    Explicit Narrowing yaparken dikkat edilmeli.
    Cunku Cok ciddi Data kaybi hatta Data'nin degismesine neden olabilir.
    Eger donustumeye calistigimiz variable'in sinirlari
    disinda ise Java sayiyi mod islemine alir ve kalani yazdirir.
    Kalan bolenin yarisindan fazlaysa kalan sayiyi Java kucultmek ister ve bolumu 1 buyuterek kalani
    - isaretli olacak sekilde yazdirir
 */
        // short data type'nin de bir variable oluşturun byte data type ine çevirin

        short num = 260;
        byte numByte = (byte) num;
        System.out.println("numByte = " + numByte);//4 ==> 260/256 kalan 4

        short num2 = 1023;
        byte numByte2 = (byte) num2;
        System.out.println("numByte2 = " + numByte2);// -1

        short num3 = 1000;
        byte numByte3 = (byte) num3;
        System.out.println("numByte3 = " + numByte3);// -24

        int intSayi = 8880;
        short  shortSayi = (short) intSayi;
        System.out.println("shortSayi = " + shortSayi);//8880


    }//main
}//Class
