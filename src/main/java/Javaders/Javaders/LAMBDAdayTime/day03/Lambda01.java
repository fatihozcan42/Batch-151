package Javaders.Javaders.LAMBDAdayTime.day03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {
        List<String> iller = new ArrayList<>(Arrays.asList("Van", "Hatay", "Edirne", "Gaziantep",
                "Eskisehir", "Ordu", "MUS", "MUS", "Nevsehir"));

        //System.out.println(karakterSayisi5tenFazlaElSil(iller));
        //System.out.println(hIleBaslayanYadaUIleBitenElSil(iller));
        System.out.println(karakterSayilarininKareleri(iller));
        System.out.println(karakterSayisiCiftEl(iller));


    }//main

    // 4) Karakter sayisi 5 ten fazla olan elemanlari siliniz
    public static List<String> karakterSayisi5tenFazlaElSil(List<String> iller) {
        System.out.println("4) ");

        iller.removeIf(t -> t.length() > 5);
        return iller;
    }
    ////////////////////// ************************************************\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
    // 5)"H" ile baslayan veya "u" ile biten elemanlari siliniz

    public static List<String> hIleBaslayanYadaUIleBitenElSil(List<String> iller) {
        System.out.println("5) ");
        iller.
                removeIf(t -> t.startsWith("H") || t.endsWith("u"));
        return iller;
    }

    ////////////////////// ************************************************\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
    // 6) List elemanlarini karakter sayilarinin karelerini aliniz Ve bir list olarak ekrana yazdirin
    public static List<Integer> karakterSayilarininKareleri(List<String> iller) {
        System.out.println("6) ");
        return iller.
                stream().
                map(Utils::karesiniAl). //Bu yapiya method referance denir.
                                        //Bu yapiya ise map(t -> t.length() * t.length()).//lambda expressiom
                collect(Collectors.toList());
    }

    ////////////////////// ************************************************ \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
    //  7) List elemanlarindan karakter sayisi cift sayi olanlari bir list icinde ekrana yazdiriniz.


    public static List<String> karakterSayisiCiftEl(List<String> iller){
        System.out.println("7) ");
        return iller.
                stream().
                filter(Utils::CiftMi).
                collect(Collectors.toList());
}

}//class
