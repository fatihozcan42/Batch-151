package Javaders.Javaders.day24datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime03 {
    public static void main(String[] args) {

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MMMM/yy - hh:mm a");
        String formatedLdt = dtf.format(ldt);
        System.out.println(formatedLdt);                   //21/Mart/23 - 01:47 ÖS

    }//main
}//Class
