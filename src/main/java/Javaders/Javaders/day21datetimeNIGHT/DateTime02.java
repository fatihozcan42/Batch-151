package Javaders.Javaders.day21datetimeNIGHT;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime02 {
    public static void main(String[] args) {

        LocalDateTime ldt = LocalDateTime.now();

        System.out.println(ldt);

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("MM/dd/yyyy - hh:mm a");
        String formettedLdt = dtf1.format(ldt);
        System.out.println(formettedLdt);//03/16/2023 - 10:08 ÖS


    }//main
}//class
