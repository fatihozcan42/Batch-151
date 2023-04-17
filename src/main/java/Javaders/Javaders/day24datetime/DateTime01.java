package Javaders.Javaders.day24datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.util.Scanner;

public class DateTime01 {
    public static void main(String[] args) {

        //icinde bulundugumuz zaman dilimindeko tarihi verir.
        LocalDate myCureentDate = LocalDate.now();
        System.out.println(myCureentDate);//2023-03-21

        //Tarihten istedigimiz bileseni nasil aliriz?
        int monthValue = myCureentDate.getMonthValue();
        System.out.println(monthValue);//3

        int yearValue = myCureentDate.getYear();
        System.out.println(yearValue);//2023

       int dayValue =  myCureentDate.getDayOfMonth();
        System.out.println(dayValue);//21

        //Month bir Enum'dir
        //Enum, java'da sabit degerleri (ay isimleri,gun isimleri, sehir isimleri vb.) depolamak icin kullanilir.
        Month monthName = myCureentDate.getMonth();
        System.out.println(monthName);//MARCH

        DayOfWeek dayName = myCureentDate.getDayOfWeek();
        System.out.println(dayName);//TUESDAY

        //ileriki tarihlere nasil gidilir.
        LocalDate newDate = myCureentDate.plusDays(13).plusMonths(1).plusYears(2);//2025-05-03
        System.out.println(newDate);

        //gecmis tarihe nasil gidilir?
        System.out.println(newDate.minusDays(12).minusYears(2).minusMonths(1));//2023-03-20

        //spesifik bir tarih objesi nasil olusturulur.
        LocalDate date1 = LocalDate.of(1980,8,10);
        System.out.println(date1);
        LocalDate date12 = LocalDate.of(1985,7,19);

        //bir tarihin baska bir tarihten sonra olup olmadigini nasil kontrol ederiz?
        boolean result1 = date1.isAfter(date12);
        System.out.println(result1);//false

        boolean result2 = date1.isBefore(date12);
        System.out.println(result2);//true

       boolean result3 =  date1.isEqual(date12);
        System.out.println(result3);//false

        //Example 1: Kullanicidan aldiginiz tarih gecmise ait ise "Gecersiz tarih girdiniz" mesaji veriniz
        //Kullanicidan aldiginiz tarih gelecege ait ise "Zamani girebilirsiniz" mesaji veriniz

        Scanner input = new Scanner(System.in);
        System.out.println("please enter year, month, and day numbers in the given order");
        int year  = input.nextInt();
        int month = input.nextInt();
        int day   = input.nextInt();

        LocalDate givenDate = LocalDate.of(year,month,day);
        if (givenDate.isBefore(LocalDate.now())){
            System.out.println(givenDate+" Invalid date");
        }else{
            System.out.println("Enter time for the ticket");
        }
        System.out.println("givenDate.lengthOfMonth() = " + givenDate.lengthOfMonth());//31

        //EXAMPLE 2: kullanicinin girdigi tarihin gun ismini bulan kodu yaziniz
        System.out.println("please enter year, month, and day numbers in the given order");
           int y =  input.nextInt();
           int m =  input.nextInt();
           int d =  input.nextInt();

           LocalDate date = LocalDate.of(y,m,d);
        System.out.println("date.getDayOfWeek() = " + date.getDayOfWeek());









    }//main

}//Class
