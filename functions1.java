//find the product 
public class functions1{
    public static int multiple(int n , int m){
        int prod = n*m;
        return prod;
    }
    public static void main(String args[]){
        int a = 3;
        int b = 5;
        int prod = multiple(a, b);
        System.out.println("product is "+prod);
    }
}