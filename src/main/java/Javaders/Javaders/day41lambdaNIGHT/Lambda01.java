package Javaders.Javaders.day41lambdaNIGHT;

import java.util.ArrayList;
import java.util.List;

public class Lambda01 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(8);
        nums.add(9);
        nums.add(7);
        nums.add(-4);
        nums.add(9);
        nums.add(2);
        nums.add(4);
        nums.add(6);
        nums.add(15);
        System.out.println(getTheSumSquareOfOdds1(nums));
        System.out.println(getTheSumSquareOfOdds2(nums));
        System.out.println(getMuultiplicationOfSquareOfEvens(nums));
        System.out.println(getTheSumOfEventsMaxAndOddMin(nums));
        System.out.println(getTheSumOfEventLessThanSevenAndOddMinGraterThanEight(nums));

    }//main

    //EX: verilen bir List'teki tek sayi olan elmanlarin kareleri toplamini hesaplayan method olusturunuz.
    public static int getTheSumSquareOfOdds1(List<Integer> nums) {
        return nums.
                stream().
                filter(t -> t % 2 != 0).
                map(t -> t * t).
                reduce(0, (t, u) -> t + u);

    }

    public static int getTheSumSquareOfOdds2(List<Integer> nums) {
        return nums.
                stream().
                filter(Utils::isOdd).
                map(Utils::getSquare).//Ihtiyacimiz olan method Java Class'larinda yoksa Utils Class olusturup icine
                                        //ihtiyacimiz olan method'u olusturunuz ve method reference kullaniniz
                reduce(0, Math::addExact);//Class ismi :: Method Ismi ==> Method Referance denir.

    }

    public static int getTheSumSquareOfOdds3(List<Integer> nums) {
        return nums.
                stream().
                filter(Utils::isOdd).
                map(t -> t * t).
                reduce(Math::addExact).//Class ismi :: Method Ismi ==> Method Referance denir.
                        get();//get() method'u Optinal<Integer>'i int'e cevirir.

    }

    //Verilen bir List'teki cift sayi olan elemanlarin tekrarsiz olarak kareleeri carpimini hesaplayan method olusturunuz.
    public static int getMuultiplicationOfSquareOfEvens(List<Integer> nums) {
        return nums.
                stream().
                filter(t -> t % 2 == 0).
                map(t -> t * t).
                distinct().
                reduce(1, (t, u) -> t * u);
    }

    //Example 3: Verilen bir list'teki cift sayi olan elemanlarin maximum degeri ile tek sayi olan elemanlarin minimum degerinin
    //           toplamini hesaplayan method'u olusturunuz
    public static int getTheSumOfEventsMaxAndOddMin(List<Integer> nums) {
        int maxEven = nums.
                stream().
                distinct().
                filter(t -> t % 2 == 0).
                reduce((t, u) -> t > u ? t : u).get();
        int minOdd = nums.
                stream().
                distinct().
                filter(t -> t % 2 != 0).
                reduce((t, u) -> t < u ? t : u).get();
        return maxEven + minOdd;
    }

    //Example 4: Verilen bir list'teki cift sayi olan elemanlarin 7 den kucuk maximum degeri ile tek sayi olan elemanlarin
    //      8 den buyuk minimum degerinin toplamini hesaplayan method'u olusturunuz.
    public static int getTheSumOfEventLessThanSevenAndOddMinGraterThanEight(List<Integer> nums) {
        int max = nums.
                stream().
                distinct().
                filter((t -> t % 2 == 0 && t < 7)).
                reduce((t, u) -> t > u ? t : u).get();
        int min = nums.
                stream().
                distinct().
                filter((t -> t % 2 != 0 && t > 8)).
                reduce((t, u) -> t < u ? t : u).get();

        return max + max;
    }


}//class
