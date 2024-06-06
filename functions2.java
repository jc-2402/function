//find factorial of n 
//n! 
import java.util.*;
public class functions2{
    public static int factorial(int n){
        int fact =1;
        for(int i =1 ; i<=n ; i++){
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("enter value of n");
        int n = s.nextInt();
        System.out.println("factorial of "+n+" is "+factorial(n));
    }
}