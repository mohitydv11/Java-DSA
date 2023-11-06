package Variables_and_Data_Types;
import java.util.*;
public class Cost {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        float pen=s.nextFloat();
        float pencil=s.nextFloat();
        float eraser=s.nextFloat();
        float totel=pen+pencil+eraser;
        float gst=totel*0.18f;
        System.out.println("Totel without GST "+totel);
        float cost_with_gst=(totel+gst);
        System.out.println("cost with gst "+cost_with_gst);
    }
    
}
