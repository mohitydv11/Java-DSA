package Functions;
import java.util.*;
public class ProductFunc {
    public static int multiply(int a,int b){
        int product=a*b;
        return product;
    }


    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int d=s.nextInt();
        int l=s.nextInt();
        System.out.println(multiply(d, l));
    
        
    }
    
}
