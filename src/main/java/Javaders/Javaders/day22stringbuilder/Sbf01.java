package Javaders.Javaders.day22stringbuilder;

public class Sbf01 {
    public static void main(String[] args) {

        /*
        1) StringBuffer Java da String ureten bir Class'tir.
        2) StringBuffer, StringBuilder'e cok benzer. yani ikisi de "mutable" String verir.
        3) StringBuffer "multi-Thread"ir. ama StringBuilder  "multi-Thread" degildir.
        4) Java StringBuffer'i, StringBuilder'den once olusturdu.
        5) StringBuilder "multi-thread" olmadigi icin StringBuffer'dan daha hizli calisir.
         6)"multi-thread" yapilirken yapilan islerin siralamasi onem arzeder, yapilan isleri
          mantikli bir siraya koymak "synchronization" olarak adlandirilir.
          StringBuffer "multi-thread" oldugu icin ayni zamanda "synchronized" dir.

        3 tane Staring olusturan Class ogrendik;
        1)immutable string lazimsa; String Class
        2)mutable string lazimsa; StringBuilder veya StringBuffer
                                  i)StringBuilder'i multi-thread gerekmezse kullaniriz
                                  ii)StringBuffer'i multi-thread gerekirse kullaniriz
         */
        StringBuffer sbf1 = new StringBuffer("Java");



    }//main
}//class
