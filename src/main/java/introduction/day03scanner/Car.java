package introduction.day03scanner;

public class Car {

    //Variable'lar oluşturlaım.
    public String modael = "Corolla";
    public int fiyat = 20000;

    //Method'lar oluşturma.
    //Return type void olduğunda method içinde return keyword ü kullanılmaz.
    //Eğer bir method yeni bir data üretmiyorsa belli bir sey yapıyorsa return type void olur.
    public void hareket() {
        System.out.println("Ccoralla hizli hareket eder...");

    }


    public void dur() {
        System.out.println("Coralla Güvenli bir şekilde durur...");
    }

}
