import java.util.*;
public class Sort{
    public static void main(String args[]){
        ArrayList<Integer>list=new ArrayList<>();

        list.add(10);
        list.add(77);
        list.add(69);
        list.add(53);

        Collections.sort(list);
        System.out.print(list);  //ascending
         System.out.println();
        //descending
        Collections.sort(list,Collections.reverseOrder());
        System.out.print(list);
    }
}