package Javaders.Javaders.day36exceptions;

public class E03 {
    public static void main(String[] args) {
        Object obj = 13;
        try{
            String str = (String) obj;
            System.out.println(str);
        }catch (ClassCastException e){
            System.err.println("Her data type her data type'a cevrilemez");
            //hata mesajini renkli olarak verir.
            //hataya dair mesajin okunabilirligini artirmak icin System.err.println() kullanilabilir
            //ayrica bu sekilde yazdirdigimizda java error mesajlarini ayri bir yerde depolar.
        }


        //Birbirine donusturulemeyen data type'larini donusturmekte israr ederseniz java "ClassCastException" atar.
        //
    }//main
}//class
