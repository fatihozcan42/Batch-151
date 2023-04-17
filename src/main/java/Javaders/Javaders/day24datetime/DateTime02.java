package Javaders.Javaders.day24datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime02 {
    public static void main(String[] args) {

        //anlik zaman nasil alinir
        LocalTime myCurrentTime = LocalTime.now();
        System.out.println(myCurrentTime);//12:35:24.082720

        //anlik zaman bilesenleri nasil alinir.
        int hour = myCurrentTime.getHour();
        System.out.println(hour);//12

        int minute = myCurrentTime.getMinute();
        System.out.println(minute);//35

        int second = myCurrentTime.getSecond();
        System.out.println(second);//24

        int nanoSecond = myCurrentTime.getNano();
        System.out.println(nanoSecond);//595747000

        //gelecek ve gecmis zamana nasil gidilir.
        LocalTime next = myCurrentTime.plusMinutes(10).minusHours(1);
        System.out.println(next);

        // Zaman format'i nasil degistirilir.
        // DateTimeFormatter.ofPattern(); format'i kullanarak degistirilebilir.

        /* DateTime Class'ta kullanilan tarih saat formatlari?
        HH : mm ==> 24'lu saat sistemi
        hh : mm ==> 12'li saat sistemi AM PM gosterilmez
        hh : mm a==> 12'li saat sistemi AM PM gosterilir.
        hh : mm : ss a==> saniyeyi gosterir.
        HH : MM ==> yanlis formattir MM aylar icin kullanilir. mm minute demektir.

        dd-MM-yyyy ==> gun-ay-yil / MM rakamsal verir.
        MMM ==> ayin ilk uc harfini verir.
        MMMM ==> ttum harfleri verir.
         7)"dd" : "MM" : "yyyy" gun - ay - yil
         8)"MMM" Aug olarak bize verecektir
         9)"MMMM" August olarak bize verecektir
        10)"yy" 23 seklinde bize verir

         */
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("hh:mm:ss a");
        String formattedMyCurrenttime = dtf1.format(LocalTime.now());
        System.out.println(formattedMyCurrenttime);//01:04:09 ÖS

        LocalDate myCurrentDate = LocalDate.of(2023, 8, 25);
        System.out.println(myCurrentDate);//2023-08-25


        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formatedMyCurrentDate = dtf2.format(myCurrentDate);
        System.out.println(formatedMyCurrentDate);//08/25/2023

        //Taarihi gun/ay ilk uc harfi verecek sekilde yaziniz  25/Aug/23
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MMM/yy");
        String formatedMyCurrentDate3 = dtf3.format(myCurrentDate);//25/Ağu/23

        System.out.println(formatedMyCurrentDate3);

        //Tarihi 25/Agustos/2023 seklinde yaziniz?
        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        String formatedMyCurrentDate4 = dtf4.format(myCurrentDate);
        System.out.println(formatedMyCurrentDate4);//25/Ağustos/2023

        //Baska bir zaman dilimindedeki tarih ve zaman nasil aliriz?
        //Tokyo'da ayin kaci?
        LocalDate dateInTokyo = LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(dateInTokyo);//2023-03-21

        LocalTime timeInTokyo = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(timeInTokyo);

        // Amstedam'da tarih ve saat kac?
        LocalDate dateInAmsterdam = LocalDate.now(ZoneId.of("Europe/Amsterdam"));
        System.out.println(dateInAmsterdam);//2023-03-21

        LocalTime timeInAmsterdam = LocalTime.now(ZoneId.of("Europe/Amsterdam"));
        System.out.println(timeInAmsterdam);







    }//main
}//class
