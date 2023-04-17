package practice.b151practices.ssg.arrays;

import java.util.Arrays;

public class C02_arrays {
    public static void main(String[] args) {
        /*
        2.soru bir array olusturun ve
        olusturdugunuz arraydeki sayilari kucukten buyuge siralayin
        */
        int sayilar[]={3,7,5,11,9};
        System.out.println(Arrays.toString(sayilar));
        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));
    }
}

