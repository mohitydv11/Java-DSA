package Loops;
import java.util.*;
public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int temp=0;
        for(int i=2;i<n;i++){
            if(n%i==0){
                temp=temp+i;
            }
        }
        if(temp>0){
            System.out.println("Not prime");
        }
        else{
            System.out.println("Prime");
        }
    }
    
}
