import java.util.*;
public class max{
    public static void main(String args[]){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(45);
        list.add(7);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            if(max<list.get(i)){
                max=list.get(i);
            }
        }
        System.out.print("Max ele"+" "+ max);
    }
}