//print all prime in a range
import java.util.*;
public  class  functions5{
    public static void primeinrange(int n)  {
        for(int i = 2; i<=n; i++){
           if( isprime(i) ){
            System.out.print(i+", ");
           }
        }
        System.err.println();
    }
    public static boolean isprime(int n){
        if(n==2){
            return true;
        }
        
            for(int i=2; i<=Math.sqrt(n); i++){
                if(n%i ==0){
                    return  false;
                }
            }
            return  true;
        
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter range");
        int n = s.nextInt();
        primeinrange(n);
    }
}