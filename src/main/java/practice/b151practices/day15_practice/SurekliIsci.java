package practice.b151practices.day15_practice;

public class SurekliIsci extends Isci {
    @Override
    public String toString() {
        return "SurekliIsci{" +
                "isciStatu='" + isciStatu + '\'' +
                ", saatUcreti=" + saatUcreti +
                ", statu='" + statu + '\'' +
                ", maas=" + maas +
                ", personelNo=" + personelNo +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", adres='" + adres + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }

    public static void main(String[] args) {

        SurekliIsci surIsci1 = new SurekliIsci();
        surIsci1.personelNo = 5001;//personel class
        surIsci1.isim = "cem";//personel class
        surIsci1.soyisim="Oz";//personel class
        surIsci1.statu="Isci";//Muhasebe Class
        surIsci1.saatUcreti=11;//Muhasebe Class
        surIsci1.maas= surIsci1.maasHesapla();//Muhasebe Class

        System.out.println(surIsci1.toString());

    }//main


}//class
