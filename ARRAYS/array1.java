import java.util.*;
public class array1{
    public static void update(int marks[]){
          for(int i=0; i<marks.length ; i++){
              marks[i]=marks[i]+2;
          }
    }
    public static void main(String args[]){
        int marks[]={37,35,16,18};
        update(marks);
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]+" ");
        }
    }
}