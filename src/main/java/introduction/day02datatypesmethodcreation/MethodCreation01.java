package introduction.day02datatypesmethodcreation;

public class MethodCreation01 {
    /*
    javada method nasıl oluşturulur?

    1) main method'un dışında oluşturulur.
    2) Access modifier + return type + method ismi + ()  + {}

    Oluşturlan methodlar nasıl kullanılır.
    1)main method'un içinden kullanılır.
    2) method'un
    ismini +() yazın
    3)işlem yapacağınız parametreler parantezin içinr koyulur.
    ==>main method static olduğu için main method içerisinde kullanacağınız her şey static olmalıdır.
     */
    public static void main(String[] args) {

        int sonuc = toplamaYap(30,60);
        System.out.println(sonuc);


        long carpmaSonucu = multiply(3,5);
        System.out.println(carpmaSonucu);

        int ucluSonuc = firsTwoMultiplyThirdAdd(2,5,8);
        System.out.println(ucluSonuc);

       double kup = getCube(5);
        System.out.println(kup);


        print("Hello World");

    }
    //ÖRNEK1: toplama işlemi yapan bir method oluşturunuz.
    public static int toplamaYap (int a, int b) {
      return a+b;
    }

    //ÖRNEK2: 2 sayıyı çarpma işlemi yapan bir method oluşturunuz.
    protected static long multiply(int a, int b){
       return a*b;


    }

    //ÖRNEK3: verilen üç sayıdan ilk ikisini çarpan ve sonuncu sayı ile toplayan bir method oluşturunuz.
    private static int firsTwoMultiplyThirdAdd (int a, int b, int c){
         return a*b+c;
    }

    //ÖRNEK 4:  verilen bir ondalık sayının küpünü hesaplayan methot oluşturup kullanınız.
    //NOTE: access modifeir eğer default yapmak istersen access madifeir yazmayınız.

    static double getCube (double a){
        return a*a*a;
    }

    // ÖRNEK 5: Girilen bir kelimeyi ekrana yazdıran bir method oluşturun ve kullanınınz.
    // Return type void olduğunda return keyword kullanılmaz.
    private static void print(String str){
        System.out.println(str);



    }


}
