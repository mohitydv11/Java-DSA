package Functions;
import java.util.*;
public class SumFunc {
    public static void CalculatesSum(int a,int b){
        int sum=a+b;
        System.out.println(sum);
    }
public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int d=s.nextInt();
    int l=s.nextInt();
    CalculatesSum(d, l);
    }
    
}
