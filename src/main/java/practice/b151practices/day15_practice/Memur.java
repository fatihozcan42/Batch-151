package practice.b151practices.day15_practice;

public class Memur extends Muhasebe {

    @Override
    public String toString() {
        return "Memur{" +
                "saatUcreti=" + saatUcreti +
                ", statu='" + statu + '\'' +
                ", maas=" + maas +
                ", personelNo=" + personelNo +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", adres='" + adres + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
        //toString() methodu objelerin tum ozelliklerini yazdirmak icin pratik bir yontemdir.
    public static void main(String[] args) {
        Memur memur1 = new Memur();

    /*
    memur1 objesi, memur class'ının objesi olmasına ragmen
    inherit ettigi muhasebe ve onunda parent'ı olan personel
    class'larındaki tum dataları alabilir.
 */
        //Personel Class'indan
        memur1.personelNo = 1001;
        memur1.isim = "Ahmet";
        memur1.soyisim = "Tepe";
        memur1.adres = "Ankara";
        memur1.tel = "3123530577";

        //Muhasebe Class'indan
        memur1.saatUcreti = 10;
        memur1.statu = "Memur";
        memur1.maas = memur1.maasHesapla();

        System.out.println(memur1.personelNo);//1001
        System.out.println(memur1.maas);//2400
        System.out.println(memur1.toString());

        Memur memur2 = new Memur();
        memur2.personelNo=1002;//personel
        memur2.saatUcreti=10;//muhasebe
        memur2.maas = memur2.maasHesapla();
        System.out.println(memur2.toString());

        //artik bu fabrikada istedigimiz kadar memur uretebiliriz
        // urettigimiz her memur muhasebe class'i ve personel class'indaki tum ozellileri inherit etmis olur.


    }//main


}//class
