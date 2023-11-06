package Loops;
import java.util.*;
public class SumOfN {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int sum=0;
        int counter=1;
        while(counter<=n){
            sum=sum+counter;
            counter++;
            
        }
        System.out.println(sum);
    }
    
}
