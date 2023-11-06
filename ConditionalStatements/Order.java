package ConditionalStatements;
import java.util.*;
public class Order {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int orderid=s.nextInt();
        switch(orderid){
            case 1:System.out.println("Samosa");
            break;
            case 2:System.out.println("Dosa");
            break;
            case 3:System.out.println("Burger");
            break; 
            default:System.out.println("Dosa");
        }
    }
    
}
