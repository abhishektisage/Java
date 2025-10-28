import java.util.*;
public class subSet {
    public static void findSubset(String str, String ans, int i) {
       
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");  // empty subset
            } else {
                System.out.println(ans);     // print subset
            }
            return;
        }

        // YES choice — include str.charAt(i)
        findSubset(str, ans + str.charAt(i), i + 1);

        // NO choice — skip str.charAt(i)
        findSubset(str, ans, i + 1);
    }

    public static void main(String args[]) {
        String str = "abc";
        findSubset(str, "", 0); // <-- use "" not " "
    }
}
