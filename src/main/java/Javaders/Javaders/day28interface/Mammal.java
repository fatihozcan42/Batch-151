package Javaders.Javaders.day28interface;

    /*  Child ==> Parent
    1) Class ==> Class ; extends
        interface==>interface :extends
        Class==> interface : implements
        interface ==> class : olamaz
        ayni ise extends, farkli ise implements kullan.
        interface'i class'in child'i yapma.

        -------------------abstract class ile interface arasindaki farklar nelerdir-------------------
1)Abstract Class'lar hem "abstract" dem de "concrete" method'lar icerebilir fakat interface'ler sadece "abstract" method icerir
  Ama interface'lerde istersek "default" ve "static" keywordlerini kullanarak "concrete" method uretebiliriz
2)Abstract Class'lar multiple inheritance'i desteklemez ama interface'ler destekler.
3)Abstract Class'lar icinde her turlu variable olusturulabilir , interface'ler icindeki variable'lara public , stactic ve final olmak zorundadir
4)"interface" Class child' olamaz... ama "abstract class" class'in child'i olabilir
5)abstract class'larda constructor vardir ama object uretemez, interface'lerde constructor yoktur bu yuzden object uretilemez.

     */
public interface Mammal extends Animal{


    String feedBaby= "Milk";
    int age=6;


}
