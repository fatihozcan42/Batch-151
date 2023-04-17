package practice.b151practices.day12_practice;

public class C01 {

    String isim = "Hasim";
    int yas = 20;

    public C01(String isim, int yas) {
        this.isim=isim;
        this.yas=yas;
    }

    public C01() {

    }

    public static void main(String[] args) {

        C01 obj1 = new C01("Nuri", 25);
        System.out.println(obj1.isim + " " + obj1.yas);

        C01 obj2 = new C01();   //Her Class'ta default consturactor vardir
                                // fakat biz bulundugumuz class'ta kendimiz bir consturactor olusturursak bu durumda default
                                // consturactor silinir.
        System.out.println(obj2.isim+ " "+ obj2.yas);

    }//main

}//Class
