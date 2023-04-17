package practice.b151practices.day13_practice;

public class C03_Varargs {

    public static void main(String[] args) {
        // kac tane kelime verilirse verilsin
        // iclerinden en uzun olanı yazdıran bir method olusturun(varargs)

        // bu methodun access modifiers'ını default yapıp aynı packagagedeki faklı bir classdan calıstırınız

        // bu methodun access modifiers'ını protected yapıp farklı bir packadeki farklı bir classdan calıstırınız

        // bu methodun access modifiers'ını public yapıp farklı bir packadeki farklı bir classdan calıstırınız

        String str1 = "Ali";
        String str2 = "Veli";
        String str3 = "Ahmet";
        String str4 = "Abdullah";

        enUzunKelime(str1, str2, str3, str4);

    }//main

    private static void enUzunKelime(String... str) {

        String enUzunKelime="";

        for (String w : str) {
            if (w.length()> enUzunKelime.length()){
                enUzunKelime=w;
        }
    }
        System.out.println(enUzunKelime);

}

}//class
