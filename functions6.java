
import java.util.Scanner;

//convert from binary to decimal
public class functions6{
    public static void bindec(int n){
        int mynum = n;
        int pow =0;
        int dec=0;
        while(n>0){
            int lastdigit = n%10;
            dec = dec + (lastdigit * (int)Math.pow( 2, pow) );
            pow++;
            n = n/10;
        }
        System.out.println("decimal of "+mynum+" is "+dec);
    }
    public static void main(String[] args) {
        bindec(101);
    }
}