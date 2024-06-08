// convert from dec to bin
public class functions7{
    public static void decbin(int n){
        int mynum = n;
        int bin=0;
        int pow=0;
        while(n>0){
            int rem =n %2;
            bin = bin + (rem * (int)Math.pow(10,pow));
            pow++;
            n = n/2;
        }
        System.out.println("binary of "+mynum+" is "+bin);
    }
    public static void main(String[] args) {
        decbin(7);
    }
}