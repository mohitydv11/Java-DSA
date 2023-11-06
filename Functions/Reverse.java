package Functions;
import java.util.*;
public class Reverse{
    public static void RevFunc(){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        while(n>0){
            int reverse=n%10;
            System.out.print(reverse);
            n=n/10;
    }




    }
    public static void main(String[] args) {
        RevFunc();

        
    }
}