package Functions;
import java.util.*;
public class Prime {
    public static boolean PrimeFun(int n){
        boolean isprime=true;
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                isprime=false;
                break;
            }

        }
        return isprime;

    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        System.out.println(PrimeFun(a));
        
    }
    
}
