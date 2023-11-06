package Functions;
import java.util.*;
public class Even_Or_Not {
    public static boolean FunEven(int n){
        boolean isEven;
        if(n%2==0){
            isEven=true;
        }
        else{
            isEven=false;
        }
        return isEven;


    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        System.out.println(FunEven(a));
        
    }
    
}
