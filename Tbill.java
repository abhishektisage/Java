import java.util.*;
public class Tbill{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
            float pencil=sc.nextFloat();
            float pen=sc.nextFloat();
            float eraser=sc.nextFloat();
            float total= pencil + pen + eraser;
            System.out.println(total);
            float gstT= (total+0.18f*total);
            System.out.println(gstT);


     }

}
