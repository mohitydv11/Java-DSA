package Functions;
import java.util.*;
public class AverageOfThree {
    public static void Average(int a,int b,int c){
        int average=(a+b+c)/3;
        System.out.println(average);


    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        Average(a, b, c);
        
    }
    
}
