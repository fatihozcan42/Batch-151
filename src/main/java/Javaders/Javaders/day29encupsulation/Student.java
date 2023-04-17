package Javaders.Javaders.day29encupsulation;

public class Student {
    //Encapsulation ==> kelime anlami itibari ile kapsulleme demektir
    //Encapsulation Data Hiding (==>Veri saklamak)
    //Data nasil saklanir?
    //Acces Modifierlarini private yaparak datayi diger classlardan gorunmez hale getiririm. Boylece datayi saklarim


   private String studentId = "AC2023021";
   public int age = 19;

   private double notOrt = 3.53;
   private boolean succesful= false;

    //Encapsulation yaptigimiz data yi istersek diger classlardan okuyabiliriz
    //Nasil okuruz?
    //"get method" olusturarak Encapsulate edilmis datanin degerini okuyabiliriz
    //get method lar public olur
    //get methodun return type i okudugu variable in return type i ile ayni olur
    //get method bir boolean variable icin olusturulduysa eger ismi "is" ile baslar.



    // set method kullanarak var olan object uzerinden degisikler yaparak o object i sanki yeni
    //bir object mis gibi kullanabiliriz.

    //get methodlarin diger adi "getter"; set methodlarin diger adi "setter"dir.


    public String getStudentId() {
        return studentId;
    }

    public double getNotOrt() {
        return notOrt;
    }

    public boolean isSuccesful() {
        return succesful;
    }

    //Encapsulation yaptigimiz data yi istersek diger classlardan degisterebiliriz.
    //Nasil degistiririz?
    //"set method" olusturarak Encapsulate edilmis datanin degerini degisterebiliriz.
    //          a) set methodlari her zaman "public"olur.
    //          b) set methodlarin return type her zaman void olur.
    //          c) set method parametre kullanir ve parametrenin data type variable ile olmak zaorundadir.



    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setNotOrt(double notOrt) {
        this.notOrt = notOrt;
    }

    public void setSuccesful(boolean succesful) {
        this.succesful = succesful;
    }
}//Class
