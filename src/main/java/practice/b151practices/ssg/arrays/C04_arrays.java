package practice.b151practices.ssg.arrays;

public class C04_arrays {

    public static void main(String[] args) {
        /*
        5.soru Verilen bir int array'deki
        en buyuk sayiyi yazdiran bir method olusturun.
        */
        int arr[]={10,8,7,3,11,33,23};
        maxSayiYazdir(arr);
}

    public static void maxSayiYazdir(int[] arr) {
        int maxSayi = arr[0];
        for (int a:arr
        ){
            if (a>maxSayi){
                maxSayi=a;
            }
        }

        System.out.println(maxSayi);
    }
}
