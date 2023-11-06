package ConditionalStatements;
import java.util.*;
public class Calculater {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter value of a:");
        int a=s.nextInt();
        System.out.println("Enter value of b:");
        int b=s.nextInt();

        System.out.println("Enter the operator:");
        char operator=s.next().charAt(0);
        switch(operator){
            case '+':System.out.println(a+b);
            break;
            case '-':System.out.println(a-b);
            break;
            case '*':System.out.println(a*b);
            break;
            case '/':System.out.println(a/b);
            break;
            case '%':System.out.println(a%b);
            break;
        }


    }
    
}
