package practice.b151practices;


import java.util.Arrays;
import java.util.Scanner;

public class Deneme01 {
    public static void main(String[] args) {
        int numbers[][] = { {5, 4}, {2, 3, 2} }; // ==> { 5, 4, 2, 3, 2 }

       int toplamElemanSayisi = 0;

        for ( int [] w : numbers) {
            toplamElemanSayisi=toplamElemanSayisi+w.length;
        }
        System.out.println(toplamElemanSayisi);






        //+, -, *, /, % islemlerini yapabilen bir hesap makinasi yapiniz.
        //Kullanici "q" ya basmadigi surece islem secip yapabilsin
        //q ya basmasi durumunda "see you again" mesaji verilerek uygulama dursun
        //kullanici hesaplama operatoru disinda bir sey girmesi durumunda
        // "Undefined operation" mesaji verilerek uygulama dursun

        /*
            1)Kullanicidan data almak icin Scanner object olustur
            2)Kullanicidan yapacagi islemi almaliyiz
            3)Kullanicidan iki tane sayi almaliyiz
            4)Tekrar tekrar islem yapabilmek icin loop kullanmaliyim
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir islem giriniz\n"+" +,-,*,/,%");
        String opr = input.next();

        do{
            if(opr.toUpperCase().equals("q")){
                System.out.println("see you again");
                break;
            }

        }while(true);



        /*
    Soru-01: Pozitif bir tamsayıyı input kabul edip en büyük asal çarpanını veren bir METHOD create ediniz.
            Ör: Input : 50
            Bolenler : 2,5,10,20,50
            Asal Bolenler: 2,5
            En buyuk asal carpan: 5


        System.out.println("Sayıyı giriniz: ");
        int sayi=input.nextInt();
        int bolen=2;
        int bolunen=sayi;
        System.out.println("Asal çarpanlar: ");
        while(bolen<sayi){
            if(bolunen%bolen==0){
                System.out.println(bolen);
                bolunen/=bolen;
            }
            else{
                bolen++;
            }
        }

*/




   /* Soru-02: 100'den 0'a kadar 13'e tam bölünebilen sayıları ve toplamlarını ekrana yazdırınız (büyükten küçüğe).
             Ekran Çıktısı
             91
             78
             65
             52
             39
             26
             13
        int num = 0;
        for (int i = 100; i >0 ; i--) {
            if (i%13==0) {
                System.out.print(i+" ");
            num=num+i;
            }
        }
        System.out.println("========");
        System.out.println(num);







    //Soru-03: 0-255 e kadar olan harflerin , sayı ve harf değerini konsola yazdırınız.



           for (int i = 1; i < 256; i++) {
            char ch = (char) i;
            if (ch>='A'&& ch<='Z' || ch>='a' && ch<='z'){
                System.out.println("Harf degeri "+ch+ " Sayisal degeri "+ i);

            }
        }


    */
    //Soru-04: Girilen bir stringdeki a harfi sayısını bulunuz ama  c harfine  gelirse döngüden çıkılsın
      //       Ornek: Bugün hava oldukca güzel.-> 2

        /*String str = "Bugün hava oldukca güzel.";
       String s = str.replaceAll("[^a]","");
       int k = s.length();
        System.out.println(k);



    //Soru-05: Kullanıcıdan 5 adet sayı isteyiniz.Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.

         Scanner input = new Scanner(System.in);
        System.out.println("lutfen gireceginiz sayi adetini belirtiniz");
        int numOfElements = input.nextInt();
        int nums [] = new int [numOfElements];
        int sum = 0;

        for (int i =0; i<nums.length; i++ ){
            System.out.println("sayilari  giriniz");
            int num = input.nextInt();
            if (num>5 && num<10){
                continue;
            }else {
                sum+=num;
            }
        }
        System.out.println(sum);
*/

    //Soru-06: Bir top belirli yükseklikten atılmaktadır.
      //       Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
        //Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
          //   Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan  code blogu create ediniz.


    //Soru-07: STRING OLAN PIN kodunuzu kontrol eden ve 3 giris hakki veren bir kod yazınız.



       /* Kullanıcıya günde ne kadar çay içtiğini ve ne kadar şeker kullandığını sorun. Yılda kaç kg şeker kullandığını hesaplayın ve yazdırın.

        1 şeker = 1.7 gr
        */








     /*
    Soru-08: Verilen iki sayının kombinasyonunu bulan kodu yazınız.
             Hatırlatma C(n,r) = n! / (r!(n-r)!)
             Ekran Çıktısı
             Birinci sayıyı giriniz: 15
             Ikinci sayıyı giriniz: 4
             Kombinasyon: 1365
             Birinci sayıyı giriniz: 5
             Ikinci sayıyı giriniz: 3
             Kombinasyon: 10
    Soru-09: Verilen bir sayının faktöriyelini özyineli (recursive) olarak hespalayan fonksiyonu yazınız.
             Örnek Ekran Çıktıları
             Bir sayi giriniz: 6*5*4*3*2*1=720
             Faktöriyeli: 720
             Bir sayı giriniz: 3*2*1
             Faktöriyeli 6

         Scanner input = new Scanner(System.in);
        System.out.println("sayi girin");
        int sayi = input.nextInt();

        int sum = 1;

        for (int i =sayi; i >0 ; i--) {
            sum = sum * i;
        }
        System.out.println(sum);


    Soru-10: Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya musteri karti olup olmadigini sorun,
             Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
                          Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az alirsa %10 indirim yapin


              Scanner input = new Scanner(System.in);
        System.out.println("aldiginiz urun adedini giriniz");
        int urunadedi = input.nextInt();
        System.out.println("aldiginiz urun liste fiyatini giriniz");
        int price = input.nextInt();

        System.out.println("musteri kartiniz var mi? yes/no");
        String r = input.next();

        if (r.equalsIgnoreCase("yes")){
            if (urunadedi>10){
                int newprice =(price*urunadedi)- (price*urunadedi)*20/100;
                System.out.println("Aldiginiz urunlerin toplam fiyati "+ price*urunadedi);
                System.out.println("Aldiginiz urunlerin indirimli fiyati "+ newprice);
            }else{
                int newprice1 =(price*urunadedi)- (price*urunadedi)*15/100;
                System.out.println("Aldiginiz urunlerin toplam fiyati "+ price*urunadedi);

                System.out.println("Aldiginiz urunlerin toplam fiyati "+ newprice1);

            }

        }else{
            if (urunadedi>10){
                int newprice2 =(price*urunadedi)- (price*urunadedi)*15/100;
                System.out.println("Aldiginiz urunlerin toplam fiyati "+ price*urunadedi);

                System.out.println("Aldiginiz urunlerin indirimli toplam fiyati "+ newprice2);

            }else {
                int newprice3 =(price*urunadedi)- (price*urunadedi)*10/100;
                System.out.println("Aldiginiz urunlerin toplam fiyati "+ price*urunadedi);

                System.out.println("Aldiginiz urunlerin infirimli toplam fiyati "+ newprice3);

            }
        }

    Soru-11: Kullanıcıdan 5 sayı isteyiniz, bu sayılardan en büyüğünü bularak yazdırınız.
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bes sayi giriniz?");

        int sayi [] = new int [5];

        for (int i = 0; i < sayi.length; i++) {
            int sayi1 =input.nextInt();

             sayi[i] = sayi1;

        }
        Arrays.sort(sayi);

        System.out.println(sayi[sayi.length-1]);

    Soru-12: Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.(girilen sayı dahil)
     Scanner input = new Scanner(System.in);
        System.out.println("sayi gir");
        int num = input.nextInt();
        int k = 0;

        do {


            System.out.println(num);

            for ( int i = num; i >= 0; i--) {
                if (i % 2 == 1) {
                    System.out.println(i);
                }
            }
        }while (k==num);

    Soru-13: Kullanicinin INTEGER OLAN PIN kodunuzu kontrol eden bir kod yazınız.
      Scanner input  = new Scanner(System.in);
        System.out.println("sifrenizi giriniz");
        String password = input.next();


        boolean pass1 = password.replaceAll("[^0-9]","").length()>0;
        if (!pass1){
            System.out.println("hosgeldiniz");
        }else{
            System.out.println("sifreniz yanlis");
        }
    Soru-14: Kullanıcıda x  girilene kadar ekrana "Program çalışıyor" yazan ve x girildiğinde ise "Program bitti" yazan programı yazınız.
      Scanner input = new Scanner(System.in);
        System.out.println("to stop press x");

        do {
            String button = input.next();

            if (button.equalsIgnoreCase("x")){
                System.out.println("Program bitti");
                break;
            }else {
                System.out.println("program calisiyor");
            }

        }while (true);
    Soru-15: GİRİLEN SAYININ BASAMAKLARINDAKİ RAKAMLARIN TOPLAMINI BULUNUZ.
     Scanner input = new Scanner(System.in);
        System.out.println("Sayi giriniz");
        int sayi = input.nextInt();
        int sum = 0;
        sayi = Math.abs(sayi);


        for (int i = sayi; i >0 ; i/=10) {
            sum += i%10;

        }
        System.out.println(sum);
            */




          /*
    Soru-1: Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.
     Scanner input = new Scanner(System.in);
        System.out.println("kelime giriniz");
       String str =  input.nextLine();

       if (str.contains(" ")){
           System.out.println("bosluk bulundum");
       }else {
           System.out.println("gecerli");
       }


    Soru-2: Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız, ad ayrı soyad ayrı sekilde ekrana yazdırınız.


        Scanner input = new Scanner(System.in);
        System.out.println("ad - soyadinizi girin");
        String name = input.nextLine();

        String name1 = name.split(" ")[0];
        System.out.println(name.split(" ")[1]);
        System.out.println(name1);

        System.out.println(name.split("").length);
        System.out.println(name.replaceAll(" ", "").length());

    Soru-3: Kullanıcıdan alacağınız, 3 kelimedne oluşan ismi
            Örn. Ahmet Emin Yılmaz -> A.E.Y.  formatıyla yazdırınız.
             Scanner input = new Scanner(System.in);
        System.out.println("uc kelime giriniz");
        String str = input.nextLine();

        System.out.println(str.replaceAll(" ", "").replaceAll("[a-z]",""));




    Soru-4: Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin
    String str = "Java";
        String str1 = "";
        for (int i = str.length()-1; i >=0 ; i--) {
          char ch=  str.charAt(i);
            str1+=ch;
        }
        System.out.println(str1);
    Soru-5: String seklinde verilen asagidaki fiyatlarin toplamini bulunuz.
            String  str 1= %13.99
            String str 2= %10.55
            ipucu: Double.parseDouble() methodunu kullanabilirsiniz.

         String  str1 = "%13.99";
        String str2 = "%10.55";
        str1 = str1.replaceAll("%","" );
        str2 = str2.replaceAll("%","");

        Double totalPrice = Double.valueOf(str1) + Double.valueOf(str2);
        System.out.println("Total Price = " + totalPrice);



    Soru-6: Kullanıcıdan bir e-posta adresi girmesini isteyin, ardından "hotmail" içeriyorsa, "gmail" ile değiştirin,
            örneğin: johnbrown@hotmail.com ==> johnbrown@gmail.com

        Scanner input = new Scanner(System.in);
        System.out.println("E-mail adresini giriniz...");
        String mail = input.next();

        if (mail.contains("hotmail")){
            mail = mail.replaceAll("hotmail","gmail");

        }
        System.out.println(mail);

    Soru-7: Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir,
            ternary kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
            Test data: ali eme all
    Soru-8: Kulanicidan bir kelime isteyin eger kelime 3 ve daha fazla harfden olusuyorsa son
            iki harfini 3 kere yan yana yazdirin. degil ise girilen kelimeyi yazdirin
            ornek:
            input = Ali
            output = lilili
            input = el
            output = el
    Soru-9: StringMethods:
				cift uzunlukta bir degiskenin ilk yarisini konsolda yazdirmak icin bir Java programi yaziniz.
	    	    ORNEK:
		     	INPUT      :  Python
				OUTPUT :   Pyt
				String str = "Python";
        if (str.length()%2==0){
            str = str.substring(0,3).toUpperCase();
            System.out.println(str);

      }


    Soru-10: Kullanıcıdan aldığınız  Adı, Soyadı ve kredi kartı numaralarını aşağıdaki gibi özel forma dönüştürün
            Kredi kartı numarasını kontrol edin, yoksa 16 haneden küçük olursa   "Geçersiz kredi kartı numarası" yazdırın.
            input : John White 1234234534561478
            output: Ad : J*** Soyad :W**** kartNo:***********1478 (Adın baş harfleri ve soyadı büyük olmalıdır)
    Soru-11: Asagidaki String degiskenini kullanarak  konsolda A L i yazdiriniz.
		    String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		    String str = pickName.charAt(0)+" "+ pickName.charAt(11)+" "+pickName.toLowerCase().charAt(8);
        System.out.println(str);


    Soru-12: Kullanicidan email girmesini isteyin
             @ isareti icermiyorsa "gecerli bir email girin" yazdirin
             @ isaretinden sonra sadece "gmail.com" yaziyorsa "email onaylandi" yazdirin
             @ isaretinden sonra "gmail.com" disinda birsey yaziyorsa "Lutfen gmail hesabinizi girin" yazdirin
             ORNEK:
            INPUT : techproed.com OUTPUT : "gecerli bir email girin "
            INPUT : techproed@gmail.com OUTPUT :  "email onaylandi "
            INPUT : techproed@hotmail.com OUTPUT : "Lutfen gmail hesabinizi girin"

 Scanner input = new Scanner(System.in);
        System.out.println("lutfen email giriniz");
        String str = input.next();

       boolean r1 = str.contains("@");
       boolean r2 = str.contains("@gmail.com");
       if (!r1){
           System.out.println("gecerli bir email girin");
       }else if (r2){
           System.out.println("email onaylandi");
       }else {
           System.out.println("Lutfen gmail hesabinizi girin");
       }

          */







    }//main



    
}//Class