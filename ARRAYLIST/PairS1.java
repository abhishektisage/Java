import java.util.*;
public class PairS1{
    public static boolean pairSum(ArrayList<Integer>list,int target){
       int lp=0;
       int rp=list.size()-1;

       while(lp!=rp){
        // Case1:
        if(list.get(lp)+list.get(rp)==target){
            return true;
        }
        //case 2
        if(list.get(lp)+list.get(rp)<target){
            lp++;
        }
        else{//case 3
            rp--;
        }
        
       }
       return false;
    }
    public static void main(String args[]){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        int target=5;
    
        System.out.print(pairSum(list,target));
    }
}