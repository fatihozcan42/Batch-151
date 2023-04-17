package Javaders.Javaders.day18constructorsstatickeyword;

public class StudentRunner {
    public static void main(String[] args) {
        //static olan "numOfRegisteredStd" variable'lerini CAGIRMAK icin sadece class ismini kullandik, object olusturmadik.

        System.out.println(Student.numOfRegisteredStd);

        Student s1 = new Student();

            // static olmayan "num" variable ni cagirmak icin object olusturduk.
        System.out.println(s1.num);

        // static olan numOfRegisteredStd variable'ina object uzerinden de ulasabiliriz ama bu bir hatadir..
        System.out.println(s1.numOfRegisteredStd);





    }//main
}//class
