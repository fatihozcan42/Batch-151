package practice.b151practices.day01_practice;

public class Q01_variables {

    public static void main(String[] args) {

        // variable başlatın.1 Data type + ismi + = değer
        int age = 25;
        int number = 55;
        String isim = "ali";

        System.out.println(age);
        System.out.println("number = " + number);
        System.out.println("isim = " + isim);
        System.out.println(isim);

        //Variable değerini kopyala.
        int hisAge = age;
        System.out.println("hisAge = " + hisAge);
        String onunIsmi = isim;
        System.out.println("onunIsmi = " + onunIsmi);

        //Aynı satırda çoklu variable deklere et.
        int year = 2022, month = 3, day = 15;
        System.out.println("day = " + day);
        System.out.println("year = " + year);

        //Bir variable değerini güncelle.
        year = 2023;
        System.out.println("year = " + year);


        // Bir variable deklere et: x
        double x;
        //Bir variable başlat.
        int y = 25;

        double z = 43;

        //x değişkenini ye değişkenini ile değiştir.
        x = y;
        // x değikenini güncelle.
        x = 3.14;
        // değişkenleri yazdır.
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);


    }


}
