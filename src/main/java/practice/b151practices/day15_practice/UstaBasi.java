package practice.b151practices.day15_practice;

public class UstaBasi extends Isci{

    @Override
    public String toString() {
        return "UstaBasi{" +
                "isciStatu='" + isciStatu + '\'' +
                ", \nsaatUcreti=" + saatUcreti +
                ", \nstatu='" + statu + '\'' +
                ", \nmaas=" + maas +
                ", personelNo=" + personelNo +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", adres='" + adres + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }

    public static void main(String[] args) {

        UstaBasi ustaBasi1 =new UstaBasi();
        ustaBasi1.isim="Murat";//personel
        ustaBasi1.soyisim= "Gokcek";//personel
        ustaBasi1.saatUcreti=15;//muhaseb
        ustaBasi1.maas= ustaBasi1.maasHesapla();//muhasebe
        ustaBasi1.statu="Isci";//muhasebe
        ustaBasi1.isciStatu="Ustabasi";//isci

        ustaBasi1.mesai();// isci

        System.out.println(ustaBasi1.toString());
    }//main


}//class
