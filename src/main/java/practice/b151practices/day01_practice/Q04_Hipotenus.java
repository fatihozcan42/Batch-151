package practice.b151practices.day01_practice;

public class Q04_Hipotenus {


    public static void main(String[] args) {

        //Hipotenüs hesaplayan bir kod yazınız
        System.out.println(hipotenuzHesapla(5, 12));
    }

    public static double hipotenuzHesapla(double dikKenar1, double dikkenar2) {

        return Math.sqrt(dikKenar1 * dikKenar1 + dikkenar2 * dikkenar2);


    }

}
