package Functions;
import java.util.*;
public class DecToBin {
    public static void DecimalToBinary(int n){
    int pow=0;
    int binNum=0;
    while(n>0){
        int rem=n%2;
        binNum=binNum+rem*(int)(Math.pow(10,pow));
pow++;
n=n/2;

    }
    System.out.println(binNum);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        DecimalToBinary(a);
        
    }
    
}
