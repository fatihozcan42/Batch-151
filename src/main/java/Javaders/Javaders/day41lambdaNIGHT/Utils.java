package Javaders.Javaders.day41lambdaNIGHT;

public class Utils {
    public static int getSquare(int a){
        return a*a;
    }
    public static boolean isOdd(int a){
      return  a%2!=0;
    }

    public static int getSumOfDigit(int a){
        int sum=0;
        while (a>0){
            sum=sum+a%10;
            a=a/10;
        }
        return sum;
    }

}
