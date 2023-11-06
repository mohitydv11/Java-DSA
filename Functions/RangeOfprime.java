package Functions;
import java.util.*;
public class RangeOfprime {
    public static boolean PrimeFun(int n){
        boolean isprime=true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                isprime=false;
                break;
            }

        }
        return isprime;

    }
    public static void RangePrime(int n){
        for(int i=2;i<=n;i++){
            if(PrimeFun(i)==true){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        RangePrime(a);
        
    }
    
}
