package ConditionalStatements;
import java.util.*;
public class Age {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int age=s.nextInt();
        if(age>=18){
            System.out.println("Person is adult");
        }
        else{
            System.out.println("person is not adult");
        }
    }
    
}
