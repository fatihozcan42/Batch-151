package Javaders.Javaders.day21datetimeNIGHT;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime01 {
    public static void main(String[] args) {
        // anlik zamani nasil aliriz?
        LocalTime myCurrentTime = LocalTime.now();
        System.out.println(myCurrentTime);//21:04:25.135322

        // anlik zamanda bilesenler nasil alinir?
        int hour = myCurrentTime.getHour();
        System.out.println(hour);

        int minute = myCurrentTime.getMinute();
        System.out.println(minute);

        int second = myCurrentTime.getSecond();
        System.out.println(second);

        int nano = myCurrentTime.getNano();
        System.out.println(nano);

        // gelecek ve gecmis zaman nasil gidilir?
        LocalTime next = myCurrentTime.plusMinutes(23).minusSeconds(11);
        System.out.println(next);

        //Zaman formati nasil degistirilir?

        //"hh:mm a" 'a' ifadesi os ve oo yazilmasini saglar.
        //"ss" saniyeyi gosterir.
        //"mm" 'minute'; 'MM' 'month' demektir.

        DateTimeFormatter Dtf1 = DateTimeFormatter.ofPattern("hh:mm a");//Kucuk h onikilik saati kulanir.
        String formattedMyCurrentTime = Dtf1.format(myCurrentTime);
        System.out.println(formattedMyCurrentTime);

        //Date formati nasil degistirilir.
        LocalDate myCurrentDate = LocalDate.of(2022,8,25);
        System.out.println(myCurrentDate);//2022-08-25

        //Tarihi ay gun yil sekline cevriniz?
        DateTimeFormatter Dtf2 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formettedMyCurrentDate1 = Dtf2.format(myCurrentDate);
        System.out.println(formettedMyCurrentDate1);//08/25/2022

        //Tarihi gun ay isminin ilk uc harfi ve yil sekline veciriniz.// 25/aug/22

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MMM/yy");
        String formettedMyCurrentDate2 = dtf3.format(myCurrentDate);
        System.out.println(formettedMyCurrentDate2);

        //Tarihi gun/ay ismi/yil seklinde yaaziniz?// 25/Agustos/2022
        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        String formattedMyCurrentDate3 = dtf4.format(myCurrentDate);
        System.out.println(formattedMyCurrentDate3);

        //baska bir zaman dilimindeki tarih ve zamani nasil aliriz?
        //Tokyo da ayin kaci?
       LocalDate dateInTokyo =  LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(dateInTokyo);//2023-03-17

       LocalDate dateInTashkent =  LocalDate.now(ZoneId.of("Asia/Tashkent"));
        System.out.println(dateInTashkent);

        //Tokyada saat kac?
        LocalTime timeInTokyo = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(timeInTokyo);

        //Koln de saat kac?

        LocalTime timeOfBerlin = LocalTime.now(ZoneId.of("Europe/Berlin"));
        System.out.println(timeOfBerlin);





    }//main
}//Class
