package Javaders.Javaders.day22stringbuilder;

public class Student {
    //stdName "public" oldugu icin diger class'lardan ulasilabilir.
    public String stdName = "Ali Can";

    //Access Modifier'i "default" olan ile "public" olan class member'lar ayni package icinde
    //kullanildiklarinda ayni ozellikleri gosterirler.
    //Farkli farkli package'a gectiginizde, "public"olanlara ulasilabilir, "default"olanlara ulasilmaz.
    int age = 23;

    //Access Modifier'i "private" olan Class Member'lar sadece olusturulduklari class
    //icinden gorulebilirler.
    //Olusturulduklari class'in disina ciktigimizda gorunmez, ulasilmaz olurlar.

    private  String healtCondition = "Cancer";

    //Access Modifier'i "protected" olan Class Member'lar ayni package icinde iken "public"gibi davranirlar.
    ////Farkli package'a gectiginizde "protected" olanlar sadece child class'lardan gorulebilir

    protected  int salary = 3000;

    //Note: Class'lar public ve default olabilir. Ama, private ve protected olamazlar.

}//Class
