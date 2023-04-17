package introduction.day03scanner;

public class Runner {

    public static void main(String[] args) {

        // Object nasıl oluşturulur.
        // Class ismi    +   Obje ismi      +    atama operaroru +   "new"  +  Constructor

           Car                 myCar                   =              new          Car();

       // "new" keyword'u sifirdan yeni bir obje oluşturmak için kullanılır.
       //Constructor Java'da nesneleri oluşturmak için kullanılan özel bir methoddur.

        System.out.println( myCar.fiyat);
        System.out.println("myCar.modael = " + myCar.modael);
        myCar.hareket();
        myCar.dur();

    Student tomHanks = new Student();

        System.out.println("tomHanks.name = " + tomHanks.name);
        System.out.println("tomHanks.address = " + tomHanks.address);
        System.out.println("tomHanks.grade = " + tomHanks.grade);
        tomHanks.study();
        tomHanks.feed();

        byte grade = tomHanks.grade;
        System.out.println("grade = " + grade);
        String name = tomHanks.name;
        System.out.println("name = " + name);

    }
}
