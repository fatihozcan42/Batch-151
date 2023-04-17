package Javaders.Javaders.day18constructorsstatickeyword;

public class Student {
    /*
    1) "static" class member'lar (variable + method + constructor + code blocks) tum objectler tarafindan paylasilir.
    2) static class memberlerdaki degisiklikler tum object'ler tarafidan otomatik olarak gorulur.
    3) static class memberler ayin dunyayay bagli oldugu gibi class'abaglidirlar,
        bu yuzden static variable'lara 'class variable'da denir.
    4) static class memberlerín nasil calistigini anlamak icin cizim yapip static olanlari class'a olmayanlari object'lere baglayarak
        dusunmek bu konuyu kolaylastirlir.
 5)"static" "class member"lari cagirmak icin object olusturmak gerekmez ve tavsiye edilmez.
          "non-static" "class member"lari cagirmak icin object olusturmak sarttir.     */


    public  static int numOfRegisteredStd = 0;
    public int num = 0;

    public Student() {
        numOfRegisteredStd++;
        num++;
    }

    public static void main(String[] args) {

    Student s1 = new Student();
        System.out.println(numOfRegisteredStd);//1

    Student s2 = new Student();
        System.out.println(numOfRegisteredStd);//2

    Student s3 = new Student();
    System.out.println(numOfRegisteredStd);//3

        System.out.println(s1.num);//1



    }//main

}//class
