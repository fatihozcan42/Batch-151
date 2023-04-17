package Javaders.Javaders.day32maps;

import java.util.Arrays;
import java.util.HashMap;

public class HashMap02 {
    public static void main(String[] args) {
        //Example 1: Verilen cumledeki kelimelerin gorunmu sayisini veren kodu yaziniz
        //"I like you, like like! "  => I=1, like=3,  you=1

        String s = "I like you, like you like!";

        //like ile like! ayni yapabilmek icin tum noktalama isaretlerini sileleim.
        s = s.replaceAll("\\p{Punct}", "");
        System.out.println(s);//I like you like like

        //Kelimelerle calismaliyiz! bu yuzden split(" ") kullanmaliyiz.
        String words [] =s.split(" ");
        System.out.println(Arrays.toString(words));//[I, like, you, like, like]

        HashMap<String, Integer> occ = new HashMap<>();

        //"words" arrayindeki kelimeler birer birer Map'de var mi yok mu diye kontrol edilecek.
        //"words" arrayindeki kelimeler Map'de yoksa Map'e value'su 1 olarak yerlestirilecek.
        //"words" arrayindeki kelimeler Map'de varsa Map'e varolan value'u 1 artirilarak yerlestirilecek.

        for (String w: words) {
          Integer numOfOcccurrence = occ.get(w);
          if (numOfOcccurrence==null){
              occ.put(w,1);
          }else{
              occ.replace(w,numOfOcccurrence+1);
          }

        }
        System.out.println(occ);//{like=3, I=1, you=2}


    }//main
}//class
