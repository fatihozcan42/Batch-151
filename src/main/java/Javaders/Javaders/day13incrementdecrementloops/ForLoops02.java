package Javaders.Javaders.day13incrementdecrementloops;

public class ForLoops02 {
    public static void main(String[] args) {

        //Example 1: Verilen bir string'de ilk 'a' harfinden onceki tum characterleri console'a yazdiriniz
        //         "I love Java"  ==> "I love J"

        String s = "I Love Java";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == 'a') {
                break;
            }
            System.out.print(ch);
        }

        System.out.println();
        //Example 2: Verilen bir String de son 'a' dan sonraki tum characterleri ters sirada yazdiriniz
        // "Germany" ==>yn

        String t = "Germany";

        for (int i = t.length()-1; i >=0; i--) {

            char k = t.charAt(i);
            if (k=='a') {
                break;

            }

            System.out.print(k);

        }












    }//main
}//class
