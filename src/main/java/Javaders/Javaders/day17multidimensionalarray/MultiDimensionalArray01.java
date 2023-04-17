package Javaders.Javaders.day17multidimensionalarray;

import java.util.Arrays;

public class MultiDimensionalArray01 {
    public static void main(String[] args) {

        // Bir Array in elemanlari Array ise bu array MultiDimensional
          //MultiDimensional Array nasil oluturulur.

        int a [][] = new int[3][2];

        // MultiDimensional Array'lere eleman nasil eklenir.

        a[0][0] = 5;
        a[0][1]= 12;
        a[1][0]= 81;
        a[1][1]= 45;
        a[2][0]= 123;
        a[2][1]= 0;

        //MultiDimensional Array'leri consola yazdirmak icin deepString() methodunu kullaniriz.

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.deepToString(a));

        //MultiDimensional Array icinden specific bir eleman nasil yazdirilir.

        System.out.println(a[1][1]);

        //MultiDimensional Array icindenki Array nasil yazdirilir.

        System.out.println(Arrays.toString(a[0]));//[5,12]

        System.out.println(Arrays.toString(a[1]));//[81,45]

        // MultiDimensional Array kisa yoldan nasil olusturulur.

        String students [][] ={{"Ali","Kemal"},{"Cemal"},{"Ayhan", "Beyhan", "Seyhan"},{"Ceyhan","Kayahan"}};

        // EX: Yukaridaki students arrayinde kac tane isim oldugunu bulunuz?

        int sum = 0;

        for (String [] w:students) {
            sum = sum + w.length;
        }
        System.out.println(sum);


        //Example 2: Yukaridaki students array'inde icinde "m" olan isimleri console'a yazdiriniz?

        for (String [] w :students) {
            for (String k : w ) {

                if (k.contains("m")){
                    System.out.println(k);
                }

            }
        }
        // EX: 3 bir integer MultiDimensional elemanlarinin carpimini yaziniz.
        int nums[][] = { {5, 4}, {2, 3, 2}, {7}};
        int result = 1;


        for (int [] w: nums) {
            for ( int k :w) {
                result = result*k;
            }

        }
        System.out.println(result);


    }//main
}//class
