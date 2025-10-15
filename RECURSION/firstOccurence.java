import java.util.*;
public class firstOccurence{
    public static int fO(int arr[],int i,int key){
          if(i==arr.length){
            return -1;
          }
          if(arr[i]==key){
            return i;
          }
          return fO(arr,i+1,key);
    }
    public static void main(String args[]){
        int arr[]={1,3,4,6,7,5,4,7};
        System.out.println(fO(arr,0,7));
    }
}