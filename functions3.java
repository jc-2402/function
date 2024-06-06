
import java.util.Scanner;

//find binomial coefficient
// nCr = n! / r! *(n-r)!
public class functions3{
    public static int factorial(int n){
        int fact = 1;
        for(int i=1; i<=n ;i++){
            fact *= i;
        }
        return fact;
    }
    public static int binomialcoefficient(int n, int r){
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int n_r_fact = factorial(n-r);
        int bc = n_fact / (r_fact * (n_r_fact));
        return bc;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter n and r");
        int n = s.nextInt();
        int r = s.nextInt();
        int bc = binomialcoefficient(n, r);
        System.out.println("binomial coefficient : "+bc);
    }
}