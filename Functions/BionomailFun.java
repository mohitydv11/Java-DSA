package Functions;
import java.util.*;
public class BionomailFun {
    public static int funFactorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;

        }
        return fact;
    }
    public static int bioFunc(int n,int r){
        int fact_n=funFactorial(n);
        int fact_r=funFactorial(r);
        int fact_nmr=funFactorial(n-r);
        int bioCoeff=fact_n/(fact_r*fact_nmr);
        return bioCoeff;

    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        System.out.println(bioFunc(a, b));
        
    }
    
}
