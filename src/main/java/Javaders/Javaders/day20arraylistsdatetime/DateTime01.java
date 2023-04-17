package Javaders.Javaders.day20arraylistsdatetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class DateTime01 {
    public static void main(String[] args) {
        //Icinde bulundugumuz zaman dilimindeki tarihi nasil aliriz
        LocalDate myCurrentDate = LocalDate.now();
        System.out.println(myCurrentDate);//2023-03-15

        //Tarihten istedigimiz bileseni nasil aliriz?
        int monthValue = myCurrentDate.getMonthValue();
        System.out.println(monthValue);//3

        int yearValue = myCurrentDate.getYear();
        System.out.println(yearValue);//2023

        int dayValue = myCurrentDate.getDayOfMonth();
        System.out.println(dayValue);//15

        //Asagidaki "Month" bir Enum'dir.
        //Enum java'da sabit degerleri(ay isimleri,gun isimleri,ulke isimleri,Samanyolu Galaksisisndeki gezegen isimleri)
        // depolamak icin kullanilir.
        Month monthName = myCurrentDate.getMonth();
        System.out.println(monthName);//MARCH

        //Asagidaki "DayOfWeek" bir Enum 'dir
        DayOfWeek dayName = myCurrentDate.getDayOfWeek();
        System.out.println(dayName);//WEDNESDAY

        //Ileriki tarihe nasil gidilir?
        System.out.println(myCurrentDate.plusDays(5).plusMonths(2).plusYears(4));//2027-05-20

        //Gecmis tarihe nasil gidilir?
        System.out.println(myCurrentDate.minusYears(30).minusMonths(2).minusDays(18));//1992-12-28

        //Specific bir tarih objesi nasil olusturulur?
        LocalDate madDateOfBirth = LocalDate.of(1978, 4, 25);
        LocalDate fatihDateOfBirth = LocalDate.of(1983, 5, 17);

        //Bir tarihin  bir tarihten sonra olup olmadigi nasil kontrol edilir?
        boolean r1 = madDateOfBirth.isAfter(fatihDateOfBirth);
        System.out.println(r1);//false

        //Bir tarihin bir tarihten once olup olmadigi nasil kontrol edilir?
        boolean r2 = fatihDateOfBirth.isBefore(madDateOfBirth);
        System.out.println(r2);//false

        //Bir tarihin bir tarihe esit olup olmadigini nasil kontrol ederiz?
        boolean r3 = madDateOfBirth.isEqual(fatihDateOfBirth);
        System.out.println(r3);//false

        //Example 1: Kullanicidan aldiginiz tarih gecmise ait ise "Gecersiz Tarih Girdiniz"mesaji veriniz.
        //  Kullanicidan aldiginiz tarih gelecege ait ise "Zamani Girebilirsiniz" deyiniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter year,month,and day mumbers in the given order");
        int year = input.nextInt();
        int month = input.nextInt();
        int day = input.nextInt();

        LocalDate givenDate = LocalDate.of(year, month, day);
        if (givenDate.isBefore(LocalDate.now())) {
            System.out.println("invalid date");
        } else {
            System.out.println("Enter time for ticket");
        }

        int lenghtOfMonth = myCurrentDate.lengthOfMonth();
        System.out.println(lenghtOfMonth);//31

        //Example2: Kullanicinin girdigi tarihin gun isimini bulan kod yaziniz

        System.out.println("Please enter year,month,and day mumbers in the given order");
        int y = input.nextInt();
        int m = input.nextInt();
        int d = input.nextInt();

        LocalDate date = LocalDate.of(y, m, d);
        System.out.println(date.getDayOfWeek());//TUESDAY



    }//main
}//class
