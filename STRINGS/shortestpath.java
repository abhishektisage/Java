import java.util.*;
public class shortestpath{
    public static float getPath(String p){
       int x=0,y=0;
       for(int i=0;i<p.length();i++){
         char dir=p.charAt(i);
         //s
         if(dir=='S'){
            y--;
         }
         //n
         else if(dir=='N'){
            y++;
         }
         //E
         else if(dir=='E'){
            x++;
         }
         //W
         else{
            x--;

         }
       }
       int X2=x*x;
       int Y2=y*y;
       return (float)Math.sqrt(X2+Y2);
    }
    public static void main(String args[]){
        String p="WNEENESENNN";
        System.out.println(getPath(p));
    }
}