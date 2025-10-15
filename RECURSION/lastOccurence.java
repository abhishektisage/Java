import java.util.*;
public class lastOccurence{
    public static int lO(int arr[],int i,int key){
        if(i==arr.length){
            return -1;
        }
        int isFound=lO(arr,i+1,key);
        if(isFound==-1&&arr[i]==key){
            return i;

        }
        return isFound;

    }
    public static void main(String args[]){
        int arr[]={1,3,4,6,7,5,4,7};
        System.out.println(lO(arr,0,7));
    }
}