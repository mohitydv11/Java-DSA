package ConditionalStatements;
import java.util.*;
public class TernaryOperator {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int marks=s.nextInt();
        String ReportCard=marks>35?"Pass":"Fail";
        System.out.println(ReportCard);
        
    }
    
}
