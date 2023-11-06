package Functions;
import java.util.*;
public class BinToDEc {
    public static void binaryTodecimal(int binNum){
        int pow=0;
        int decNum=0;
        while(binNum>0){
            int last_digit=binNum%10;
            decNum=decNum+(last_digit*(int)Math.pow(2, pow));
            pow++;
            binNum=binNum/10;//remove last digit
}
System.out.println(decNum); 

    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        binaryTodecimal(n);
        
    }
    
}
