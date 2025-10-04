import java.util.Arrays;
public class anagram{
    public static void main(String agrs[]){
        String str1="heart";
        String str2="earth";
        
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        if(str1.length()==str2.length()){
            char str1chararr[]=str1.toCharArray();
            char str2chararr[]=str2.toCharArray();
             
             Arrays.sort(str1chararr);
             Arrays.sort(str2chararr);

             boolean result=Arrays.equals(str1chararr,str2chararr);

             if(result){
                System.out.println(str1 +"  and "+ str2 +" are anagrams");
             }
             else{
                System.out.println("strings are not anagrams of each other");
             }
        }
        else{
            System.out.println("strings are not anagrams of each other");
        }


    }
}