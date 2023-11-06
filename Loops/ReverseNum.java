package Loops;
import java.util.*;
public class ReverseNum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        while(n>0){
        int lastdigit=n%10;
        System.out.print(lastdigit);
        n=n/10;
        }

    }
    
}
