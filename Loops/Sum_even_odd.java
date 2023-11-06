package Loops;
import java.util.*;
public class Sum_even_odd {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int sum=0;
        int n=s.nextInt();
        if(n%2==0){
            for(int i=2;i<n;i=i+2){
                sum=sum+i;
        }
        System.out.println(sum);
     }
        else{
            for(int i=1;i<n;i=i+2){
                sum=sum+i;
}
        System.out.println(sum);
        }
    }
}
    
