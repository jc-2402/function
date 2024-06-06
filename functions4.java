//check if a no. id prime or not using functions
import java.util.*;
public  class functions4{
    public static boolean  isprime(int n){
        if(n ==2 ){
            return true; 
        }
        else{
            // for (int i=2 ; i<=(n-1); i++)
            for(int i=2;i<=Math.sqrt(n); i++){
                if(n%i ==0){
                    return false;
                }
            }
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter n");
        int n = s.nextInt();
        System.err.println(isprime(n));
           }
}