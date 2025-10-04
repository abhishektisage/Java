import java.util.*;
public class binarySearch{
    public static int binaryS(int n[],int key){
        int start=0,end=n.length-1;
        
        while(start<=end){
            int mid=(start+end)/2;
            if(n[mid]==key){
                return mid;
            }
            if(n[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;

    }
    public static void main(String argd[]){
        int arr[]={2,3,5,11,8,17,9,6};
        int key=17;
        int index=binaryS(arr,key);
        System.out.println("key at index"+index);
        
    }
}