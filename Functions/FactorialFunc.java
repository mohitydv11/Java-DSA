package Functions;
import java.util.Scanner;
public class FactorialFunc {
    public static int funFactorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;

        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(funFactorial(n));
        
    }
    
}
