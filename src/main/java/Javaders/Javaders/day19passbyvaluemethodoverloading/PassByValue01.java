package Javaders.Javaders.day19passbyvaluemethodoverloading;

public class PassByValue01 {
    public static void main(String[] args) {
        /*
        Pass by value
        1) Java Pass by Value kullanir.
        2) yani; java method larin orjinal degeri degistirmesine musaade etmez
        3) java methodlara deger yollarken orjinal degerin kopyasini olusturur ve o kopyayi methoda a yollar
            Method kopya deger uzerinde degisiklik yapar, boylece orjinal deger korunmus olur
        4)Java esnek bir dildir, Istersek yazdigimiz kod ile  orjinal degerin degismesini temin edebiliriz
        bakiniz line 24:

        Pass By Reference :
        1) Pass by reference da methoda reference yollanir
        2) Reference adres demektir. Adres yollaninca method adresi kullanarak orjinal degere ulasir ve orjinal degeri degistirir
            Bu yüzden C# C++ gibi Pass by reference kullanan dillerde method variable orjinal degerini degisitirir


         */


        int shirtPrice = 100;

        System.out.println("shirtPrice = " +shirtPrice);//100
        // Burada pass by value sayesinde shirtprice degeri koruma altina alinir.

        int studentShirtPrice =  discount ("student",shirtPrice);

        System.out.println("StudentShirtPrice = "+ studentShirtPrice);//90
        // methoda gonderirken degeri degil kopyasini gonderir ve degisen deger kopyasi olur.

        System.out.println("shirtPrice = " +shirtPrice);//100

        shirtPrice = discount("senior", shirtPrice);// senior iken shirtPrice i yeni deger olarak 95 yaptik
        System.out.println("shirtPricee = "  + shirtPrice);

    }//main

    public static int discount(String type, int shirtPrice) {
        switch (type) {
            case "student":
                shirtPrice = shirtPrice - 10;
                break;
            case "veteran":
                shirtPrice = shirtPrice - 20;
                break;
            case "senior":
                shirtPrice = shirtPrice - 5;
                break;
            default:
                shirtPrice = shirtPrice;
        }
            return shirtPrice;
    }


}//Class