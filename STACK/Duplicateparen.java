import java.util.*;

public class Duplicateparen {
    public static boolean isduplicate(String str){
        Stack<Character> s = new Stack<>();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if(ch == ')'){
                int count = 0;

                while(!s.isEmpty() && s.peek() != '('){
                    s.pop();
                    count++;
                }

                if(count < 1){
                    return true; // duplicate found
                }

                if(!s.isEmpty()){
                    s.pop(); // remove '('
                }
            }
            else{
                s.push(ch);
            }
        }

        return false; // no duplicate
    }

    public static void main(String args[]){
        String str = "(a+b(c))";
        System.out.print(isduplicate(str));
    }
}