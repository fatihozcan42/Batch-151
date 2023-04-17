package Javaders.Javaders.day42lambda;

import Javaders.Javaders.day41lambdaNIGHT.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Lambda02 {
    public static void main(String[] args) {
        System.out.println(getSumInTheGivenRange(10, 7));

        System.out.println(getMultiplicationInTheGivenRange(7, 10));

        System.out.println(getSumOfDigitsInTheGivenRange(45, 47));

    }//main

    //Swap icin bir tane private mm]ethod oustur.******
    private static List<Integer> swap(int starting, int ending){
        List<Integer> list = new ArrayList<>();
        if(starting>ending){
            starting = starting + ending;
            ending = starting - ending;
            starting = starting - ending;
        }
        list.add(starting);
        list.add(ending);
        return list;
    }

    // Ex 1: 7'den 10'a kadar tamsayilarin toplamini hesaplayan methodu olusturunuz.
    public static int getSumInTheGivenRange(int starting, int ending) {
        List<Integer> list = swap(starting, ending);
        return IntStream.rangeClosed(starting, ending).sum();
    }

    // EX 2: 7'den 10'a kadar tamsayilarin carpimiin hesaplayan methodu olusturunuz.
    public static int getMultiplicationInTheGivenRange(int starting, int ending) {
        List<Integer> list = swap(starting, ending);

        return IntStream.rangeClosed(starting, ending).reduce(Math::multiplyExact).getAsInt();
    }
    // EX 2: 45'den 47'a kadar tamsayilarin rakamlari toplayan  methodu olusturunuz.
    // 45 46 47 4+5+4+6+4+7=30

    public static int getSumOfDigitsInTheGivenRange(int starting, int ending) {
        List<Integer> list = swap(starting, ending);

        return IntStream.rangeClosed(starting, ending).map(Utils::getSumOfDigit).sum();
    }


}//class
