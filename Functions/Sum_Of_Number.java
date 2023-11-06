package Functions;
import java.util.*;
public class Sum_Of_Number {
    public static void SumFunc(){
        int sum=0;
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        while(n>0){
            int lastdigit=n%10;//to find last digit
            sum=sum+lastdigit;
            n=n/10;// to remove last digit
        }
        System.out.println(sum);

    }
    public static void main(String[] args) {
        SumFunc();
        
    }
    
}
